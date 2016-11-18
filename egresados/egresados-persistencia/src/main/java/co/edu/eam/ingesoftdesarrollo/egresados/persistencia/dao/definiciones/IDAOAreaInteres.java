package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.AreasInteres;

/**
 * IDAO de la clase AreaInteres
 * @author LuchoBolivar
 *
 */
public interface IDAOAreaInteres {
	
	/**
	 * Metodo que permite registrar un AreaInteres
	 * @param AreaInteres que se va a registrar
	 * @throws Exception si falla la operacion
	 */
	public void registrar (AreasInteres area) throws Exception;
	
	/**
	 * Metodo para hacer una busqueda de un areaInteres
	 * @param cod del areaInteres a buscar
	 * @return el areaInteres que se busco 
	 * @throws Exception si falla la operacion
	 */
	public AreasInteres buscar (int cod) throws Exception;
	
	/**
	 * Metodo  que permite editar un areaInteres
	 * @param area areaInteres que se quiere editar
	 * @throws Exception si la falla la operacion
	 */
	public void editar (AreasInteres area) throws Exception;

}
