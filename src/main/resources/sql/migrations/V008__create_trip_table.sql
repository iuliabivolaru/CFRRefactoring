CREATE TABLE trip (
  route_id INT unsigned REFERENCES route(route_id) ON DELETE CASCADE,
  service_id INT unsigned REFERENCES calendar(service_id) ON DELETE CASCADE,
  trip_id VARCHAR(40) PRIMARY KEY,
  trip_short_name VARCHAR(10)
);

LOAD DATA LOCAL INFILE 'C:\\Users\\iuliab\\IdeaProjects\\CFR-Calatori\\src\\main\\resources\\sql\\migrations\\trips.txt'
INTO TABLE trip FIELDS TERMINATED BY ',' IGNORE 1 LINES;