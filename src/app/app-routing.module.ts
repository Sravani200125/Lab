
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppointmentComponent } from './appointment/appointment.component';
import { BookappComponent } from './customer/bookapp/bookapp.component';
import { CustomerComponent } from './customer/customer.component';
import { AllComponent } from './doctor/all/all.component';
import { CreateComponent } from './doctor/create/create.component';
import { DoctorComponent } from './doctor/doctor.component';
import { UpdateComponent } from './doctor/update/update.component';

const routes: Routes = [
  { path: 'view', component: AppointmentComponent },
  { 
    path: 'customer', component:CustomerComponent,
    children: [
      {path:'bookapp',component: BookappComponent}] 
  },
  {
    path: 'doctor', component: DoctorComponent,
    children: [
      { path: 'add', component: CreateComponent },
      { path: 'all', component: AllComponent },
      { path: 'update/:doctorId', component: UpdateComponent}]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
