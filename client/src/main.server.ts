import { bootstrapApplication, BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app/app.component';
import { config } from './app/app.config.server';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AngularMaterialModule } from './app/AngularMaterialModule';

const bootstrap = () => bootstrapApplication(AppComponent, config);

export default bootstrap;@NgModule({
    declarations: [
      
    ],
    imports: [
        BrowserModule,
        // Root routing module
        BrowserAnimationsModule, // Required for Angular Material animations
        AngularMaterialModule // Import Angular Material components
    ],
    providers: [],
    bootstrap: []
})
export class AppModule {
}

