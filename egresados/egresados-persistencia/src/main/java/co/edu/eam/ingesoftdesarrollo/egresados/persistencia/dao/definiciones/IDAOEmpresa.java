package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Ciudad;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Departamento;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Pais;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.SectorLaboral;

/**
 * IDAO de la clase Empresa
 * @author LuchoBolivar
 *
 */
public interface IDAOEmpresa {
	
	/**
	 * Metodo que permite registrar una empresa
	 * @param e empresa que se va a registrar
	 * @throws Exception si falla la operacion
	 */
	public void registrar (Empresa e) throws Exception;
	
	/**
	 * Metodo para hacer una busqueda de una Empresa
	 * @param nit de la empresa a buscar
	 * @return la empresa  que se busco 
	 * @throws Exception si falla la operacion
	 */
	public Empresa buscar (String nit) throws Exception;
	
	/**
	 * Metodo  que permite editar una empresa
	 * @param e la empresa que se quiere editar
	 * @throws Exception si la falla la operacion
	 */
	public void editar (Empresa e) throws Exception;
	
	/**
	 * Metodo que permite listar los paises 
	 * @return lista de paises
	 * @throws Exception si falla la operacion
	 */
	public List<Pais> listarPaises () throws Exception;
	
	/**
	 * Metodo que permite listar los departamentos
	 * @return lista de departamentos
	 * @throws Exception si falla la operacion
	 */
	public List<Departamento> deptosPais (Pais p) throws Exception;
	
	/**
	 * Metodo que permite listar las ciudades 
	 * @return lista de ciudades
	 * @throws Exception si falla la operacion
	 */
	public List<Ciudad> ciudadesDepto (Departamento dep) throws Exception;
	
	/**
	 * Metodo que permite listar los paises 
	 * @return lista de paises
	 * @throws Exception si falla la operacion
	 */
	public List<SectorLaboral> listarSectorLab () throws Exception;

}
