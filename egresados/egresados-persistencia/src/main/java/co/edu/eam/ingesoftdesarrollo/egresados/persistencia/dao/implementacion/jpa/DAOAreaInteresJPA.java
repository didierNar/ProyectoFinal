package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa;

import javax.persistence.EntityManager;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOAreaInteres;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.AreasInteres;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.utilidades.AdministradorEntityManager;

public class DAOAreaInteresJPA implements IDAOAreaInteres {

	public void registrar(AreasInteres area) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(area);
		em.getTransaction().commit();
	}

	public AreasInteres buscar(int cod) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(AreasInteres.class, cod);
	}

	public void editar(AreasInteres area) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(area);
		em.getTransaction().commit();
	}	

}
