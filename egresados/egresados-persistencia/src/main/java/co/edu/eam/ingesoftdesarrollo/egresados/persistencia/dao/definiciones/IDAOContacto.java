package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Contacto;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Empresa;

/**
 * clase IDAO de el contacto
 * @author LuchoBolivar
 *
 */
public interface IDAOContacto {
	
	/**
	 * Metodo que permite registrar un contacto
	 * @param con contacto que se va a registrar
	 * @throws Exception si falla la operacion
	 */
	public void registrar (Contacto con) throws Exception;
	
	/**
	 * Metodo para hacer una busqueda de un contacto
	 * @param emp empresa de donde pertenece el contacto a buscar
	 * @return contacto que se busco 
	 * @throws Exception si falla la operacion
	 */
	public Contacto buscar (Empresa emp) throws Exception;
	
	/**
	 * Metodo  que permite editar un contacto
	 * @param con contacto que se quiere editar
	 * @throws Exception si la falla la operacion
	 */
	public void editar (Contacto con) throws Exception;

}
