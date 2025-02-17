import { Component, OnInit } from '@angular/core';
import { Residence } from '../../core/models/residence';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-residences',
  templateUrl: './residences.component.html',
  styleUrls: ['./residences.component.css']
})

export class ResidencesComponent implements OnInit {
  searchQuery: string = ''; // Initialisation de searchQuery


  constructor() {} // Inject ActivatedRoute for getting 'id' from route
  listResidences: Residence[] = [
    { id: 1, name: "El Fel", address: "Borj Cedria", image: "../../assets/images/R1.jpg", status: "Disponible" },
    { id: 2, name: "El Yasmine", address: "Ezzahra", image: "../../assets/images/R2.jpg", status: "Disponible" },
    { id: 3, name: "El Arij", address: "Rades", image: "../../assets/images/R3.jpg", status: "Vendu" },
    { id: 4, name: "El Anber", address: "inconnu", image: "../../assets/images/R4.jpg", status: "En Construction" }
  ];
  showLocation(residence: Residence) {
    if (residence.address === 'inconnu') {
      alert(`L'adresse de la résidence ${residence.name} est inconnue.`);
    } else {
      alert(`Adresse : ${residence.address}`);
    }
  }
  favorites: Residence[] = [];

addToFavorites(residence: Residence) {
  this.favorites.push(residence);
  alert(`${residence.name} a été ajouté aux favoris !`);
}



  ngOnInit(): void {

  }
}
