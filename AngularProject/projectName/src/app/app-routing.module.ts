import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponentComponent } from './home/home-component.component';
import { ResidencesComponent } from './residences/residence-component/residences.component';
import { ResidenceDetailsComponentComponent } from './residences/residence-details-component/residence-details-component.component';
import { AddResidenceComponentComponent } from './residences/add-residence-component/add-residence-component.component';
import { NotFoundComponentComponent } from './not-found-component/not-found-component.component';

const routes: Routes = [ {path: 'home', component: HomeComponentComponent},
  {path: 'residences', component: ResidencesComponent },
  {path: 'residencesDetail/:id', component: ResidenceDetailsComponentComponent},
  { path: '', redirectTo: '/residences', pathMatch: 'full' } ,
  { path: 'add-residence/:id', component:AddResidenceComponentComponent},
 {path: '**', component: NotFoundComponentComponent}//+

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}


