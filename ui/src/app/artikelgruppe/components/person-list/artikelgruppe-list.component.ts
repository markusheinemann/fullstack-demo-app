import { Component, OnInit } from '@angular/core';
import { ArtikelgruppeService } from '../../service/artikelgruppe.service';
import { Observable } from 'rxjs';
import { Artikelgruppe } from '../../model/artikelgruppe';
import * as dayjs from 'dayjs';

@Component({
  selector: 'app-artikelgruppe-list',
  templateUrl: './artikelgruppe-list.component.html',
  styles: [],
})
export class ArtikelgruppeListComponent implements OnInit {
  public people?: Observable<Artikelgruppe[]>;

  constructor(private readonly personService: ArtikelgruppeService) {}

  ngOnInit(): void {
    this.people = this.personService.listAll();
  }

  formatBirthday(birthday: string): string {
    return dayjs(birthday, 'YYYY-MM-DD').format('D. MMMM YYYY');
  }
}
