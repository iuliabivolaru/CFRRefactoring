import {Injectable} from '@angular/core';
import {HttpClient, HttpParams} from '@angular/common/http';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import {Observable} from 'rxjs/Observable';
import {TrainRoute} from 'app/train-routes/train-route';
import {Stop} from "./stop";

@Injectable()
export class RouteService {

  private apiUrl = 'http://localhost:8080/routes';
  private stopsApiUrl = 'http://localhost:8080/stops';

  constructor(private http: HttpClient) {
  }

  findAll(): Observable<TrainRoute[]> {
    return this.http.get<TrainRoute[]>(this.apiUrl);
  }

  findRoutesByDepartureAndArrival(departure: string, arrival: string): Observable<TrainRoute[]> {
    const params = new HttpParams()
      .set('departure', departure)
      .set('arrival', arrival);
    return this.http.get<TrainRoute[]>(this.apiUrl + "/filter", {params});
    // .map((res: Response) => res.json())
    // .catch((error: any) => Observable.throw(error.error || 'Server error'));
  }

  findAllStops(): Observable<Stop[]> {
    return this.http.get<Stop[]>(this.stopsApiUrl);
     //
    // .map((stops : Stop[]) => stops.forEach(stop => stop.stopName));
  }
}
