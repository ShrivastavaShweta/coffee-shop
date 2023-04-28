import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';

import { RegisterUserPageComponent } from './register-user-page/register-user-page.component';
import { UserLoginPageComponent } from './user-login-page/user-login-page.component';


const routes:Routes=[
  { path:'register', component:RegisterUserPageComponent},
  { path:'user-login', component:UserLoginPageComponent }
]
@NgModule({
  declarations: [
    AppComponent,
    AdminLoginComponent,
    RegisterUserPageComponent,
    UserLoginPageComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
