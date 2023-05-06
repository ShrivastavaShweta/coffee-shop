import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { UserLoginPageComponent } from './user-login-page/user-login-page.component';
import { RegisterUserPageComponent } from './register-user-page/register-user-page.component';
import { HomePageComponent } from './home-page/home-page.component';
import { UserService } from './service/user-service.service';

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
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
