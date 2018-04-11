import {Agency} from "./agency";

export class TrainRoute {

  id: string;
  agency: Agency;
  shortName: string;
  longName: string;
  type: string;

  constructor(id: string, agency: Agency, shortName: string, longName: string, type: string) {
    this.id = id;
    this.agency = agency;
    this.shortName = shortName;
    this.longName = longName;
    this.type = type;
  }
}
