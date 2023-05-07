import { Component, OnInit } from '@angular/core';
import { Admin } from '../admin';
import { LoginAdminService } from '../login-admin.service';

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
    }, error => alert("Please enter correct user Id and password"));
  }
}
