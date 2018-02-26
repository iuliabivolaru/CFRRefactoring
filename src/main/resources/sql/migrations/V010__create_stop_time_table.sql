CREATE TABLE stop_time (
  trip_id VARCHAR(40) REFERENCES trip(trip_id) ON DELETE CASCADE,
  arrival_time VARCHAR(8),
  departure_time VARCHAR(8),
  stop_id NUMERIC(8) REFERENCES stop(stop_id) ON DELETE CASCADE,
  stop_sequence NUMERIC(10),
  CONSTRAINT pk_stop_time PRIMARY KEY (trip_id, stop_id)
);

LOAD DATA LOCAL INFILE 'C:\\Users\\iuliab\\IdeaProjects\\CFR-Calatori\\src\\main\\resources\\sql\\migrations\\stop_times.txt'
INTO TABLE stop_time FIELDS TERMINATED BY ',' IGNORE 1 LINES;