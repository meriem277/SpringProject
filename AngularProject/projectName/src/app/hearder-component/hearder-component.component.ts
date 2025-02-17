import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-hearder-component',
  templateUrl: './hearder-component.component.html',
  styleUrls: ['./hearder-component.component.css']
})
export class HearderComponentComponent {


  constructor(private router: Router) {}

  goToResidence() {
    this.router.navigate(['residences']); // Redirection vers "/residence"
  }
}
