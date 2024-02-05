package com.kike.colegio.dao.springdataJPA;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kike.colegio.dao.AlumnosDAO;
import com.kike.colegio.dtos.AlumnoDTO;
import com.kike.colegio.entities.AlumnoEntity;
import com.kike.colegio.entities.MunicipiosEntity;
import com.kike.colegio.repositories.AlumnosRepository;
import com.kike.colegio.repositories.MunicipiosRepository;


@Component("SpringDataJPAImpl")
public class AlumnosDAOSpringDataJPA implements AlumnosDAO{

	@Autowired
	MunicipiosRepository municipiosRepository;
	
	@Autowired
	AlumnosRepository alumnosRepository;
	
	@Override
	public List<AlumnoDTO> obtenerTodosAlumnos() throws ClassNotFoundException, SQLException, NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AlumnoDTO> buscarAlumnos(String id, String nombre, String apellido, String activo, String famNumerosa)
			throws ClassNotFoundException, SQLException, NamingException {
//		TODO: implementación de búsqueda de alumnos
//		alumnosRepository.buscaAlumnoporIDyNombre(null, nombre, apellido, null, null)
		return null;
	}

	@Override
	public Integer insertarAlumno(String id, String nombre, String apellido, String activo, String famNumerosa,
			String municipio) throws ClassNotFoundException, SQLException, NamingException {
		
		MunicipiosEntity  municipioEntity = municipiosRepository.findById(Integer.parseInt(municipio)).get();
		AlumnoEntity alumnoEntity = new AlumnoEntity(Integer.parseInt(id), nombre, apellido, Integer.parseInt(famNumerosa), Integer.parseInt(activo),municipioEntity);
		alumnosRepository.save(alumnoEntity);
		return alumnoEntity.getId();
	}

	@Override
	public Integer actualizarAlumno(String id, String nombre, String apellido, String activo, String famNumerosa,
			String municipio) throws ClassNotFoundException, SQLException, NamingException {
		MunicipiosEntity  municipioEntity = municipiosRepository.findById(Integer.parseInt(municipio)).get();
		AlumnoEntity alumnoEntity = new AlumnoEntity(Integer.parseInt(id), nombre, apellido, Integer.parseInt(famNumerosa), Integer.parseInt(activo),municipioEntity);
		alumnosRepository.save(alumnoEntity);
		return alumnoEntity.getId();
	}

	@Override
	public Integer borrarAlumno(String id) throws ClassNotFoundException, SQLException, NamingException {
		// TODO Auto-generated method stub
		
		AlumnoEntity alumnoEntity = alumnosRepository.findById(Integer.parseInt(id)).get();
		return alumnoEntity.getId();
	}

}
