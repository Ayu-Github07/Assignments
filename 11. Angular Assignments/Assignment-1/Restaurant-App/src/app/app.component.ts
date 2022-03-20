import { Component, OnInit,ViewChild } from '@angular/core';
import {MatDialog, MAT_DIALOG_DATA} from '@angular/material/dialog';
import { AddRestaurantComponent } from './components/add-restaurant/add-restaurant.component';
import { ApiService } from './services/api.service';
import {MatPaginator} from '@angular/material/paginator';
import {MatSort} from '@angular/material/sort';
import {MatTableDataSource} from '@angular/material/table';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'Restaurant-App';

  displayedColumns: string[] = ["id","restaurantName", "ownerName", 'location',"speciality","type","action"];
  dataSource!: MatTableDataSource<any>;

  @ViewChild(MatPaginator) paginator!: MatPaginator;
  @ViewChild(MatSort) sort!: MatSort;

  constructor(private dialog: MatDialog,private api : ApiService){

  }
  ngOnInit(): void {
    this.getAllRestaurants();
  }
  
  openDialog() {
    this.dialog.open(AddRestaurantComponent, {
      width: "30%"
    }).afterClosed().subscribe(val=>{
      if(val === "save"){
        this.getAllRestaurants();
      }
    });
  }
  
  getAllRestaurants(){
    this.api.getProduct()
    .subscribe({
      next:(res)=>{
        this.dataSource = new MatTableDataSource(res);
        this.dataSource.paginator = this.paginator;
        this.dataSource.sort = this.sort;
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
  editRestaurant(row: any){
    this.dialog.open(AddRestaurantComponent,(
      {
        width: "30%",
        data: row
      }
    )).afterClosed().subscribe(val=>{
      if(val === "Update"){
        this.getAllRestaurants();
      }
    })
  }

  deleteRestaurant(id: number){
    this.api.deleteRestaurant(id)
    .subscribe({
      next: (res)=>{
        alert("Restaurant Deleted Successfully!!");
        this.getAllRestaurants();
      },
      error: ()=>{
        alert("Something went wrong!! ");
      }
    })
  }
}
