export class Stop {

  stopId: number;
  stopName: string;
  stopLat: number;
  stopLon: number;

  constructor(stopId: number, stopName: string, stopLat: number, stopLon: number) {
    this.stopId = stopId;
    this.stopName = stopName;
    this.stopLat = stopLat;
    this.stopLon = stopLon;
  }
}
