package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Contacto;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Empresa;

public interface IDAOContacto {
	
	public void registrar (Contacto con) throws Exception;
	
	public Contacto buscar (Empresa emp) throws Exception;
	
	public void editar (Contacto con) throws Exception;

}
