import {Component, OnInit} from "@angular/core";
import {RouteService} from "../train-route.service";
import {TrainRoute} from "../train-route";
import {TranslateService} from "@ngx-translate/core";

@Component({
  selector: 'app-train-routes-list',
  templateUrl: './train-routes-list.component.html',
  styleUrls: ['./train-routes-list.component.css', '../../../../node_modules/flag-icon-css/css/flag-icon.css']
})
export class TrainRoutesListComponent implements OnInit {

  routes: TrainRoute[];
  translate: TranslateService;
  departure: string;
  arrival: string;

  constructor(private trainRouteService: RouteService, translate: TranslateService) {
    this.translate = translate;
    translate.setDefaultLang('en');
  }

  switchLanguage (lang: string) {
    this.translate.use(lang);
  };

  ngOnInit() {
  }

  getAllTrainRoutes() {
    this.trainRouteService.findAll().subscribe(
      routes => {
        this.routes = routes;
      },
      err => {
        console.log(err);
      }
    );
  }

  getTrainRoutesByDepartureAndArrival() {
    this.trainRouteService.findRoutesByDepartureAndArrival(this.departure, this.arrival).subscribe(
      routes => {
        this.routes = routes;
      },
      err => {
        console.log(err);
      }
    );
  }

}
