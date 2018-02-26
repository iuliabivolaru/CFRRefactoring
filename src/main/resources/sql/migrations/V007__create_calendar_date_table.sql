CREATE TABLE calendar_date (
  service_id INT unsigned REFERENCES calendar(service_id) ON DELETE CASCADE,
  date VARCHAR(8) PRIMARY KEY,
  exception_type INT(2)
);

LOAD DATA LOCAL INFILE 'C:\\Users\\iuliab\\IdeaProjects\\CFR-Calatori\\src\\main\\resources\\sql\\migrations\\calendar_dates.txt'
INTO TABLE calendar_date FIELDS TERMINATED BY ',' IGNORE 1 LINES;