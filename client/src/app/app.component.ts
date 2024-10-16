/*import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { AngularMaterailModule } from './AngularMaterialModule';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,AngularMaterailModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'client';
}*/

import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import { AngularMaterialModule } from './AngularMaterialModule'; // Make sure this path is correct

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, AngularMaterialModule,RouterLink],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'] // Corrected 'styleUrl' to 'styleUrls'
})
export class AppComponent {
  title = 'client';
}
