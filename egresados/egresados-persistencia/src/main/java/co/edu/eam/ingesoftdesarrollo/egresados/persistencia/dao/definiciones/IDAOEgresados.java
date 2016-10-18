package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Egresado;

public interface IDAOEgresados {
	
	public void registrar (Egresado e) throws Exception;
	
	public Egresado buscar (String ced) throws Exception;
	
	public void eliminar (String ced) throws Exception;
	
	public void actualizar (Egresado e) throws Exception;

}
