import { HttpClient} from '@angular/common/http';
import { Injectable } from '@angular/core'
import { User } from '../model/user';
import { Observable } from 'rxjs'

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private usersUrl = 'http://localhost:4200';

  constructor(private http: HttpClient) {  }

  public save(user: User) {
    return this.http.post<User>(this.usersUrl+"/register-user", user);
  }

  public findAll(): Observable<User[]> {
    return this.http.get<User[]>(this.usersUrl)
  }
}
