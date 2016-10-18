package co.edu.eam.ingesoftdesarrollo.logica.bo;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOInformacionLaboral;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa.DAOInformacionLaboralJPA;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.InformacionLaboral;
import co.edu.eam.ingesoftdesarrollo.logica.excepcion.ExcepcionNegocio;

public class BOInformacionLaboral {

	private IDAOInformacionLaboral daoInfoLab;

	public BOInformacionLaboral() {
		// TODO Auto-generated constructor stub
		daoInfoLab = new DAOInformacionLaboralJPA();
	}

	public void agregar(InformacionLaboral infoLab) throws Exception {
		daoInfoLab.agregar(infoLab);
	}

	public InformacionLaboral buscarInfoLab(Egresado e) throws Exception {
		InformacionLaboral infoLab = daoInfoLab.buscar(e);
		if (infoLab == null) {
			throw new ExcepcionNegocio("No hay información laboral");
		} else {
			return infoLab;
		}
	}
	
	public void editar (InformacionLaboral infoLab) throws Exception{
		daoInfoLab.editar(infoLab);
	}

}
