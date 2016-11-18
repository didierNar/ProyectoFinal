package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa;

import javax.persistence.EntityManager;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOInfoAcademica;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.InfoAcademica;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.utilidades.AdministradorEntityManager;

/**
 * DAO de la clase infoAcademica
 * @author LuchoBolivar
 *
 */
public class DAOInfoAcademicaJPA implements IDAOInfoAcademica {

	/**
	 * Metodo que permite registrar infoAcademica
	 * @param info infoAcademica que se va a registrar
	 * @throws Exception si falla la operacion
	 */
	public void agregar(InfoAcademica info) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(info);
		em.getTransaction().commit();
	}

	/**
	 * Metodo para hacer una busqueda de infoAcademica
	 * @param e egresado el cual contiene la infoAcademica a buscar
	 * @return la infoAcademica que se busco 
	 * @throws Exception si falla la operacion
	 */
	public InfoAcademica buscar(Egresado e) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(InfoAcademica.class, e.getCodigoEgresado());
	}

	/**
	 * Metodo que permite editar infoAcademica
	 * @param info infoAcademica que se quiere editar
	 * @throws Exception si la falla la operacion
	 */
	public void editarInfo(InfoAcademica info) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(info);
		em.getTransaction().commit();		
	}

	
	
}
