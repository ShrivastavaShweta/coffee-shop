import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { UserService } from '../service/user-service.service';
import { User } from '../model/user';

@Component({
  selector: 'app-register-user-page',
  templateUrl: './register-user-page.component.html',
  styleUrls: ['./register-user-page.component.css']
})
export class RegisterUserPageComponent implements OnInit {

  user: User;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private userService: UserService) {
      this.user = new User();
    }

  ngOnInit(): void {
    }

  onSubmit() {
    this.userService.save(this.user).subscribe(data =>{
      alert("Registration successful");
    }, error => alert("Please enter correct information"));
  }

}
