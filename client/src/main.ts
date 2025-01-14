import { bootstrapApplication } from '@angular/platform-browser';
import { AppComponent } from './app/app.component'; 
import { provideRouter } from '@angular/router';
import { routes } from './app/app.routes'; 
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { importProvidersFrom } from '@angular/core';
import { AngularMaterialModule } from './app/AngularMaterialModule';
import { provideAnimationsAsync } from '@angular/platform-browser/animations/async'; 

bootstrapApplication(AppComponent, {
  providers: [
    provideRouter(routes),
    importProvidersFrom(BrowserAnimationsModule, AngularMaterialModule), provideAnimationsAsync()
  ]
})
  .catch(err => console.error(err));
