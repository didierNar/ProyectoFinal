package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa;

import javax.persistence.EntityManager;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOContacto;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Contacto;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.utilidades.AdministradorEntityManager;

/**
 * DAO de la clase Contacto
 * @author LuchoBolivar
 *
 */
public class DAOContactoJPA implements IDAOContacto {

	/**
	 * Metodo que permite registrar un Contacto
	 * @param con contacto que se va a registrar
	 * @throws Exception si falla la operacion
	 */
	public void registrar(Contacto con) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(con);
		em.getTransaction().commit();		
	}
	
	/**
	 * Metodo para hacer una busqueda de un contacto
	 * @param emp empresa a la que pertence el contacto a buscar
	 * @return el contacto que se busco 
	 * @throws Exception si falla la operacion
	 */
	public Contacto buscar(Empresa emp) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Contacto.class, emp.getNit());
	}

	/**
	 * Metodo que permite editar un areaInteres
	 * @param AreaInteres que se quiere editar
	 * @throws Exception si la falla la operacion
	 */
	public void editar(Contacto con) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(con);
		em.getTransaction().commit();	
	}

}
