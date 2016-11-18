package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa;

import javax.persistence.EntityManager;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOAreaInteres;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.AreasInteres;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.utilidades.AdministradorEntityManager;

/**
 * DAO de la clase areaInteres
 * @author LuchoBolivar
 *
 */
public class DAOAreaInteresJPA implements IDAOAreaInteres {
    
	/**
	 * Metodo que permite registrar un AreaInteres
	 * @param area areaInteres que se va a registrar
	 * @throws Exception si falla la operacion
	 */
	public void registrar(AreasInteres area) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(area);
		em.getTransaction().commit();
	}
    
	/**
	 * Metodo para hacer una busqueda de un areaInteres
	 * @param cod del areaInteres a buscar
	 * @return el areaInteres que se busco 
	 * @throws Exception si falla la operacion
	 */
	public AreasInteres buscar(int cod) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(AreasInteres.class, cod);
	}
    
	/**
	 * Metodo que permite editar un areaInteres
	 * @param AreaInteres que se quiere editar
	 * @throws Exception si la falla la operacion
	 */
	public void editar(AreasInteres area) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(area);
		em.getTransaction().commit();
	}	

}
