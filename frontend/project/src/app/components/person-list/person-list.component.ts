import { Component, OnInit } from '@angular/core';
import { PersonserviceService } from '../../services/personservice.service';
import { Person } from '../../common/person';

@Component({
  selector: 'app-person-list',
  templateUrl: './person-list.component.html',
  styleUrls: ['./person-list.component.css']
})
export class PersonListComponent implements OnInit {
  persons: Person[] = [];

  constructor(private personService: PersonserviceService) { }

  ngOnInit(): void {
    console.log('ngOnInit called');
    this.personService.getPersons().subscribe(
      data => {
        console.log('Data received:', data);
        this.persons = data;
      },
      error => {
        console.error('Error occurred:', error);
      }
    );
  }
}
