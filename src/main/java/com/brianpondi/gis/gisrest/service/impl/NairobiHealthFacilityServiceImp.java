package com.brianpondi.gis.gisrest.service.impl;

import com.brianpondi.gis.gisrest.entidades.NairobiHealthFacility;
import com.brianpondi.gis.gisrest.repositorio.NairobiHealthFacilityRepositorio;
import com.brianpondi.gis.gisrest.service.NairobiHealthFacilityService;

import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class NairobiHealthFacilityServiceImp implements NairobiHealthFacilityService {


    @Autowired
    private NairobiHealthFacilityRepositorio nairobiHealthFacilityRepositorio;

    public List<NairobiHealthFacility> findAll(){
        return nairobiHealthFacilityRepositorio.findAll();
    }

    @Override
    public NairobiHealthFacility findById(int id) throws NotFoundException {
        return nairobiHealthFacilityRepositorio.findById(id).orElseThrow(
                ()-> new NotFoundException("Heath Facility Not Found")
        );
    }

    @Override
    public List<NairobiHealthFacility> findAllHospitalsWithinSubCounty(int subCountyId) {
        return nairobiHealthFacilityRepositorio.findAllHospitalsWithinSubCounty(subCountyId);
    }

    @Override
    public List<NairobiHealthFacility> findAllHospitalsByDistanceFromUser(Double userLongitude, Double userLatitude) {
        return nairobiHealthFacilityRepositorio.findAllHospitalsByDistanceFromUser(userLongitude,userLatitude);
    }

    @Override
    public void deleteById(int id) {
        nairobiHealthFacilityRepositorio.deleteById(id);
    }
}
