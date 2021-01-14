package com.brianpondi.gis.gisrest.entidades;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import org.locationtech.jts.geom.Geometry;
import org.n52.jackson.datatype.jts.GeometryDeserializer;
import org.n52.jackson.datatype.jts.GeometrySerializer;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "geometrias")
public class Geometrias implements Serializable {


    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private int id;
    private Geometry geometry;

    public Geometrias() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }
}
