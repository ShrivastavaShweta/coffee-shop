import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { AdminLoginComponent } from './admin-login/admin-login.component';
import { UserLoginPageComponent } from './user-login-page/user-login-page.component';
import { RegisterUserPageComponent } from './register-user-page/register-user-page.component';
import { HomePageComponent } from './home-page/home-page.component';


const routes: Routes = [
  { path: 'admin-login', component: AdminLoginComponent },
  { path: '/', component: HomePageComponent },
  { path:'register-user', component: RegisterUserPageComponent },
  { path:'user-login', component: UserLoginPageComponent }
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
