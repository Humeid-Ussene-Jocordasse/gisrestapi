package com.brianpondi.gis.gisrest.repositorio;

import com.brianpondi.gis.gisrest.entidades.Geometrias;
import com.brianpondi.gis.gisrest.entidades.NairobiHealthFacility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GeometriasRepositorio extends JpaRepository<Geometrias, Integer> {

    Geometrias findById(int id);

//    @Query(value = "SELECT nhf.id, nhf.name, nhf.geom "
//            + "FROM nairobi_health_facility nhf, nairobi_sub_counties nsc "
//            + "WHERE ST_Within(nhf.geom, nsc.geom) AND nsc.id= :subCountyId"
//            , nativeQuery = true)
//    List<NairobiHealthFacility> findAllHospitalsWithinSubCounty(@Param("subCountyId") int subCountyId);

}
