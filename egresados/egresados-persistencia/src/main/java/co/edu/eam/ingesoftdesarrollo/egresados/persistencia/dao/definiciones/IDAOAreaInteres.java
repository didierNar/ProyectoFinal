package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.AreasInteres;

public interface IDAOAreaInteres {
	
	public void registrar (AreasInteres area) throws Exception;
	
	public AreasInteres buscar (int cod) throws Exception;
	
	public void editar (AreasInteres area) throws Exception;

}
