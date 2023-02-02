import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ArtikelgruppeListComponent } from './components/person-list/artikelgruppe-list.component';

const routes: Routes = [
  {
    path: '',
    component: ArtikelgruppeListComponent,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ArtikelgruppeRoutingModule {}
