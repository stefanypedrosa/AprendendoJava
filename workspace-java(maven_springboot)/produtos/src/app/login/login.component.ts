import { Component, OnInit } from '@angular/core';
import { usuario } from '../model/usuario';
import { ServicosService } from '../service/servicos.service';
import { Router } from '@angular/router';
import { Token } from '../model/token';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  private mensagem: boolean = false;
  private usuario: usuario = new usuario();

  constructor(private srv: ServicosService, private router: Router) { }

  ngOnInit() {
    if (localStorage.getItem("TOKEN")) {
      this.router.navigate(['/listagem'])
    }
  }

  enviar(){
    this.mensagem = false;
    this.srv.autenticar(this.usuario).subscribe(
      (res:Token)=>{
        localStorage.setItem("TOKEN",res.token);
        this.router.navigate(['/listagem']);
      },
      (error)=>{
        this.mensagem = true;
        this.usuario.email = "";
        this.usuario.senha = "";
      }
    );
  }
}
