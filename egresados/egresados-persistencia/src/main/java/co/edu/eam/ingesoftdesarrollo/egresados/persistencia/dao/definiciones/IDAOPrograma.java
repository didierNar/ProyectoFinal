package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;

public interface IDAOPrograma {
	
	public void registrar (Programa p) throws Exception;
	
	public void editar (Programa p) throws Exception;
	
	public Programa buscar (int cod) throws Exception;

}
