package co.edu.eam.ingesoftdesarrollo.logica.bo;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOInfoAcademica;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa.DAOInfoAcademicaJPA;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.InfoAcademica;
import co.edu.eam.ingesoftdesarrollo.logica.excepcion.ExcepcionNegocio;

/**
 * BO de la clase InfoAcademica
 * @author LuchoBolivar
 *
 */
public class BOInfoAcademica {
    
	/**
	 * declaracion de la clase IDAOInfoAcademica
	 */
	private IDAOInfoAcademica daoInfoAcademica;

	public BOInfoAcademica() {
		// TODO Auto-generated constructor stub
		daoInfoAcademica = new DAOInfoAcademicaJPA();
	}
    
	/**
     * Metodo que permite agragar una infoAcademica
     * @param info la infoAcademica que se desea agregar
     * @throws Exception si falla la operacion
     */
	public void agregar(InfoAcademica info) throws Exception {
		daoInfoAcademica.agregar(info);
	}
    
	/**
	 * Metodo que permite buscar una infoAcademica
	 * @param e el egresado con la infoAcademica que se decea buscar
	 * @return la infoAcademica del egresado
	 * @throws Exception si el egresado no existe 
	 */
	public InfoAcademica buscarInfo (Egresado e) throws Exception {
		InfoAcademica ia = daoInfoAcademica.buscar(e);
		if (ia != null) {
			return ia;
		} else {
			throw new ExcepcionNegocio("No existe informaci�n acad�mica");
		}
	}
	
	/**
	 * Metodo que permite editar una infoAcademica 
	 * @param info infoAcademica que se decea editar
	 * @throws Exception si falla la operacion
	 */
	public void editarInfo (InfoAcademica info) throws Exception{
		daoInfoAcademica.editarInfo(info);
	}

}
