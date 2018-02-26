CREATE TABLE calendar (
  service_id INT unsigned PRIMARY KEY AUTO_INCREMENT,
  monday TINYINT(1),
  tuesday TINYINT(1),
  wednesday TINYINT(1),
  thursday TINYINT(1),
  friday TINYINT(1),
  saturday TINYINT(1),
  sunday TINYINT(1),
  start_date VARCHAR(8),
  end_date VARCHAR(8)
);

LOAD DATA LOCAL INFILE 'C:\\Users\\iuliab\\IdeaProjects\\CFR-Calatori\\src\\main\\resources\\sql\\migrations\\calendar.txt'
INTO TABLE calendar FIELDS TERMINATED BY ',' IGNORE 1 LINES;