import {BrowserModule} from "@angular/platform-browser";
import {NgModule} from "@angular/core";

import {AppRoutingModule} from "./app-routing.module";

import {AppComponent} from "./app.component";
import {TrainRoutesModule} from "./train-routes/train-routes.module";
import {HttpClientModule} from "@angular/common/http";
import {RouteService} from "./train-routes/train-route.service";
import {FormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    FormsModule,
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
