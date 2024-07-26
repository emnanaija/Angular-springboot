import { Component, ViewChild } from '@angular/core';
import { PersonListComponent } from './components/person-list/person-list.component';
import { Person } from './common/person';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'myproject';
  personToEdit: Person | null = null;

  @ViewChild(PersonListComponent) personListComponent!: PersonListComponent;

  onPersonAdded(person: Person) {
    this.personListComponent.loadPersons();
    this.personToEdit = null; // Reset personToEdit after addition or update
  }

  onPersonEdit(person: Person) {
    this.personToEdit = person;
  }
}
