import { AppComponent } from './app.component';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';


import { AdminLoginComponent } from './admin-login/admin-login.component';
import { UserLoginPageComponent } from './user-login-page/user-login-page.component';
import { RegisterUserPageComponent } from './register-user-page/register-user-page.component';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  { path: 'admin-login', component: AdminLoginComponent },
  { path: 'user-login', component: UserLoginPageComponent},
  { path: 'register-user', component: RegisterUserPageComponent}
];


@NgModule({
  declarations: [
    AppComponent,
    AdminLoginComponent,
    UserLoginPageComponent,
    RegisterUserPageComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})

export class AppModule { }
