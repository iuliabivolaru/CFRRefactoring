CREATE TABLE route (
  route_id INT unsigned PRIMARY KEY AUTO_INCREMENT,
  agency_id VARCHAR(20) REFERENCES agency(agency_id) ON DELETE CASCADE,
  route_short_name VARCHAR(50),
  route_long_name VARCHAR(255),
  route_type INT(2)
);

LOAD DATA LOCAL INFILE 'C:\\Users\\iuliab\\IdeaProjects\\CFR-Calatori\\src\\main\\resources\\sql\\migrations\\routes.txt'
INTO TABLE route FIELDS TERMINATED BY ',' IGNORE 1 LINES;