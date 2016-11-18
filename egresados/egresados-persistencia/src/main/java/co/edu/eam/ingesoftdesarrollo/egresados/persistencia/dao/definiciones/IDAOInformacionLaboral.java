package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.InformacionLaboral;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.SectorLaboral;

public interface IDAOInformacionLaboral {

	public void agregar (InformacionLaboral infoLab) throws Exception;
	
	public InformacionLaboral buscar (Egresado e) throws Exception;
	
	public void editar (InformacionLaboral infoLab) throws Exception;
	
	public List<InformacionLaboral> informacionLaboralEgresado (Empresa e) throws Exception;
	
	public List<SectorLaboral> listaSectores() throws Exception;
	
	/**
	 * Obtiene la información laboral de un programa
	 * @param p el programa
	 * @return la información laboral
	 * @throws Exception si falla la operación
	 */
	public List<InformacionLaboral> infoLabPrograma (Programa p) throws Exception;
	
}
