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

public class DAOEmpresaJPA implements IDAOEmpresa{

	public void registrar(Empresa e) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
	}

	public Empresa buscar(String nit) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Empresa.class, nit);
	}

	public void editar(Empresa e) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(e);
		em.getTransaction().commit();
	}

	public List<Pais> listarPaises() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Pais.PAISES);
		List<Pais> lista = q.getResultList();
		return lista;
	}

	public List<Departamento> deptosPais(Pais p) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Departamento.DEPARTAMENTOS_PAIS);
		q.setParameter(1, p);
		List<Departamento> lista = q.getResultList();
		return lista;
	}

	public List<Ciudad> ciudadesDepto(Departamento dep) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Ciudad.CIUDADES_DEPTO);
		q.setParameter(1, dep);
		List<Ciudad> lista = q.getResultList();
		return lista;
	}

	public List<SectorLaboral> listarSectorLab() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(SectorLaboral.LISTA_SECTORES);
		List<SectorLaboral> lista = q.getResultList();
		return lista;
	}

	/**
	 * Obtiene la lista de empresas registradas
	 */
	public List<Empresa> listarEmpresas() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Empresa.LISTA_EMPRESAS);
		List<Empresa> lista = q.getResultList();
		return lista;
	}

}
