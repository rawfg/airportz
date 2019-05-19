package com.rcode.airports.service;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Airport {

//    Airport ID	Unique OpenFlights identifier for this airport.
//    Name	Name of airport. May or may not contain the City name.
//    City	Main city served by airport. May be spelled differently from Name.
//    Country	Country or territory where airport is located. See countries.dat to cross-reference to ISO 3166-1 codes.
//    IATA	3-letter IATA code. Null if not assigned/unknown.
//    ICAO	4-letter ICAO code.
//    Null if not assigned.
//    Latitude	Decimal degrees, usually to six significant digits. Negative is South, positive is North.
//    Longitude	Decimal degrees, usually to six significant digits. Negative is West, positive is East.
//    Altitude	In feet.
//    Timezone	Hours offset from UTC. Fractional hours are expressed as decimals, eg. India is 5.5.
//    DST	Daylight savings time. One of E (Europe), A (US/Canada), S (South America), O (Australia), Z (New Zealand), N (None) or U (Unknown). See also: Help: Time
//    Tz database time zone	Timezone in "tz" (Olson) format, eg. "America/Los_Angeles".
//    Type	Type of the airport. Value "airport" for air terminals, "station" for train stations, "port" for ferry terminals and "unknown" if not known. In airports.csv, only type=airport is included.
//    Source	Source of this data. "OurAirports" for data sourced from OurAirports, "Legacy" for old data not matched to OurAirports (mostly DAFIF), "User" for unverified user contributions. In airports.csv, only source=OurAirports is included.


    // 1,"Goroka","Goroka","Papua New Guinea","GKA","AYGA",-6.081689,145.391881,5282,10,"U","Pacific/Port_Moresby"
    @Id
    private Integer airportId;
    private String name;
    private String city;
    private String country;

    @Size(max = 3, min = 3)
    private String iataCode;

    @Size(max = 4, min = 4)
    private String icaoCode;

    private Double latitude;
    private Double longitude;
    private Double altitude;
    private String timeZoneOffset;
    private String dst;
    private String timeZone;
    private String type;
    private String source;

    public Integer getAirportId() {
        return airportId;
    }

    public void setAirportId(Integer airportId) {
        this.airportId = airportId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    public String getIcaoCode() {
        return icaoCode;
    }

    public void setIcaoCode(String icaoCode) {
        this.icaoCode = icaoCode;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public String getTimeZoneOffset() {
        return timeZoneOffset;
    }

    public void setTimeZoneOffset(String timeZoneOffset) {
        this.timeZoneOffset = timeZoneOffset;
    }

    public String getDst() {
        return dst;
    }

    public void setDst(String dst) {
        this.dst = dst;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
