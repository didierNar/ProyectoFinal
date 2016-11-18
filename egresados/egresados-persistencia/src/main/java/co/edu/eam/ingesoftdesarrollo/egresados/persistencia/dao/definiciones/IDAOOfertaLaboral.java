package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.OfertaLaboral;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;

/**
 * Clase encargada de implementar los métodos de Oferta Laboral
 * @author Didier_Narváez
 *
 */
public interface IDAOOfertaLaboral {

	/**
	 * Obtiene la lista de ofertas para un programa
	 * @param p el programa
	 * @return la lista de ofertas
	 * @throws Exception si falla la operación
	 */
	public List<OfertaLaboral> listaOfertasPrograma (Programa p) throws Exception;
	
	/**
	 * Obtiene la lista de ofertas
	 * @return la lista de ofertas
	 * @throws Exception Si falla la operación
	 */
	public List<OfertaLaboral> listarOfertas () throws Exception;
	
}
