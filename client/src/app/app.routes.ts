
import { SignupComponent} from './signup/signup.component';
import { OrderComponent } from './order/order.component';

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component'; // Adjust the path if necessary


export const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'register', component: SignupComponent },
  { path: 'track-order', component: OrderComponent },
  { path: '', redirectTo: '/login', pathMatch: 'full' } // Default route to login
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule] // Ensure this exports RouterModule
})
export class AppRoutingModule { }
