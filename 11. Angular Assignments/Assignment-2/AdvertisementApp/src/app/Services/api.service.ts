import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http: HttpClient) { }

  postAdd(data: any){
    return this.http.post<any>("http://localhost:3000/addList/",data);
  }

  getAdd(){
    return this.http.get<any>("http://localhost:3000/addList/");
  }

  putAdd(data:any, id: number){
    return this.http.put<any>("http://localhost:3000/addList/"+id,data);
  }

  deleteAdd(id: number){
    return this.http.delete<any>("http://localhost:3000/addList/"+id);
  }
}
