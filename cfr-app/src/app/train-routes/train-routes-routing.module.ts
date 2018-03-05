import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TrainRoutesListComponent } from './train-routes-list/train-routes-list.component';

const routes: Routes = [
  {path: 'route', component: TrainRoutesListComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class TrainRoutesRoutingModule { }
