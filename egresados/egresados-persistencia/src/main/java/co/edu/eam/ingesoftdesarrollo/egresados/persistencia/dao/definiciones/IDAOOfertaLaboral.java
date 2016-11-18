package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.OfertaLaboral;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;

/**
 * Clase encargada de implementar los m�todos de Oferta Laboral
 * @author Didier_Narv�ez
 *
 */
public interface IDAOOfertaLaboral {

	/**
	 * Obtiene la lista de ofertas para un programa
	 * @param p el programa
	 * @return la lista de ofertas
	 * @throws Exception si falla la operaci�n
	 */
	public List<OfertaLaboral> listaOfertasPrograma (Programa p) throws Exception;
	
	/**
	 * Obtiene la lista de ofertas
	 * @return la lista de ofertas
	 * @throws Exception Si falla la operaci�n
	 */
	public List<OfertaLaboral> listarOfertas () throws Exception;
	
}
