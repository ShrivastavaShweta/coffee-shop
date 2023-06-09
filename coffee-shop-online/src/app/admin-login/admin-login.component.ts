import { Component, OnInit } from '@angular/core';
import { Admin } from '../model/admin';
import { LoginAdminService } from '../service/login-admin.service';

@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent implements OnInit {

  admin: Admin = new Admin();
  constructor(private loginAdminService: LoginAdminService) { }

  ngOnInit(): void {
  }

  adminLogin(){
    //console.log(this.admin);
    this.loginAdminService.loginAdmin(this.admin).subscribe(data =>{
      alert("Login successful");
    }, errror => alert("Please enter correct user Id and password"));
  }
}
