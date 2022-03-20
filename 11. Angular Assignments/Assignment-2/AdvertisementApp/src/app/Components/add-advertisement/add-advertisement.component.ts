import { Component, Inject, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ApiService } from 'src/app/Services/api.service';
import {MatDialogRef,MAT_DIALOG_DATA} from '@angular/material/dialog';

@Component({
  selector: 'app-add-advertisement',
  templateUrl: './add-advertisement.component.html',
  styleUrls: ['./add-advertisement.component.css']
})
export class AddAdvertisementComponent implements OnInit {

  addvertisementForm!: FormGroup;
  actionBtn : string = "Save";
  title: string = "Add New Advertisement";

  constructor(private formBuilder: FormBuilder,private api : ApiService,private dialogRef : MatDialogRef< AddAdvertisementComponent>,@Inject(MAT_DIALOG_DATA) public editData: any) { }

  ngOnInit(): void {

    this.addvertisementForm = this.formBuilder.group(
      {
        addTitle : ['',Validators.required],
        addName : ['',Validators.required],
        date : ['',Validators.required],
        category : ['',Validators.required],
        description : ['']
      }
    );
    
    if(this.editData){
      this.title = "Update Existing Advertisement";
      this.actionBtn = "Update";
      this.addvertisementForm.controls['addTitle'].setValue(this.editData.addTitle);
      this.addvertisementForm.controls['addName'].setValue(this.editData.addName);
      this.addvertisementForm.controls['date'].setValue(this.editData.date);
      this.addvertisementForm.controls['category'].setValue(this.editData.category);
      this.addvertisementForm.controls['description'].setValue(this.editData.description);
    }
  }
  addAddvertisement(){
     if(!this.editData){
      if(this.addvertisementForm.valid){
        this.api.postAdd(this.addvertisementForm.value).subscribe({
          next : (res)=>{
            alert("Advertisement Added Successfully!");
            this.addvertisementForm.reset();
            this.dialogRef.close('save');
          },
          error: ()=>{
            alert("Error Occurred While Adding The Add");
            
          }
        })
      }
     }else{
       console.log(this.editData.value);
       this.updateAdd();
     }
  }

  updateAdd(){
    this.api.putAdd(this.addvertisementForm.value,this.editData.id)
    .subscribe({
      next:(res)=>{
        alert("Advertisement Updated Successfully!");
        this.addvertisementForm.reset();
        this.dialogRef.close("Update");
      },
      error: (err) => {
        alert("Error Occured while updating the record!!");
      }
    })
  }

  deleteAdd(){
    this.api.deleteAdd(this.editData.id)
    .subscribe({
      next:(res)=>{
        alert("Advertisement Deleted Successfully!");
      },
      error: (err) =>{
        alert("Error Occured while deleting the record!");
      }
    })
  }
}


