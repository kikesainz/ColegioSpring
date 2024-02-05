package com.kike.colegio.dao.springdataJPA;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.kike.colegio.dao.ICombosDAO;
import com.kike.colegio.dtos.ComboDTO;
import com.kike.colegio.entities.MunicipiosEntity;
import com.kike.colegio.repositories.MunicipioRepository;



@Service
public class CombosDAOImplSpringDataJPA implements ICombosDAO {
	@Autowired
	private MunicipioRepository municipioRepository;




	private List<ComboDTO> mapeoEntidadMunicioComboDTO(Iterable<MunicipiosEntity> listaEntidadesMunicipios) {
		List<ComboDTO> listaCombos = new ArrayList<>();
		for (MunicipiosEntity municipiosEntity : listaEntidadesMunicipios) {
			listaCombos.add(new ComboDTO(municipiosEntity.getIdMunicipio(), municipiosEntity.getNombre()));
		}
		return listaCombos;

	}




	@Override
	public List<ComboDTO> recuperaCombosMunicipio() throws ClassNotFoundException, SQLException, NamingException {
		Iterable<MunicipiosEntity> listaEntidadesMunicipios = municipioRepository.findAll();
		return mapeoEntidadMunicioComboDTO(listaEntidadesMunicipios);
	}

}
