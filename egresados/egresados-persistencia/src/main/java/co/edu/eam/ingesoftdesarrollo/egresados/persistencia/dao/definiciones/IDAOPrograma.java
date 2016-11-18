package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;

/**
 * IDAO de la clase Programa
 * @author LuchoBolivar
 *
 */
public interface IDAOPrograma {
	
	/**
	 * Metodo que permite registrar un programa
	 * @param p programa que se va a registrar
	 * @throws Exception si falla la operacion
	 */
	public void registrar (Programa p) throws Exception;
	
	/**
	 * Metodo  que permite editar un programa
	 * @param ced del programa que se quiere editar
	 * @throws Exception si la falla la operacion
	 */
	public void editar (Programa p) throws Exception;
	
	/**
	 * Metodo para hacer una busqueda de un programa
	 * @param cod del programa a buscar
	 * @return el programa que se busco 
	 * @throws Exception si falla la operacion
	 */
	public Programa buscar (int cod) throws Exception;
	
	/**
	 * Obtiene la lista de programas registrados
	 * @return la lista de programas
	 * @throws Exception Si falla la operación
	 */
	public List<Programa> listar() throws Exception; 

}
