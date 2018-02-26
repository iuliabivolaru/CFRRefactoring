CREATE TABLE agency (
  agency_id         VARCHAR(20) PRIMARY KEY,
  agency_name       VARCHAR(40) NOT NULL,
  agency_url        VARCHAR(40) NOT NULL,
  agency_timezone   VARCHAR(30) NOT NULL
);

LOAD DATA LOCAL INFILE 'C:\\Users\\iuliab\\IdeaProjects\\CFR-Calatori\\src\\main\\resources\\sql\\migrations\\agency.txt'
INTO TABLE agency FIELDS TERMINATED BY ',' IGNORE 1 LINES;