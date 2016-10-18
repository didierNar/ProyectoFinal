package co.edu.eam.ingesoftdesarrollo.logica.bo;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOInfoAcademica;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa.DAOInfoAcademicaJPA;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.InfoAcademica;
import co.edu.eam.ingesoftdesarrollo.logica.excepcion.ExcepcionNegocio;

public class BOInfoAcademica {

	private IDAOInfoAcademica daoInfoAcademica;

	public BOInfoAcademica() {
		// TODO Auto-generated constructor stub
		daoInfoAcademica = new DAOInfoAcademicaJPA();
	}

	public void agregar(InfoAcademica info) throws Exception {
		daoInfoAcademica.agregar(info);
	}

	public InfoAcademica buscarInfo (Egresado e) throws Exception {
		InfoAcademica ia = daoInfoAcademica.buscar(e);
		if (ia != null) {
			return ia;
		} else {
			throw new ExcepcionNegocio("No existe información académica");
		}
	}
	
	public void editarInfo (InfoAcademica info) throws Exception{
		daoInfoAcademica.editarInfo(info);
	}

}
