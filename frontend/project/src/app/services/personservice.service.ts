import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Person } from '../common/person';

@Injectable({
  providedIn: 'root'
})
export class PersonserviceService {

  private baseUrl = 'http://localhost:8081/api/persons';

  constructor(private httpClient: HttpClient) { }

  getPersons(): Observable<Person[]> {
    return this.httpClient.get<Person[]>(`${this.baseUrl}`);
  }

  createPerson(person: Person): Observable<Person> {
    return this.httpClient.post<Person>(`${this.baseUrl}`, person);
  }

  getPerson(id: number): Observable<Person> {
    return this.httpClient.get<Person>(`${this.baseUrl}/${id}`);
  }

  updatePerson(id: number, value: any): Observable<Person> {
    return this.httpClient.put<Person>(`${this.baseUrl}/${id}`, value);
  }

  deletePerson(id: number): Observable<any> {
    return this.httpClient.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }
}
