import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import {Observable} from 'rxjs/Observable';
import {TrainRoute} from './train-route';

@Injectable()
export class RouteService {

  private apiUrl = 'http://localhost:8080/routes';

  constructor(private http: HttpClient) {
  }

  findAll(): Observable<TrainRoute[]> {
    return this.http.get<TrainRoute[]>(this.apiUrl);
      // .map((res: Response) => res.json())
      // .catch((error: any) => Observable.throw(error.error || 'Server error'));
  }
}
