import { HttpClient } from '@angular/common/http';
import { identifierName } from '@angular/compiler';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http : HttpClient) { }

  postRestaurant(data:any){
    return this.http.post<any>("http://localhost:3000/addList/",data);
  }

  getProduct(){
    return this.http.get<any>("http://localhost:3000/addList/");
  }

  putRestaurant(id: number,data:any){
    return this.http.put<any>("http://localhost:3000/addList/"+id,data);
  }

  deleteRestaurant(id: number){
    return this.http.delete<any>("http://localhost:3000/addList/"+id);
  }
}
