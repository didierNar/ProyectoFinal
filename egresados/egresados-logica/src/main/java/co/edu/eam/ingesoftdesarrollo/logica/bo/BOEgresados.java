package co.edu.eam.ingesoftdesarrollo.logica.bo;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOEgresados;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa.DAOEgresadoJPA;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoftdesarrollo.logica.excepcion.ExcepcionNegocio;

/**
 * BOEgresados
 * @author LuchoBolivar
 *
 */
public class BOEgresados {
    
	/**
	 * declaracion de la clase IDAOEgresados
	 */
	private IDAOEgresados daoEgresados;
    
	/**
	 * Constructor de la clase BOEgresado
	 */
	public BOEgresados() {
		// TODO Auto-generated constructor stub
		daoEgresados = new DAOEgresadoJPA();
	}
	
    /**
     * Metodo que permite registrar a un egresado 
     * @param e el egresado que se desea registrar
     * @throws Exception si el egresado que se decea registrar ya existe
     */
	public void registrar(Egresado e) throws Exception {
		Egresado egr = daoEgresados.buscar(e.getNumDocumento());
		if (egr == null) {
			daoEgresados.registrar(e);
		} else {
			throw new ExcepcionNegocio("Ya existe un egresado con este n�mero de c�dula");
		}
	}

	/**
	 * Metodo que permite buscar a un egresado 
	 * @param cod codigo del egresado que se decea buscar
	 * @return el egresado
	 * @throws Exception si el egresado no existe 
	 */
	public Egresado buscar(String cod) throws Exception {
		Egresado egr = daoEgresados.buscar(cod);
		if (egr != null) {
			return egr;
		} else {
			throw new ExcepcionNegocio("No existe!!!");
		}
	}

	/**
	 * Metodo que permite eliminar un egresado
	 * @param ced codigo del egresado que se decea buscar
	 * @throws Exception
	 */
	public void eliminar(String ced) throws Exception {
		daoEgresados.eliminar(ced);
	}
    
	/**
	 * Metodo que permite editar un egresado 
	 * @param e el egresado que se decea editar
	 * @throws Exception si falla la operacion
	 */
	public void actualizar(Egresado e) throws Exception {
		daoEgresados.actualizar(e);
	}

}
