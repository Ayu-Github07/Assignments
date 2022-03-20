import { Component, Inject, OnInit } from '@angular/core';
import { Form, FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ApiService } from 'src/app/services/api.service';
import {MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog';

@Component({
  selector: 'app-add-restaurant',
  templateUrl: './add-restaurant.component.html',
  styleUrls: ['./add-restaurant.component.css']
})
export class AddRestaurantComponent implements OnInit {

  restaurantForm!: FormGroup;
  title:string = "Add New Restaurant";
  btnAction:string = "Save";
  constructor(private formBuilder: FormBuilder,private api: ApiService,
  @Inject(MAT_DIALOG_DATA) public editData:any,
  private dialogRef : MatDialogRef<AddRestaurantComponent>) { }

  ngOnInit(): void {

    this.restaurantForm = this.formBuilder.group(
      {
        restaurantName : ['',Validators.required],
        ownerName : ['',Validators.required],
        location : ['',Validators.required],
        speciality : ['',Validators.required],
        type : ['',Validators.required]
      }
    )
    
    if(this.editData){
      this.title = "Update Existing Restaurant";
      this.btnAction = "Update";
      this.restaurantForm.controls['restaurantName'].setValue(this.editData.restaurantName);
      this.restaurantForm.controls['ownerName'].setValue(this.editData.ownerName);
      this.restaurantForm.controls['location'].setValue(this.editData.location);
      this.restaurantForm.controls['speciality'].setValue(this.editData.speciality);
      this.restaurantForm.controls['type'].setValue(this.editData.type);
    }
  }

  addRestaurant(){
    if(!this.editData){
      if(this.restaurantForm.valid){
        this.api.postRestaurant(this.restaurantForm.value)
        .subscribe(
          {
            next:(res)=>{
              alert("Restaurant Added Successfully!!");
              this.restaurantForm.reset;
              this.dialogRef.close();
            },
            error : ()=>{
              alert("Something Went Wrong While Adding Data!!");
            }
          }
        )
      }
    }else{
      this.updateRestaurant();
    }
  }

  updateRestaurant(){
    this.api.putRestaurant(this.editData.id,this.restaurantForm.value)
    .subscribe({
      next: (res)=>{
        alert("Restaurant Updated Successfully!!");
        this.restaurantForm.reset();
        this.dialogRef.close("Update");
      },
      error: ()=>{
        alert("Something Went Wrong!!");
      }
    })
  }

}
