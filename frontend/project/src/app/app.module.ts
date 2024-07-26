import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms'; // Ajoutez cette ligne

import { AppComponent } from './app.component';
import { PersonListComponent } from './components/person-list/person-list.component';
import { PersonAddComponent } from './components/person-add/person-add.component'; // Ajoutez cette ligne
import { PersonserviceService } from './services/personservice.service';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    PersonListComponent,
    PersonAddComponent // Ajoutez cette ligne
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule // Ajoutez cette ligne
  ],
  providers: [PersonserviceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
