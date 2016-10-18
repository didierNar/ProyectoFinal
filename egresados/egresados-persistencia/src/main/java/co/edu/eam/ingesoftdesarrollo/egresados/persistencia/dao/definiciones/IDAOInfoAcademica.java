package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.InfoAcademica;

public interface IDAOInfoAcademica {

	public void agregar (InfoAcademica info) throws Exception;
	
	public InfoAcademica buscar (Egresado e) throws Exception;
	
	public void editarInfo (InfoAcademica info) throws Exception;
	
}
