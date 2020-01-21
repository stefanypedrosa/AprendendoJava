import { Component, OnInit } from '@angular/core';
import { usuario } from '../model/usuario';
import { ServicosService } from '../service/servicos.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-listagem',
  templateUrl: './listagem.component.html',
  styleUrls: ['./listagem.component.css']
})
export class ListagemComponent implements OnInit {

  lista:usuario[];
  constructor(private srv:ServicosService, private route:Router) { }

  ngOnInit() {
    if(localStorage.getItem("TOKEN")){
      this.srv.getProdutos().subscribe((res:usuario[])=>{
        this.lista = res;
      },
      (error)=>{
        this.route.navigate(['/login'])
      }
      );
    }
    else{
      this.route.navigate(['/login']);
    }
  }
}