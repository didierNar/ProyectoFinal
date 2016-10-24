package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa;

import javax.persistence.EntityManager;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOContacto;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Contacto;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.utilidades.AdministradorEntityManager;

public class DAOContactoJPA implements IDAOContacto {

	public void registrar(Contacto con) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(con);
		em.getTransaction().commit();		
	}

	public Contacto buscar(Empresa emp) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Contacto.class, emp.getNit());
	}

	public void editar(Contacto con) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(con);
		em.getTransaction().commit();	
	}

}
