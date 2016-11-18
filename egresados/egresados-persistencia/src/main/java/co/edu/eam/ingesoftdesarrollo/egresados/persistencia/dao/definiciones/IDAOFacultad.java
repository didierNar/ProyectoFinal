package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Facultad;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;

/**
 * IDAO de la clase Facultad
 * @author LuchoBolivar
 *
 */
public interface IDAOFacultad {

	/**
	 * Metodo que permite listar las facultades
	 * @return lista de facultades
	 * @throws Exception si falla la operacion
	 */
	public List<Facultad> listar () throws Exception;
	
	/**
	 * Metodo que permite listar los programas
	 * @return lista de programas
	 * @throws Exception si falla la operacion
	 */
	public List<Programa> programasFacultad(Facultad f) throws Exception;
	
	/**
	 * Metodo que permite registrar una facultad
	 * @param f facultad que se va a registrar
	 * @throws Exception si falla la operacion
	 */
	public void registrar (Facultad f) throws Exception;
	
	/**
	 * Metodo para hacer una busqueda de una facultad
	 * @param cod de la facultad a buscar
	 * @return la facultad que se busco 
	 * @throws Exception si falla la operacion
	 */
	public Facultad buscar (int cod) throws Exception;
	
	/**
	 * Metodo que permite editar una facultad
	 * @param f la facultad que se quiere editar
	 * @throws Exception si la falla la operacion
	 */
	public void editar (Facultad f) throws Exception;
	
}
