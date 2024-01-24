package com.kike.colegio.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="alumnos")
public class AlumnoEntity {
	
	@Id
	@Column(name ="id")
	private Integer id;
	@Column(name ="nombre")
	private String nombre;
	@Column(name ="apellidos")
	private String apellidos;

//	@Column(name ="id_municipio")
//	private Integer idMunicipio;
	@ManyToOne
	@JoinColumn(name="id_municipio")
	private MunicipioEntity municipio;
	
	@Column(name = "familia_numerosa")
	private Integer famNumerosa;
	@Column(name = "activo")
	private Integer activo;
	public AlumnoEntity(Integer id, String nombre, String apellidos, MunicipioEntity municipio, Integer famNumerosa,
			Integer activo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.municipio = municipio;
		this.famNumerosa = famNumerosa;
		this.activo = activo;
	}
	public AlumnoEntity() {
		super();
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
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public MunicipioEntity getMunicipio() {
		return municipio;
	}
	public void setMunicipio(MunicipioEntity municipio) {
		this.municipio = municipio;
	}
	public Integer getFamNumerosa() {
		return famNumerosa;
	}
	public void setFamNumerosa(Integer famNumerosa) {
		this.famNumerosa = famNumerosa;
	}
	public Integer getActivo() {
		return activo;
	}
	public void setActivo(Integer activo) {
		this.activo = activo;
	}


	
	
}
