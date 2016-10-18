package co.edu.eam.ingesoftdesarrollo.logica.bo;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOFacultad;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa.DAOFacultadJPA;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Facultad;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;

public class BOFacultad {

	private IDAOFacultad daoFacultad;
	
	public BOFacultad() {
		// TODO Auto-generated constructor stub
		daoFacultad = new DAOFacultadJPA();
	}
	
	public List<Facultad> listar () throws Exception{
		return daoFacultad.listar();
	}
	
	public List<Programa> programasFacultad (Facultad f) throws Exception{
		return daoFacultad.programasFacultad(f);
	}
	
}
