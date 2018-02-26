CREATE TABLE stop (
  stop_id NUMERIC(8) PRIMARY KEY,
  stop_name VARCHAR(255),
  stop_lat DECIMAL(8,6),
  stop_lon DECIMAL(8,6)
);

LOAD DATA LOCAL INFILE 'C:\\Users\\iuliab\\IdeaProjects\\CFR-Calatori\\src\\main\\resources\\sql\\migrations\\stops.txt'
INTO TABLE stop FIELDS TERMINATED BY ',' IGNORE 1 LINES;