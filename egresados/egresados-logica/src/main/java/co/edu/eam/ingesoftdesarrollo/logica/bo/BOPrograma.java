package co.edu.eam.ingesoftdesarrollo.logica.bo;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOPrograma;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa.DAOProgramaJPA;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;
import co.edu.eam.ingesoftdesarrollo.logica.excepcion.ExcepcionNegocio;

public class BOPrograma {
	
	private IDAOPrograma daoPrograma;
	
	public BOPrograma() {
		// TODO Auto-generated constructor stub
		daoPrograma = new DAOProgramaJPA();
	}
	
	public void registrar (Programa p) throws Exception{
		Programa pro = daoPrograma.buscar(p.getCodigo());
		if (pro == null){
			daoPrograma.registrar(p);
		} else {
			throw new ExcepcionNegocio("Este programa ya existe");
		}
	}
	
	public Programa buscar (int cod) throws Exception{
		Programa pro = daoPrograma.buscar(cod);
		if (pro != null){
			return pro;
		} else {
			throw new ExcepcionNegocio("No exisite este programa");
		}
	}
	
	public void editar (Programa p) throws Exception{
		daoPrograma.editar(p);
	}

}
