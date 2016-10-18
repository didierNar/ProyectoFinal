package co.edu.eam.ingesoftdesarrollo.logica.bo;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOEmpresa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa.DAOEmpresaJPA;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoftdesarrollo.logica.excepcion.ExcepcionNegocio;

public class BOEmpresa {
	
	private IDAOEmpresa daoEmpresa;
	
	public BOEmpresa() {
		// TODO Auto-generated constructor stub
		daoEmpresa = new DAOEmpresaJPA();
	}
	
	public void registrar (Empresa em) throws Exception{
		Empresa emp = daoEmpresa.buscar(em.getNit());
		if (emp == null){
			daoEmpresa.registrar(em);
		} else {
			throw new ExcepcionNegocio("Ya existe una empresa registrada con este NIT");
		}
	}
	
	public Empresa buscar (int nit) throws Exception{
		Empresa em = daoEmpresa.buscar(nit);
		if (em != null){
			return em;
		} else {
			throw new ExcepcionNegocio("Esta empresa no esta registrada");
		}
	}
	
	public void editar (Empresa em) throws Exception{
		daoEmpresa.editar(em);
	}

}
