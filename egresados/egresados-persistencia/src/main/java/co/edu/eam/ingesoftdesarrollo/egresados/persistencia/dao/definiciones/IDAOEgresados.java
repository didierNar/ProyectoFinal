package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Egresado;

/**
 * IDAO de la clase Egresado
 * @author LuchoBolivar
 *
 */
public interface IDAOEgresados {
	
	/**
	 * Metodo que permite registrar un egresado
	 * @param e egresado que se va a registrar
	 * @throws Exception si falla la operacion
	 */
	public void registrar (Egresado e) throws Exception;
	
	/**
	 * Metodo para hacer una busqueda de un egresado
	 * @param cod del egresado a buscar
	 * @return el egresado que se busco 
	 * @throws Exception si falla la operacion
	 */
	public Egresado buscar (String cod) throws Exception;
	
	/**
	 * Metodo que permite eliminar un egresado 
	 * @param ced cedula del egresado a eliminar
	 * @throws Exception si falla la operacion
	 */
	public void eliminar (String ced) throws Exception;
	
	/**
	 * Metodo  que permite editar un egresado
	 * @param ced del egresado que se quiere editar
	 * @throws Exception si la falla la operacion
	 */
	public void actualizar (Egresado e) throws Exception;
	
	/**
	 * Metodo que permite listar los egresados
	 * @return lista de egresados
	 * @throws Exception si falla la operacion
	 */
	public List<Egresado> listar () throws Exception;

}
