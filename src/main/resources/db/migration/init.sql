/*CREATE TABLESPACE tbs_perm
  DATAFILE 'devcfr_perm.dat'
    SIZE 20M
  ONLINE;

CREATE TEMPORARY TABLESPACE tbs_temp
TEMPFILE 'devcfr_temp.dbf'
SIZE 5M
AUTOEXTEND ON;

CREATE USER devcfr
IDENTIFIED BY devcfr
DEFAULT TABLESPACE tbs_perm
TEMPORARY TABLESPACE tbs_temp
QUOTA 20M on tbs_perm;

GRANT create session TO devcfr;
GRANT create table TO devcfr;
GRANT create view TO devcfr;
GRANT create any trigger TO devcfr;
GRANT create any procedure TO devcfr;
GRANT create sequence TO devcfr;
GRANT create synonym TO devcfr;*/