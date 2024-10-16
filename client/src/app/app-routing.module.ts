import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { OrderComponent } from './order/order.component';   // Adjust path if necessary
import { SignupComponent } from './signup/signup.component'; // Adjust path if necessary
import { LoginComponent } from './login/login.component';   // Adjust path if necessary

const routes: Routes = [
  { path: 'order', component: OrderComponent },   // Route for order page
  { path: 'signup', component: SignupComponent }, // Route for signup page
  { path: 'login', component: LoginComponent },   // Route for login page
  { path: '', redirectTo: '/login', pathMatch: 'full' } // Default redirect to login page
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],  // Root routing module
  exports: [RouterModule]
})
export class AppRoutingModule {}
