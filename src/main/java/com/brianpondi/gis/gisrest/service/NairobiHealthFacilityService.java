package com.brianpondi.gis.gisrest.service;

import com.brianpondi.gis.gisrest.entidades.NairobiHealthFacility;
import javassist.NotFoundException;

import java.util.List;

public interface NairobiHealthFacilityService {

    List<NairobiHealthFacility> findAll();
    NairobiHealthFacility findById (int id) throws NotFoundException;
    List<NairobiHealthFacility> findAllHospitalsWithinSubCounty(int subCountyId);
    List<NairobiHealthFacility> findAllHospitalsByDistanceFromUser(Double userLongitude, Double userLatitude);
    void deleteById(int id);
}
