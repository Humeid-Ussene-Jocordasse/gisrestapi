package com.brianpondi.gis.gisrest.repositorio;


import com.brianpondi.gis.gisrest.entidades.NairobiHealthFacility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NairobiHealthFacilityRepositorio extends JpaRepository<NairobiHealthFacility, Integer> {

    @Query(value = "SELECT nhf.id, nhf.name, nhf.geom "
            + "FROM nairobi_health_facility nhf, nairobi_sub_counties nsc "
            + "WHERE ST_Within(nhf.geom, nsc.geom) AND nsc.id= :subCountyId"
            , nativeQuery = true)
    List<NairobiHealthFacility> findAllHospitalsWithinSubCounty(@Param("subCountyId") int subCountyId);

    @Query(value = "SELECT nhf.id, nhf.name, nhf.geom, ST_Distance(nhf.geom,ST_SetSRID(ST_Point(:userLongitude,:userLatitude),4326)) AS distance "
            + "FROM nairobi_Health_facilities nhf "
            + "ORDER BY nhf.geom  <-> ST_SetSRID(ST_Point(:userLongitude,:userLatitude),4326) "
            + "LIMIT 5"
            , nativeQuery = true)
    List<NairobiHealthFacility> findAllHospitalsByDistanceFromUser(@Param("userLongitude") Double userLongitude, @Param("userLatitude") Double userLatitude);


}

