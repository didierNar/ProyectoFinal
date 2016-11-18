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

public class BOEmpresa {
	
	private IDAOEmpresa daoEmpresa;
	
	public BOEmpresa() {
		// TODO Auto-generated constructor stub
		daoEmpresa = new DAOEmpresaJPA();
	}
	
	public void registrar (Empresa em) throws Exception{
		Empresa emp = daoEmpresa.buscar(em.getNit());
		if (emp == null){
			daoEmpresa.registrar(em);
		} else {
			throw new ExcepcionNegocio("Ya existe una empresa registrada con este NIT");
		}
	}
	
	public Empresa buscar (String nit) throws Exception{
		Empresa em = daoEmpresa.buscar(nit);
		if (em != null){
			return em;
		} else {
			throw new ExcepcionNegocio("Esta empresa no esta registrada");
		}
	}
	
	public void editar (Empresa em) throws Exception{
		daoEmpresa.editar(em);
	}
	
	public List<Pais> listaPaises () throws Exception{
		return daoEmpresa.listarPaises();
	}
	
	public List<Departamento> deptosPais (Pais p) throws Exception{
		return daoEmpresa.deptosPais(p);
	}
	
	public List<Ciudad> ciudadesDepto (Departamento d) throws Exception{
		return daoEmpresa.ciudadesDepto(d);
	}
	
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
