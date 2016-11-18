package co.edu.eam.ingesoftdesarrollo.logica.bo;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOOfertaLaboral;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa.DAOOfertaLaboralJPA;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.OfertaLaboral;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;

public class BOOfertaLaboral {

	private IDAOOfertaLaboral daoOferta;
	
	public BOOfertaLaboral() {
		// TODO Auto-generated constructor stub
		daoOferta = new DAOOfertaLaboralJPA();
	}
	
	/**
	 * Obtiene la lista de ofertas laborales de un determinado programa
	 * @param p el programa
	 * @return la lista de ofertas
	 * @throws Exception si falla la operación
	 */
	public List<OfertaLaboral> ofertasPorPrograma (Programa p) throws Exception{
		return daoOferta.listaOfertasPrograma(p);
	}
	
	/**
	 * Obtiene la lista de ofertas
	 * @return la lista de ofertas
	 * @throws Exception si falla la operación
	 */
	public List<OfertaLaboral> listaOfertas () throws Exception{
		return daoOferta.listarOfertas();
	}
	
}
