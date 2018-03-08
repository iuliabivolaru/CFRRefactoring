import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { TrainRoutesRoutingModule } from './train-routes-routing.module';
import { TrainRoutesListComponent } from './train-routes-list/train-routes-list.component';
import {TranslateModule, TranslateLoader} from '@ngx-translate/core';
import {TranslateHttpLoader} from "@ngx-translate/http-loader";
import {HttpClient} from "@angular/common/http";

export function HttpLoaderFactory(http: HttpClient) {
  return new TranslateHttpLoader(http, './assets/i18n/', '.json');
}

@NgModule({
  imports: [
    CommonModule,
    TrainRoutesRoutingModule,
    TranslateModule.forRoot({
      loader: {
        provide: TranslateLoader,
        useFactory: HttpLoaderFactory,
        deps: [HttpClient]
      }
    })
  ],
  declarations: [TrainRoutesListComponent]
})
export class TrainRoutesModule { }
