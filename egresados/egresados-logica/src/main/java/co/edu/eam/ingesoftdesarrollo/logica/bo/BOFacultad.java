package co.edu.eam.ingesoftdesarrollo.logica.bo;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOFacultad;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa.DAOFacultadJPA;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Facultad;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;
import co.edu.eam.ingesoftdesarrollo.logica.excepcion.ExcepcionNegocio;

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
	
	public void registrar (Facultad f) throws Exception{
		Facultad fac = daoFacultad.buscar(f.getCodigo());
		if (fac != null){
			throw  new ExcepcionNegocio("La facultad con este código ya se encuentra registrada");
		} else {
			daoFacultad.registrar(f);
		}
	}
	
	public Facultad buscar (int cod) throws Exception{
		Facultad fac = daoFacultad.buscar(cod);
		if (fac != null){
			return fac;
		} else {
			throw new ExcepcionNegocio("Esta facultad no se encuentra registrada");
		}
	}
	
	public void editar (Facultad f) throws Exception{
		daoFacultad.editar(f);
	}
	
}
