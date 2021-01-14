package com.brianpondi.gis.gisrest.controladores;


import com.brianpondi.gis.gisrest.entidades.Geometrias;
import com.brianpondi.gis.gisrest.repositorio.GeometriasRepositorio;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.n52.jackson.datatype.jts.GeometryDeserializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/api/gis")
@CrossOrigin(value = "*")
public class GeometriaController {


    @Autowired
    GeometriasRepositorio geometriasRepositorio;


    @GetMapping("/geoms")

    List<Geometrias> geometrias(){

        return geometriasRepositorio.findAll();
    }

    @GetMapping("/welcome")
    String welcome(){
        return "Bem vindo ao mundo GIS";
    }

    @PostMapping("geom")
    public Geometrias salvar(@RequestBody Geometrias geometrias){


        return geometriasRepositorio.save(geometrias);
    }

//    public void shouldConvertWktToGeometry() {
//        Geometry geometry = wktToGeometry("POINT (2 5)");
//        assertEquals("Point", geometry.getGeometryType());
//        assertTrue(geometry instanceof Point);
//    }


    @DeleteMapping("/geom/{id}")
    public String deletaGeom(@PathVariable int id){

        if(geometriasRepositorio.existsById(id)){
            Geometrias geometrias = geometriasRepositorio.findById(id);
            geometriasRepositorio.delete(geometrias);
            return "Apagado Com Sucesso";
        }
        else {
            return "Tupla não encontrada";
        }
    }


}
