import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { Routes, RouterModule } from '@angular/router';
import { UserLoginPageComponent } from './user-login-page/user-login-page.component';
import { RegisterUserPageComponent } from './register-user-page/register-user-page.component';
import { UserHomepageComponent } from './user-homepage/user-homepage.component';

const routes: Routes = [
  { path: 'admin-login', component: AdminLoginComponent },
  { path: 'user-homepage', component: UserHomepageComponent },
];


@NgModule({
  declarations: [
    AppComponent,
    AdminLoginComponent,
    UserLoginPageComponent,
    RegisterUserPageComponent,
    UserHomepageComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
