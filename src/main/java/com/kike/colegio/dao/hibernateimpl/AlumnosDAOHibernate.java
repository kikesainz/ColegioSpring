package com.kike.colegio.dao.hibernateimpl;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.kike.colegio.dao.AlumnosDAO;
import com.kike.colegio.dtos.AlumnoDTO;
import com.kike.colegio.entities.AlumnoEntity;

import com.kike.colegio.entities.MunicipiosEntity;
import com.kike.colegio.utils.DBUtils;

@Component("HibernateImpl")
public class AlumnosDAOHibernate implements AlumnosDAO {

	@Override
	public List<AlumnoDTO> obtenerTodosAlumnos() throws ClassNotFoundException, SQLException, NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AlumnoDTO> buscarAlumnos(String id, String nombre, String apellido, String activo, String famNumerosa)
			throws ClassNotFoundException, SQLException, NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer insertarAlumno(String id, String nombre, String apellido, String activo, String famNumerosa,
			String municipio) throws ClassNotFoundException, SQLException, NamingException {

//		AlumnoEntity alumnoEntity = new AlumnoEntity(Integer.parseInt(id), nombre,  apellido, 
//											new MunicipioEntity(Integer.parseInt(municipio)), 
//											Integer.parseInt(famNumerosa), Integer.parseInt (activo));
//		SessionFactory sessionFactory = DBUtils.creadorSessionFactory();
//		Session session = sessionFactory.getCurrentSession();
//		
//		session.beginTransaction();
//		Integer pk = (Integer) session.save(alumnoEntity);
//		session.getTransaction().commit();
		
		SessionFactory factory = DBUtils.creadorSessionFactory();
		Session s = factory.getCurrentSession();
		s.beginTransaction();

		MunicipiosEntity municipioEntity = s.find(MunicipiosEntity.class, Integer.parseInt(municipio));
		
//		MunicipiosEntity municipioEntity = new MunicipiosEntity(Integer.parseInt(municipio), null, null, null, null, null);

		AlumnoEntity alumnoEntity = new AlumnoEntity(Integer.parseInt(id), nombre, apellido, Integer.parseInt(famNumerosa), Integer.parseInt(activo), municipioEntity);
		s.persist(alumnoEntity);

		s.getTransaction().commit();

		s.close();
		Integer idPk = alumnoEntity.getId();
		return idPk;
	}

	@Override
	public Integer actualizarAlumno(String id, String nombre, String apellido, String activo, String famNumerosa,
			String municipio) throws ClassNotFoundException, SQLException, NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer borrarAlumno(String id) throws ClassNotFoundException, SQLException, NamingException {
		// TODO Auto-generated method stub
		return null;
	}

}
