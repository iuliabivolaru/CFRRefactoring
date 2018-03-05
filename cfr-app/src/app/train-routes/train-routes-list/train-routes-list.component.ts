import {Component, OnInit} from "@angular/core";
import {RouteService} from "../train-route.service";
import {TrainRoute} from "../train-route";

@Component({
  selector: 'app-train-routes-list',
  templateUrl: './train-routes-list.component.html',
  styleUrls: ['./train-routes-list.component.css']
})
export class TrainRoutesListComponent implements OnInit {

  private routes: TrainRoute[];

  constructor(private trainRouteService: RouteService) {
  }

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

}
