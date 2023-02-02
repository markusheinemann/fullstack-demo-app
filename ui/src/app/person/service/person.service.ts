import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment.development';
import { Person } from '../model/person';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class PersonService {
  constructor(private readonly httpClient: HttpClient) {}

  listAll(): Observable<Person[]> {
    return this.httpClient.get<Person[]>(
      `${environment.apiEndpoint}/v1/people`
    );
  }

  create(person: Person): Observable<Person> {
    return this.httpClient.post<Person>(
      `${environment.apiEndpoint}/v1/people`,
      person
    );
  }
}
