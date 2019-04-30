import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { BikeListComponent } from './bike-list/bike-list.component';
import { MatButtonModule, MatCardModule, MatInputModule, MatListModule, MatToolbarModule } from '@angular/material';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { BOMHeaderComponent } from './BOMHeaderFile/BOMHeader.component';
import { BikedetailsComponent } from './bikedetails/bikedetails.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';
//used to create fake backend
import { fakeBackendProvider } from './shared/_helpers/fake.backend.interceptor';
import { BasicAuthInterceptor } from './shared/_helpers/basic.auth.interceptor';
import { ErrorInterceptor } from './shared/_helpers/error.interceptor';
import { ReactiveFormsModule } from '@angular/forms';

import {AuthGuard} from './shared/_guard/auth.guard';
import {AlertService} from './shared/_services/alert.service';
import {AuthenticationService} from './shared/_services/authentication.service';
import {UserService} from './shared/_services/user.service';


@NgModule({
  declarations: [
    AppComponent,
    BikeListComponent,
    BOMHeaderComponent,
    BikedetailsComponent,
    LoginComponent,
    HomeComponent,
    RegisterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    MatButtonModule,
    MatCardModule,
    MatInputModule,
    MatListModule,
    MatToolbarModule,
    BrowserAnimationsModule,
    ReactiveFormsModule
  ],
  providers: [
    AuthGuard,
    AlertService,
    AuthenticationService,
    UserService,
    {
      provide: HTTP_INTERCEPTORS,
      useClass: BasicAuthInterceptor,
      multi: true
    },
    {
      provide: HTTP_INTERCEPTORS,
      useClass: ErrorInterceptor,
      multi: true
    },

    // provider used to create fake backend
    fakeBackendProvider
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
