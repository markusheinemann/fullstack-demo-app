import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { PersonListComponent } from './components/person-list/person-list.component';

import { PersonRoutingModule } from './person-routing.module';
import { ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [PersonListComponent],
  imports: [CommonModule, PersonRoutingModule, ReactiveFormsModule],
})
export class PersonModule {}
