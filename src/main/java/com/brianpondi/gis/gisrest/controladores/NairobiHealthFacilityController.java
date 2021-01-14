package com.brianpondi.gis.gisrest.controladores;


import com.brianpondi.gis.gisrest.entidades.NairobiHealthFacility;
import com.brianpondi.gis.gisrest.repositorio.NairobiHealthFacilityRepositorio;
import com.brianpondi.gis.gisrest.service.NairobiHealthFacilityService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/nhf")
public class NairobiHealthFacilityController {


//    @Autowired
//    private NairobiHealthFacilityService nairobiHealthFacilityService;
//
//    @GetMapping
//    public List<NairobiHealthFacility> findAll(){
//        return nairobiHealthFacilityService.findAll();
//    }
//
//    @GetMapping(path = "/")
//    public NairobiHealthFacility findById(@RequestParam("id") int id){
//        try{
//            return nairobiHealthFacilityService.findById(id);
//        } catch (NotFoundException e){
//            return null;
//        }
//    }
//
//    @GetMapping(path = "/nearfromuser")
//    public List<NairobiHealthFacility> findAllHospitalsByDistanceFromUser(@RequestParam("userlocation") List<Double> userLocation){
//        double userLongitude = userLocation.get(0);
//        double userLatitude = userLocation.get(1);
//
//        return nairobiHealthFacilityService.findAllHospitalsByDistanceFromUser(userLongitude,userLatitude);
//    }
//
//    @GetMapping(path = "/")
//    public void delete(@RequestParam("id") int id){
//        nairobiHealthFacilityService.deleteById(id);
//    }

}
