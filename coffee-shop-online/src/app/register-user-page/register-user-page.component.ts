import { Component, OnInit } from '@angular/core';
import { User } from '../model/user';
import { UserService } from '../service/user-service.service';

@Component({
  selector: 'app-register-user-page',
  templateUrl: './register-user-page.component.html',
  styleUrls: ['./register-user-page.component.css']
})
export class RegisterUserPageComponent implements OnInit {

  user: User = new User();

  constructor(
    private userService: UserService) {    }

  ngOnInit(): void {
  }

//   onSubmit() {
//     this.userService.save(this.user).subscribe(data =>{
//       alert("Registration successful");
//     }, error => alert("Please enter correct information"));
//   }

  async onSubmit() {
    let response = await fetch('http://localhost:8080', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
        'Access-Control-Allow-Origin': 'http://localhost:4200/register-user'
      },
      body: JSON.stringify(this.user),
    });
    let payload = await response.json();
    console.log("Response received with payload: ", payload);
  }

}
