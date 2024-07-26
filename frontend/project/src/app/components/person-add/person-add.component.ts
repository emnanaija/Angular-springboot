import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { NgForm } from '@angular/forms';
import { PersonserviceService } from '../../services/personservice.service';
import { Person } from '../../common/person';

@Component({
  selector: 'app-person-add',
  templateUrl: './person-add.component.html',
  styleUrls: ['./person-add.component.css']
})
export class PersonAddComponent implements OnInit {

  @Output() personAdded = new EventEmitter<Person>();
  @Input() personToEdit: Person | null = null;

  person: Person = new Person(0, '', '');

  constructor(private personService: PersonserviceService) { }

  ngOnInit(): void {
    if (this.personToEdit) {
      this.person = { ...this.personToEdit };
    }
  }

  ngOnChanges(): void {
    if (this.personToEdit) {
      this.person = { ...this.personToEdit };
    }
  }

  onSubmit(form: NgForm) {
    if (form.valid) {
      if (this.person.id === 0) {
        this.personService.createPerson(this.person).subscribe(person => {
          this.personAdded.emit(person);
          form.reset();
          this.person = new Person(0, '', '');
        }, error => {
          console.log('Error occurred:', error);
        });
      } else {
        this.personService.updatePerson(this.person.id, this.person).subscribe(person => {
          this.personAdded.emit(person);
          form.reset();
          this.person = new Person(0, '', '');
        }, error => {
          console.log('Error occurred:', error);
        });
      }
    }
  }
}
