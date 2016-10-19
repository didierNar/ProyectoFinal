package co.edu.eam.ingesoftdesarrollo.logica.bo;


import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOAreaInteres;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa.DAOAreaInteresJPA;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.AreasInteres;
import co.edu.eam.ingesoftdesarrollo.logica.excepcion.ExcepcionNegocio;

public class BOAreaInteres {
	
	private IDAOAreaInteres daoArea;
	
	public BOAreaInteres() {
		// TODO Auto-generated constructor stub
		daoArea = new DAOAreaInteresJPA();
	}

	public void registrar (AreasInteres a) throws Exception{
		AreasInteres area = daoArea.buscar(a.getCodigo());
		if (area != null){
			throw new ExcepcionNegocio("El código del area ya se encuentra registrado");
		} else {
			daoArea.registrar(a);
		}
	}
	
	public AreasInteres buscar (int cod) throws Exception{
		AreasInteres area = daoArea.buscar(cod);
		if (area != null){
			return area;
		} else {
			throw new ExcepcionNegocio("Esta area no se encuentra registrada");
		}
	}
	
	public void editar (AreasInteres a) throws Exception{
		daoArea.editar(a);
	}
	
}
