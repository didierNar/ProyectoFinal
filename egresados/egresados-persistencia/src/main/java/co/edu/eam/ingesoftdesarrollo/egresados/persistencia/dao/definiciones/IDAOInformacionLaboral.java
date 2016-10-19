package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.InformacionLaboral;

public interface IDAOInformacionLaboral {

	public void agregar (InformacionLaboral infoLab) throws Exception;
	
	public InformacionLaboral buscar (Egresado e) throws Exception;
	
	public void editar (InformacionLaboral infoLab) throws Exception;
	
	public List<InformacionLaboral> informacionLaboralEgresado (Egresado e) throws Exception;
	
}
