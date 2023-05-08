import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Routes, RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { UserLoginPageComponent } from './user-login-page/user-login-page.component';
import { RegisterUserPageComponent } from './register-user-page/register-user-page.component';
import { HomePageComponent } from './home-page/home-page.component';
import { UserService } from './service/user-service.service';
import { LoginAdminService } from './login-admin.service';

@NgModule({
  declarations: [
    AppComponent,
    AdminLoginComponent,
    UserLoginPageComponent,
    RegisterUserPageComponent,
    HomePageComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      { path: 'admin-login', component: AdminLoginComponent },
      { path: '', component: HomePageComponent },
      { path:'register-user', component: RegisterUserPageComponent },
      { path:'user-login', component: UserLoginPageComponent }
    ]),
  ],
  providers: [UserService, LoginAdminService],
  bootstrap: [AppComponent]
})
export class AppModule { }
