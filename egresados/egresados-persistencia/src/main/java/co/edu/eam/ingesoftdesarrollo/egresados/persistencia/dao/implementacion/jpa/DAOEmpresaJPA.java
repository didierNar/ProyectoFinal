package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOEmpresa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Ciudad;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Departamento;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Pais;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.SectorLaboral;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.utilidades.AdministradorEntityManager;

/**
 * DAO de la clase empresa
 * @author LuchoBolivar
 *
 */
public class DAOEmpresaJPA implements IDAOEmpresa{

	/**
	 * Metodo que permite registrar una empresa
	 * @param e empresa que se va a registrar
	 * @throws Exception si falla la operacion
	 */
	public void registrar(Empresa e) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
	}

	/**
	 * Metodo para hacer una busqueda de un empresa
	 * @param cod del empresa a buscar
	 * @return la empresa que se busco 
	 * @throws Exception si falla la operacion
	 */
	public Empresa buscar(String nit) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Empresa.class, nit);
	}

	/**
	 * Metodo que permite editar una empresa
	 * @param empresa que se quiere editar
	 * @throws Exception si la falla la operacion
	 */
	public void editar(Empresa e) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(e);
		em.getTransaction().commit();
	}

	/**
	 * metodo que lista los paises
	 */
	public List<Pais> listarPaises() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Pais.PAISES);
		List<Pais> lista = q.getResultList();
		return lista;
	}

	/**
	 * metodo que lista los departamentos
	 */
	public List<Departamento> deptosPais(Pais p) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Departamento.DEPARTAMENTOS_PAIS);
		q.setParameter(1, p);
		List<Departamento> lista = q.getResultList();
		return lista;
	}

	/**
	 * metodo que lista las ciudades
	 */
	public List<Ciudad> ciudadesDepto(Departamento dep) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Ciudad.CIUDADES_DEPTO);
		q.setParameter(1, dep);
		List<Ciudad> lista = q.getResultList();
		return lista;
	}
	
	/**
	 * metodo que lista los sectores laborales
	 */
	public List<SectorLaboral> listarSectorLab() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(SectorLaboral.LISTA_SECTORES);
		List<SectorLaboral> lista = q.getResultList();
		return lista;
	}

}
