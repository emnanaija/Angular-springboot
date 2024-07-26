import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { PersonserviceService } from '../../services/personservice.service';
import { Person } from '../../common/person';

@Component({
  selector: 'app-person-list',
  templateUrl: './person-list.component.html',
  styleUrls: ['./person-list.component.css']
})
export class PersonListComponent implements OnInit {

  persons: Person[] = [];

  @Output() personEdit = new EventEmitter<Person>();

  constructor(private personService: PersonserviceService) { }

  ngOnInit(): void {
    this.loadPersons();
  }

  loadPersons() {
    this.personService.getPersons().subscribe(data => {
      this.persons = data;
    });
  }

  deletePerson(id: number) {
    this.personService.deletePerson(id).subscribe(() => {
      this.persons = this.persons.filter(person => person.id !== id);
    }, error => {
      console.log('Error occurred:', error);
    });
  }

  editPerson(person: Person) {
    this.personEdit.emit(person);
  }
}
