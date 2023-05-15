import { Component, OnInit } from '@angular/core';
import { User } from '../model/user';
import { UserService } from '../service/user-service.service';
import { HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'app-register-user-page',
  templateUrl: './register-user-page.component.html',
  styleUrls: ['./register-user-page.component.css']
})
export class RegisterUserPageComponent implements OnInit {

  _user: User = new User();
  private _userService: UserService;
  private http: HttpClient;

  constructor(
    userService: UserService, http: HttpClient) {
      this._userService = userService;
      this.http = http;
      http.get('token').subscribe(data => {
        const token = data['token'];
        http.get('http://localhost:8080', {headers : new HttpHeaders().set('X-Auth-Token', token)}).subscribe(response => this._user);
      }, () => {});
    }

  ngOnInit(): void {
  }

  public async onSubmit() {
    this._userService.save(this._user).subscribe(data =>{
      alert("Registration successful");
    }, error => alert("Please enter correct information"));
  }

//   async onSubmit() {
//     let response = await fetch('http://localhost:8080', {
//       method: 'POST',
//       headers: {
//         'Content-Type': 'application/json',
//         'Access-Control-Allow-Origin': 'http://localhost:4200/*',
//         'Access-Control-Allow-Methods': '*'
//       },
//       body: JSON.stringify(this.user),
//     });
//     let payload = await response.json();
//     console.log("Response received with payload: ", payload);
//   }

}
