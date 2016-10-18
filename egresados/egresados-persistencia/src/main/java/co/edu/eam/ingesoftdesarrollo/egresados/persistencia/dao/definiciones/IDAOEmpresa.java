package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Empresa;

public interface IDAOEmpresa {
	
	public void registrar (Empresa e) throws Exception;
	
	public Empresa buscar (int nit) throws Exception;
	
	public void editar (Empresa e) throws Exception;

}
