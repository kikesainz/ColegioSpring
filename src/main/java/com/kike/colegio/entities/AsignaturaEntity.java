package com.kike.colegio.entities;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="asignaturas")
public class AsignaturaEntity {

	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "curso")
	private Integer curso;
	
	@Column(name = "tasa")
	private Double tasa;

	@Column(name = "activo")
	private Integer activo;
	
	@OneToMany(mappedBy = "asignatura")
	Set<MatriculacionEntity> matriculaciones;

	@OneToMany(mappedBy = "asignatura")
	Set<FaltasEntity> faltas;

	
	public AsignaturaEntity() {
		super();
	}

	
	public AsignaturaEntity(Integer id, String nombre, Integer curso, Double tasa, Integer activo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.curso = curso;
		this.tasa = tasa;
		this.activo = activo;
	}
	public AsignaturaEntity(Integer id, String nombre, Integer curso, Double tasa, Integer activo,
			Set<MatriculacionEntity> matriculaciones, Set<FaltasEntity> faltas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.curso = curso;
		this.tasa = tasa;
		this.activo = activo;
		this.matriculaciones = matriculaciones;
		this.faltas = faltas;
	}

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCurso() {
		return curso;
	}

	public void setCurso(Integer curso) {
		this.curso = curso;
	}

	public Double getTasa() {
		return tasa;
	}

	public void setTasa(Double tasa) {
		this.tasa = tasa;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public Set<MatriculacionEntity> getMatriculaciones() {
		return matriculaciones;
	}

	public void setMatriculaciones(Set<MatriculacionEntity> matriculaciones) {
		this.matriculaciones = matriculaciones;
	}

	public Set<FaltasEntity> getFaltas() {
		return faltas;
	}

	public void setFaltas(Set<FaltasEntity> faltas) {
		this.faltas = faltas;
	}
	
	
}