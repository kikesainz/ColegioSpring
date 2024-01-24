package com.kike.colegio.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="municipios")
public class MunicipioEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_municipio")
	private Integer idMunicipio;
	@Column(name="id_provincia")
	private Integer idProvincia;
	@Column(name="cod_municipio")
	private Integer codMunicipio;
	@Column(name="DC")
	private Integer dc;
	@Column(name="nombre")
	private String nombre;	
	
	@OneToMany
	@JoinColumn(name="id_municipio")
	private List<AlumnoEntity> listaAlumnos;

	public MunicipioEntity(Integer idMunicipio, Integer idProvincia, Integer codMunicipio, Integer dc, String nombre,
			List<AlumnoEntity> listaAlumnos) {
		super();
		this.idMunicipio = idMunicipio;
		this.idProvincia = idProvincia;
		this.codMunicipio = codMunicipio;
		this.dc = dc;
		this.nombre = nombre;
		this.listaAlumnos = listaAlumnos;
	}
	

	public MunicipioEntity(Integer idMunicipio) {
		super();
		this.idMunicipio = idMunicipio;
	}


	public MunicipioEntity() {
		super();
	}

	public Integer getIdMunicipio() {
		return idMunicipio;
	}

	public void setIdMunicipio(Integer idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	public Integer getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(Integer idProvincia) {
		this.idProvincia = idProvincia;
	}

	public Integer getCodMunicipio() {
		return codMunicipio;
	}

	public void setCodMunicipio(Integer codMunicipio) {
		this.codMunicipio = codMunicipio;
	}

	public Integer getDc() {
		return dc;
	}

	public void setDc(Integer dc) {
		this.dc = dc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<AlumnoEntity> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(List<AlumnoEntity> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}
	
	
	
}