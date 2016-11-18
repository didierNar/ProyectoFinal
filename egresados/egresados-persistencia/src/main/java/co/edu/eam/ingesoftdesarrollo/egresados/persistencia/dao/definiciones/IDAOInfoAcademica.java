package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.InfoAcademica;

/**
 * IDAO de la clase InfoAcademica
 * @author LuchoBolivar
 *
 */
public interface IDAOInfoAcademica {

	/**
	 * Metodo que permite registrar una infoAcademica
	 * @param info infoAcademica que se va a registrar
	 * @throws Exception si falla la operacion
	 */
	public void agregar (InfoAcademica info) throws Exception;
	
	/**
	 * Metodo para hacer una busqueda de una infoAcademica
	 * @param cod del egresado que tiene la infoAcademica
	 * @return la infoAcademica que se busco 
	 * @throws Exception si falla la operacion
	 */
	public InfoAcademica buscar (Egresado e) throws Exception;
	
	/**
	 * Metodo  que permite editar una infoAcademica
	 * @param info la infoAcademica que se quiere editar
	 * @throws Exception si la falla la operacion
	 */
	public void editarInfo (InfoAcademica info) throws Exception;
	
}
