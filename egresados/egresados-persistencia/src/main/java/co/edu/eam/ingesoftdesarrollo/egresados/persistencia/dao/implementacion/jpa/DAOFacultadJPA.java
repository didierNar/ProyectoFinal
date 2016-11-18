package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOFacultad;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Facultad;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.utilidades.AdministradorEntityManager;

/**
 * DAO de la clase facultad
 * @author LuchoBolivar
 *
 */
public class DAOFacultadJPA implements IDAOFacultad{

	/**
	 * metodo que lista las facultades
	 */
	public List<Facultad> listar() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Facultad.LISTA_FACULTADES);
		List<Facultad> lista = q.getResultList();
		return lista;
	}

	/**
	 * metodo que lista los programas
	 */
	public List<Programa> programasFacultad(Facultad f) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Programa.PROGRAMAS_FACULTAD);
		q.setParameter(1, f);
		List<Programa> lista = q.getResultList();
		return lista;
	}

	/**
	 * Metodo que permite registrar una facultad
	 * @param f facultad que se va a registrar
	 * @throws Exception si falla la operacion
	 */
	public void registrar(Facultad f) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(f);
		em.getTransaction().commit();
	}
	
	/**
	 * Metodo para hacer una busqueda de una facultad
	 * @param cod de la facultad a buscar
	 * @return la facultad que se busco 
	 * @throws Exception si falla la operacion
	 */
	public Facultad buscar(int cod) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Facultad.class, cod);
	}

	/**
	 * Metodo que permite editar una facultad
	 * @param facultad que se quiere editar
	 * @throws Exception si la falla la operacion
	 */
	public void editar(Facultad f) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(f);
		em.getTransaction().commit();
	}

}
