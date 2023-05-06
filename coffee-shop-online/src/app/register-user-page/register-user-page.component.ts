import { Component, OnInit } from '@angular/core';
import { User } from '../model/user';
import { UserService } from '../service/user-service.service';
import { ActivatedRoute, Router } from '@angular/router';


@Component({
  selector: 'register-user-page',
  templateUrl: './register-user-page.component.html',
  styleUrls: ['./register-user-page.component.css']
})
export class RegisterUserPageComponent {

  user: User;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private userService: UserService) {
      this.user = new User();
    }

  onSubmit() {
    this.userService.save(this.user);
  }

}
