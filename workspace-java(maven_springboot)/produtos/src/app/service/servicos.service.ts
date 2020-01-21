import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { usuario } from './../model/usuario';

@Injectable({
  providedIn: 'root'
})
export class ServicosService {

  constructor(private http:HttpClient) { }

  public autenticar(usuario:usuario){
    return this.http.post("http://localhost:8080/login",usuario);
  }
  
  public getProdutos(){
    let token = localStorage.getItem("TOKEN");
    return this.http.get("http://localhost:8080/listagem?token="+token)
  }
  
}
