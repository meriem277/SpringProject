import { Component } from '@angular/core';

@Component({
  selector: 'app-home-component',
  templateUrl: './home-component.component.html',
  styleUrls: ['./home-component.component.css']
})
export class HomeComponentComponent {
  listResidences = [
      { id: 1, name: "El Fel", address: "Borj Cedria", image: "../../assets/images/R1.jpg", status: "Disponible" },
      { id: 2, name: "El Yasmine", address: "Ezzahra", image: "../../assets/images/R2.jpg", status: "Disponible" },
      { id: 3, name: "El Arij", address: "Rades", image: "../../assets/images/R3.jpg", status: "Vendu" },
      { id: 4, name: "El Anber", address: "inconnu", image: "../../assets/images/R4.jpg", status: "En Construction" }
    ];

}
