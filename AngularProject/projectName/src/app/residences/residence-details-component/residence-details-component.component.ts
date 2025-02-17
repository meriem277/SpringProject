import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Residence } from 'src/app/core/models/residence';

@Component({
  selector: 'app-residence-details-component',
  templateUrl: './residence-details-component.component.html',
  styleUrls: ['./residence-details-component.component.css']
})
export class ResidenceDetailsComponentComponent {
  residence!: Residence; // Holds the residence details
  listResidences: Residence[] = [  // Mock Data (Replace with API call)
    { id: 1, name: "El Fel", address: "Borj Cedria", image: "../../assets/images/R1.jpg", status: "Disponible" },
    { id: 2, name: "El Yasmine", address: "Ezzahra", image: "../../assets/images/R2.jpg", status: "Disponible" },
    { id: 3, name: "El Arij", address: "Rades", image: "../../assets/images/R3.jpg", status: "Vendu" },
    { id: 4, name: "El Anber", address: "inconnu", image: "../../assets/images/R4.jpg", status: "En Construction" }
  ];

  constructor(
    private route: ActivatedRoute,
    private router: Router,

  ) {}


  ngOnInit(): void {
    const id = Number(this.route.snapshot.paramMap.get('id')); // Get ID from route
    this.residence = this.listResidences.find(res => res.id === id)!; // Find residence by ID
  }

  nextResidence() {

      const nextResID = this.residence.id + 1;
        if (nextResID < this.listResidences.length) {
        this.router.navigate(['/residences', this.listResidences[nextResID].id]);
      } else {
        this.router.navigate(['/residences', 1]);
      }}



addRes(){
  this.router.navigate(['/addResidence']);
}


}
