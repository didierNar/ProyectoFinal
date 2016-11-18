package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOEgresados;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.utilidades.AdministradorEntityManager;

/**
 * DAO de la clase egresado
 * @author LuchoBolivar
 *
 */
public class DAOEgresadoJPA implements IDAOEgresados {

	/**
	 * Metodo que permite registrar un egresados
	 * @param egresados que se va a registrar
	 * @throws Exception si falla la operacion
	 */
	public void registrar(Egresado e) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
	}

	/**
	 * Metodo para hacer una busqueda de un egresado
	 * @param cod del egresado a buscar
     * @return el egresado que se busco 
	 * @throws Exception si falla la operacion
	 */
	public Egresado buscar(String cod) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Egresado.class, cod);
	}
    
	
	public void eliminar(String ced) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		Egresado e = em.find(Egresado.class, ced);
		if (e != null) {
			em.remove(e);
		}
		em.getTransaction().commit();
	}

	/**
	 * Metodo que permite editar un egresado
	 * @param egresado que se quiere editar
	 * @throws Exception si la falla la operacion
	 */
	public void actualizar(Egresado e) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(e);
		em.getTransaction().commit();
	}
    
	/**
	 * lista que trae los egresados
	 */
	public List<Egresado> listar() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Egresado.LISTA_EGRESADOS);
		List<Egresado> lista = q.getResultList();
		return lista;
	}

}
