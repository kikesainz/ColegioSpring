package com.kike.colegio.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "matriculaciones")
public class MatriculacionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "id_asignatura")
	private AsignaturaEntity asignatura;

	@ManyToOne
	@JoinColumn(name = "id_alumno")
	private AlumnoEntity alumno;

	@Column(name = "fecha")
	private String fecha;

	@Column(name = "activo")
	private Integer activo;

	@OneToOne(mappedBy="matricula")
	private CajaEntity caja;
	
	
	public CajaEntity getCaja() {
		return caja;
	}

	public void setCaja(CajaEntity caja) {
		this.caja = caja;
	}

	public Integer getId() {
		return id;
	}

	public MatriculacionEntity() {
		super();
	}

	public MatriculacionEntity(Integer id, AsignaturaEntity asignatura, AlumnoEntity alumno, String fecha,
			Integer activo) {
		super();
		this.id = id;
		this.asignatura = asignatura;
		this.alumno = alumno;
		this.fecha = fecha;
		this.activo = activo;
	}

	public MatriculacionEntity(AsignaturaEntity asignatura, AlumnoEntity alumno, String fecha, Integer activo) {
		super();
		this.asignatura = asignatura;
		this.alumno = alumno;
		this.fecha = fecha;
		this.activo = activo;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public AsignaturaEntity getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(AsignaturaEntity asignatura) {
		this.asignatura = asignatura;
	}

	public AlumnoEntity getAlumno() {
		return alumno;
	}

	public void setAlumno(AlumnoEntity alumno) {
		this.alumno = alumno;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

}
