import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment.development';
import { Artikelgruppe } from '../model/artikelgruppe';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class ArtikelgruppeService {
  constructor(private readonly httpClient: HttpClient) {}

  listAll(): Observable<Artikelgruppe[]> {
    return this.httpClient.get<Artikelgruppe[]>(
      `${environment.apiEndpoint}/v1/artikel/artikelgruppen`
    );
  }

}
