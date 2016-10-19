package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Facultad;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;

public interface IDAOFacultad {

	public List<Facultad> listar () throws Exception;
	
	public List<Programa> programasFacultad(Facultad f) throws Exception;
	
	public void registrar (Facultad f) throws Exception;
	
	public Facultad buscar (int cod) throws Exception;
	
	public void editar (Facultad f) throws Exception;
	
}
