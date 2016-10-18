package co.edu.eam.ingesoftdesarrollo.logica.bo;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOContacto;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa.DAOContactoJPA;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Contacto;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Empresa;

public class BOContacto {
	
	private IDAOContacto daoContacto;
	
	public BOContacto() {
		// TODO Auto-generated constructor stub
		daoContacto = new DAOContactoJPA();
	}
	
	public void registrar (Contacto con) throws Exception{
		daoContacto.registrar(con);
	}
	
	public Contacto buscar (Empresa emp) throws Exception{
		return daoContacto.buscar(emp);
	}
	
	public void editar (Contacto con) throws Exception{
		daoContacto.editar(con);
	}

}
