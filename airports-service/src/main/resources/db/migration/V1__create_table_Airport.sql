create table airport
(
    airport_id       integer not null,
    name             varchar(255),
    city             varchar(255),
    country          varchar(255),
    iata_code        varchar(3),
    icao_code        varchar(4),
    latitude         double,
    longitude        double,
    altitude         double,
    time_zone_offset varchar(255),
    dst              varchar(255),
    time_zone        varchar(255),
    type             varchar(255),
    source           varchar(255),
    primary key (airport_id)
) AS
SELECT *
FROM CSVREAD('classpath:airports.csv');
