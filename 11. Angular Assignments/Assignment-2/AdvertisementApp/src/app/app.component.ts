import { Component, OnInit,ViewChild } from '@angular/core';
import {MatPaginator} from '@angular/material/paginator';
import {MatSort} from '@angular/material/sort';
import {MatTableDataSource} from '@angular/material/table';
import {MatDialog, MAT_DIALOG_DATA} from '@angular/material/dialog';
import { AddAdvertisementComponent } from './Components/add-advertisement/add-advertisement.component';
import { ApiService } from './Services/api.service';
import { RouterLinkWithHref } from '@angular/router';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'AdvertisementApp';

  displayedColumns: string[] = ['addTitle', 'addName', 'date','category', 'description','action'];
  dataSource!: MatTableDataSource<any>;

  @ViewChild(MatPaginator)
  paginator!: MatPaginator;
  @ViewChild(MatSort)
  sort!: MatSort;
  
  constructor(private dialog: MatDialog,private api: ApiService){
    
  }
  ngOnInit(): void {
    this.getAllAdd();
  }

  openDialog() {
    this.dialog.open(AddAdvertisementComponent, {
      width:"30%"
    }).afterClosed().subscribe(val=>{
      if(val === "save"){
        this.getAllAdd();
      }
    })
  }

  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();

    if (this.dataSource.paginator) {
      this.dataSource.paginator.firstPage();
    }
  }

  getAllAdd(){
    this.api.getAdd()
    .subscribe(
      {
        next:(res)=>{
          this.dataSource = new MatTableDataSource(res);
          this.dataSource.paginator = this.paginator;
          this.dataSource.sort = this.sort;
        },
        error: (err)=>{
          alert("Error while fetching the records!!");
        }
      }
      
    )
  }

  editAdd(row: any){
    this.dialog.open(AddAdvertisementComponent,(
      {
        width: "30%",
        data: row
      }
    )).afterClosed().subscribe(val=>{
      if(val === "Update"){
        this.getAllAdd();
      }
    })
  }
  deleteAdd(id:number){
    this.api.deleteAdd(id)
    .subscribe({
      next:(res)=>{
        alert("Advertisement Deleted Successfully!");
        this.getAllAdd();
      },
      error: (err) =>{
        alert("Error Occured while deleting the record!");
      }
    })
  }
}
