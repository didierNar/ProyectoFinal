package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;

public interface IDAOPrograma {
	
	public void registrar (Programa p) throws Exception;
	
	public void editar (Programa p) throws Exception;
	
	public Programa buscar (int cod) throws Exception;
	
	/**
	 * Obtiene la lista de programas registrados
	 * @return la lista de programas
	 * @throws Exception Si falla la operación
	 */
	public List<Programa> listar() throws Exception; 

}
