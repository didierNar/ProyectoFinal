package co.edu.eam.ingesoftdesarrollo.logica.bo;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOEgresados;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa.DAOEgresadoJPA;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoftdesarrollo.logica.excepcion.ExcepcionNegocio;

public class BOEgresados {

	private IDAOEgresados daoEgresados;

	public BOEgresados() {
		// TODO Auto-generated constructor stub
		daoEgresados = new DAOEgresadoJPA();
	}

	public void registrar(Egresado e) throws Exception {
		Egresado egr = daoEgresados.buscar(e.getCodigoEgresado());
		if (egr == null) {
			daoEgresados.registrar(e);
		} else {
			throw new ExcepcionNegocio("Ya existe un egresado con este c�digo");
		}
	}

	public Egresado buscar(String cod) throws Exception {
		Egresado egr = daoEgresados.buscar(cod);
		if (egr != null) {
			return egr;
		} else {
			throw new ExcepcionNegocio("No existe!!!");
		}
	}

	public void eliminar(String ced) throws Exception {
		daoEgresados.eliminar(ced);
	}

	public void actualizar(Egresado e) throws Exception {
		daoEgresados.actualizar(e);
	}

}
