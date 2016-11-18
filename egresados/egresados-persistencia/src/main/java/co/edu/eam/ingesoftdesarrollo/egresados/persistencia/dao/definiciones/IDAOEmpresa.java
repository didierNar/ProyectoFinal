package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Ciudad;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Departamento;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Pais;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.SectorLaboral;

public interface IDAOEmpresa {
	
	public void registrar (Empresa e) throws Exception;
	
	public Empresa buscar (String nit) throws Exception;
	
	public void editar (Empresa e) throws Exception;
	
	public List<Pais> listarPaises () throws Exception;
	
	public List<Departamento> deptosPais (Pais p) throws Exception;
	
	public List<Ciudad> ciudadesDepto (Departamento dep) throws Exception;
	
	public List<SectorLaboral> listarSectorLab () throws Exception;
	
	public List<Empresa> listarEmpresas () throws Exception;

}
