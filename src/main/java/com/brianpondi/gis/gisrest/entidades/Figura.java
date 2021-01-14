package com.brianpondi.gis.gisrest.entidades;

import org.locationtech.jts.geom.Coordinate;

import javax.persistence.Entity;


public class Figura {
     String id;
     String type;
     Coordinate[] coordinates;

    public Figura() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Coordinate[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinate[] coordinates) {
        this.coordinates = coordinates;
    }
}
