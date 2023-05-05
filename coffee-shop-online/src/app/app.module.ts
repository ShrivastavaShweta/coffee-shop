import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { UserLoginPageComponent } from './user-login-page/user-login-page.component';
import { RegisterUserPageComponent } from './register-user-page/register-user-page.component';
import { HomePageComponent } from './home-page/home-page.component';

const routes: Routes = [
  { path: 'admin-login', component: AdminLoginComponent },
  { path: 'home-page', component:HomePageComponent}
  { path:'register-user', component:RegisterUserPageComponent},
  { path:'user-login', component:UserLoginPageComponent }
]
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
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
