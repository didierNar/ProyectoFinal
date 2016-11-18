package co.edu.eam.ingesoftdesarrollo.logica.bo;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOEmpresa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa.DAOEmpresaJPA;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Ciudad;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Departamento;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Pais;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.SectorLaboral;
import co.edu.eam.ingesoftdesarrollo.logica.excepcion.ExcepcionNegocio;

/**
 * BO de la clase Empresa
 * @author LuchoBolivar
 *
 */
public class BOEmpresa {
	
	/**
	 * declaracion de la clase IDAOEmpresa
	 */
	private IDAOEmpresa daoEmpresa;
	
	/**
	 * contructor de la clase BOEmpresa
	 */
	public BOEmpresa() {
		// TODO Auto-generated constructor stub
		daoEmpresa = new DAOEmpresaJPA();
	}
	
	/**
	 * MEtodo que permite registrar a una empresa
	 * @param em empresa la cual se quiere registrar
	 * @throws Exception si falla la operacion
	 */
	public void registrar (Empresa em) throws Exception{
		Empresa emp = daoEmpresa.buscar(em.getNit());
		if (emp == null){
			daoEmpresa.registrar(em);
		} else {
			throw new ExcepcionNegocio("Ya existe una empresa registrada con este NIT");
		}
	}
    
	/**
	 * Metodo que permite buscar a una empresa 
	 * @param nit de la empresa que se decea buscar
	 * @return la empresa
	 * @throws Exception si la empresa no existe 
	 */
	public Empresa buscar (String nit) throws Exception{
		Empresa em = daoEmpresa.buscar(nit);
		if (em != null){
			return em;
		} else {
			throw new ExcepcionNegocio("Esta empresa no esta registrada");
		}
	}
	
	/**
	 * Metodo que permite editar una empresa 
	 * @param em la empresa que se decea editar
	 * @throws Exception si falla la operacion
	 */
	public void editar (Empresa em) throws Exception{
		daoEmpresa.editar(em);
	}
	
	/**
	 * Metodo que lista los paises 
	 * @return la lista de paises
	 * @throws Exception si falla la operacion
	 */
	public List<Pais> listaPaises () throws Exception{
		return daoEmpresa.listarPaises();
	}
	
	/**
	 * Metodo que lista los departamentos 
	 * @return la lista de los departamentos
	 * @throws Exception si falla la operacion
	 */
	public List<Departamento> deptosPais (Pais p) throws Exception{
		return daoEmpresa.deptosPais(p);
	}
	
	/**
	 * Metodo que lista las ciudades 
	 * @return la lista de las ciudades
	 * @throws Exception si falla la operacion
	 */
	public List<Ciudad> ciudadesDepto (Departamento d) throws Exception{
		return daoEmpresa.ciudadesDepto(d);
	}
	
	/**
	 * Metodo que lista los sectores laborales 
	 * @return la lista de los sectores laborales
	 * @throws Exception si falla la operacion
	 */
	public List<SectorLaboral> listaSectorLab () throws Exception{
		return daoEmpresa.listarSectorLab();
	}
	
	/**
	 * Obtiene la lista de empresas registradas
	 * @return la lista de empresas
	 * @throws Exception si falla la operación
	 */
	public List<Empresa> listaEmpresas () throws Exception{
		return daoEmpresa.listarEmpresas();
	}

}
