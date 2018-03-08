import {BrowserModule} from "@angular/platform-browser";
import {NgModule} from "@angular/core";

import {AppRoutingModule} from "./app-routing.module";

import {AppComponent} from "./app.component";
import {TrainRoutesModule} from "./train-routes/train-routes.module";
import {HttpClient, HttpClientModule} from "@angular/common/http";
import {RouteService} from "./train-routes/train-route.service";

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    TrainRoutesModule
  ],
  providers: [RouteService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
