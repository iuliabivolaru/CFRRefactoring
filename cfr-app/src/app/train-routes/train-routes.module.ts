import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { TrainRoutesRoutingModule } from './train-routes-routing.module';
import { TrainRoutesListComponent } from './train-routes-list/train-routes-list.component';

@NgModule({
  imports: [
    CommonModule,
    TrainRoutesRoutingModule
  ],
  declarations: [TrainRoutesListComponent]
})
export class TrainRoutesModule { }
