export class Agency {

  agencyId: string;
  name: string;
  url: string;
  timezone: string;

  constructor(agencyId: string, name: string, url: string, timezone: string) {
    this.agencyId = agencyId;
    this.name = name;
    this.url = url;
    this.timezone = timezone;
  }
}
