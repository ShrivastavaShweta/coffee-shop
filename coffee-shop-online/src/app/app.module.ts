import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';


import { AppComponent } from './app.component';
import { UserLoginPageComponent } from './user-login-page/user-login-page.component';
import { RegisterUserPageComponent } from './register-user-page/register-user-page.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  { path: 'user-login', component: UserLoginPageComponent },
  { path: 'register-user', component: RegisterUserPageComponent },
  { path: 'admin-login', component: AdminLoginComponent }
];


@NgModule({
  declarations: [
    AppComponent,
    UserLoginPageComponent,
    RegisterUserPageComponent,
    AdminLoginComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

