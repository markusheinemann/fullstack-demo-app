import { Component, OnInit } from '@angular/core';
import { PersonService } from '../../service/person.service';
import { Observable } from 'rxjs';
import { Person } from '../../model/person';
import * as dayjs from 'dayjs';

@Component({
  selector: 'app-people-list',
  templateUrl: './person-list.component.html',
  styles: [],
})
export class PersonListComponent implements OnInit {
  public people?: Observable<Person[]>;

  constructor(private readonly personService: PersonService) {}

  ngOnInit(): void {
    this.people = this.personService.listAll();
  }

  formatBirthday(birthday: string): string {
    return dayjs(birthday, 'YYYY-MM-DD').format('D. MMMM YYYY');
  }
}
