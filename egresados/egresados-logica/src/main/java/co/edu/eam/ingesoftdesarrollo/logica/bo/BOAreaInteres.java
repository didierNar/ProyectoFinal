package co.edu.eam.ingesoftdesarrollo.logica.bo;


import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOAreaInteres;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa.DAOAreaInteresJPA;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.AreasInteres;
import co.edu.eam.ingesoftdesarrollo.logica.excepcion.ExcepcionNegocio;
/**
 * BO de la clase AreaInteres
 * @author LuchoBolivar
 *
 */
public class BOAreaInteres {
	
	/**
	 * declaracion de la clase IDAOAreaInteres 
	 */
	private IDAOAreaInteres daoArea;

	/**
	 * Constructor de la clase BOAreaInteres 
	 */
	public BOAreaInteres() {
		// TODO Auto-generated constructor stub
		daoArea = new DAOAreaInteresJPA();
	}
    
	/**
	 * Metodo que permite registrar una Area de interes
	 * @param a el area de interes que se desea registrar
	 * @throws Exception si el area de interes ya esta registrada 
	 */
	public void registrar (AreasInteres a) throws Exception{
		AreasInteres area = daoArea.buscar(a.getCodigo());
		if (area != null){
			throw new ExcepcionNegocio("El c�digo del area ya se encuentra registrado");
		} else {
			daoArea.registrar(a);
		}
	}
	
	/**
	 * Metodo que permite buscar una area de interes
	 * @param cod codigo del area de interes que se desea buscar
	 * @return el area de interes que se busca
	 * @throws Exception si el area de interes no se encontro
	 */
	public AreasInteres buscar (int cod) throws Exception{
		AreasInteres area = daoArea.buscar(cod);
		if (area != null){
			return area;
		} else {
			throw new ExcepcionNegocio("Esta area no se encuentra registrada");
		}
	}
	
	/**
	 * Metodo que permite editar un area de interes
	 * @param a el area de interes que se desea editar
	 * @throws Exception si falla la operacion
	 */
	public void editar (AreasInteres a) throws Exception{
		daoArea.editar(a);
	}
	
}
