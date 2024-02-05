package com.kike.colegio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kike.colegio.dtos.AlumnoDTO;
import com.kike.colegio.entities.AlumnoEntity;



@Repository
public interface AlumnosRepository extends CrudRepository<AlumnoEntity,Integer>{
	@Query(value = "select new com.kike.colegio.dtos.AlumnoDTO (a.id,a.nombre,a.apellidos,a.municipio.nombre,a.municipio.idMunicipio,a.famNumerosa,a.activo) "
			+ "FROM com.kike.colegio.entities.AlumnoEntity a "
			+ "WHERE CAST (a.id AS STRING)  LIKE CONCAT ('%',:id,'%')  "
			+ "AND a.nombre LIKE CONCAT ('%',:nombre,'%') "
			+ "AND a.apellidos LIKE CONCAT ('%',:apellidos,'%') "
			+ "AND a.activo = :activo "
			+ "AND a.famNumerosa = :famNumerosa")
	List<AlumnoDTO>buscaAlumnoporIDyNombre(@Param("id") Integer id,
			@Param("nombre") String nombre,
			@Param("apellidos") String apellidos,
			@Param("activo") Integer activo,
			@Param("famNumerosa") Integer familiaNumerosa);
	
//	 @Query(value = "SELECT famNumerosa FROM com.kike.colegio.entities.AlumnoEntity WHERE id = :id")
//	    Integer recuperarNumeroFamiliaNumerosa(@Param("id") Integer id);
//	 
//	 @Query(value = " SELECT new com.kike.colegio.dtos.AlumnoDTO (a.id,a.nombre,a.apellidos,a.municipio.nombre,a.municipio.idMunicipio,a.famNumerosa,a.activo) "
//	 		+ "FROM AlumnoEntity a "
//	 		+ "WHERE a.id = :id")
//	 AlumnoDTO buscaAlumnoPorID(@Param("id") Integer id);
}
