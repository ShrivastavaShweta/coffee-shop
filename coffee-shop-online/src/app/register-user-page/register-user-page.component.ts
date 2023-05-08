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

  onSubmit() {
    this.userService.save(this.user).subscribe(data =>{
      alert("Registration successful");
    }, error => alert("Please enter correct information"));
  }

}
