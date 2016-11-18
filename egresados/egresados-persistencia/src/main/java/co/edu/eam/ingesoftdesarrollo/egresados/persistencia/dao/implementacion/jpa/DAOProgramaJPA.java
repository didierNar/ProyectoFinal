package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOPrograma;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.utilidades.AdministradorEntityManager;

public class DAOProgramaJPA implements IDAOPrograma{

	public void registrar(Programa p) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
	}

	public void editar(Programa p) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(p);
		em.getTransaction().commit();
	}

	public Programa buscar(int cod) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Programa.class, cod);
	}

	/**
	 * Obtiene la lista de programas registrados
	 */
	public List<Programa> listar() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Programa.LISTAR_PROGRAMAS);
		List<Programa> lista = q.getResultList();
		return lista;
	}

}
