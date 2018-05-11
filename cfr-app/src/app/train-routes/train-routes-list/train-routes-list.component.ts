import {Component, OnInit} from "@angular/core";
import {RouteService} from "../train-route.service";
import {TrainRoute} from "../train-route";
import {TranslateService} from "@ngx-translate/core";
import {FormControl} from "@angular/forms";
import {Stop} from "../stop";
import {Observable} from "rxjs/Observable";
import {map, startWith} from "rxjs/operators";


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
  stops: Stop[];
  filteredStops: Observable<string[]>;
  myControl: FormControl = new FormControl();

  ngOnInit() {
    this.getStops();
    // this.filteredStops = this.myControl.valueChanges
    //   .pipe(
    //     startWith(''),
    //     map(val => this.filter(val))
    //   );
  }

  filter(val: string): string[] {
    return this.stops.map((stop: Stop) => stop.stopName).filter(stop =>
      stop.toLowerCase().indexOf(val.toLowerCase()) === 0);
  }

  constructor(private trainRouteService: RouteService, translate: TranslateService) {
    this.translate = translate;
    translate.setDefaultLang('en');
    // this.getStops();
  }

  switchLanguage (lang: string) {
    this.translate.use(lang);
  };

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

  getStops() {
    this.trainRouteService.findAllStops().subscribe(
      stops => {
        this.stops = stops;
        this.filteredStops = this.myControl.valueChanges
          .pipe(
            startWith(''),
            map(val => this.filter(val))
          );
      },
      err => {
        console.log(err);
      }
    );
  }
}
