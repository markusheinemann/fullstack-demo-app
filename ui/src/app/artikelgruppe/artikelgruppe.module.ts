import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { ArtikelgruppeListComponent } from './components/person-list/artikelgruppe-list.component';

import { ArtikelgruppeRoutingModule } from './artikelgruppe-routing.module';
import { ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [ArtikelgruppeListComponent],
  imports: [CommonModule, ArtikelgruppeRoutingModule, ReactiveFormsModule],
})
export class ArtikelgruppeModule {}
