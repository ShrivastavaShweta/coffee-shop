import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { Routes, RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { UserLoginPageComponent } from './user-login-page/user-login-page.component';
import { RegisterUserPageComponent } from './register-user-page/register-user-page.component';
import { HomePageComponent } from './home-page/home-page.component';

import { UserHomepageComponent } from './user-homepage/user-homepage.component';



const routes: Routes = [
  { path: 'admin-login', component: AdminLoginComponent },
  { path: 'home-page', component:HomePageComponent},
  { path:'register-user', component:RegisterUserPageComponent},
  { path:'user-login', component:UserLoginPageComponent },
  { path: 'user-homepage', component: UserHomepageComponent },

  { path:'user-login', component:UserLoginPageComponent }
]
@NgModule({
  declarations: [
    AppComponent,
    AdminLoginComponent,
    UserLoginPageComponent,
    RegisterUserPageComponent,

    HomePageComponent,
    UserHomepageComponent,
    HomePageComponent

  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }