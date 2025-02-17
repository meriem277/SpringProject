import { NgModule } from '@angular/core';

import { FormsModule } from '@angular/forms';

import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ResidencesComponent } from './residences/residence-component/residences.component';

import { HearderComponentComponent } from './hearder-component/hearder-component.component';
import { HomeComponentComponent } from './home/home-component.component';
import { FooterComponentComponent } from './footer-component/footer-component.component';
import { NotFoundComponentComponent } from './not-found-component/not-found-component.component';
import { ResidenceDetailsComponentComponent } from './residences/residence-details-component/residence-details-component.component';
import { AddResidenceComponentComponent } from './residences/add-residence-component/add-residence-component.component';
import { ApartementsComponent } from './apartements/apartements.component';
import { ApartementsComponentComponent } from './apartements/apartements-component/apartements-component.component';
import { ApartementsByResidenceComponentComponent } from './apartements/apartements-by-residence-component/apartements-by-residence-component.component';
import { AddApartementComponentComponent } from './apartements/add-apartement-component/add-apartement-component.component';

@NgModule({
  declarations: [
    AppComponent,
    ResidencesComponent,
    HearderComponentComponent,
    HomeComponentComponent,
    FooterComponentComponent,
    NotFoundComponentComponent,
    ResidenceDetailsComponentComponent,
    AddResidenceComponentComponent,
    ApartementsComponent,
    ApartementsComponentComponent,
    ApartementsByResidenceComponentComponent,
    AddApartementComponentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
