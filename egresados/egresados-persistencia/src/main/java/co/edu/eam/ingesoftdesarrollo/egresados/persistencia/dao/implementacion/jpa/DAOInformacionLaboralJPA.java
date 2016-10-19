package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOInformacionLaboral;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.InformacionLaboral;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.utilidades.AdministradorEntityManager;

public class DAOInformacionLaboralJPA implements IDAOInformacionLaboral{

	public void agregar(InformacionLaboral infoLab) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(infoLab);
		em.getTransaction().commit();		
	}

	public InformacionLaboral buscar(Egresado e) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(InformacionLaboral.class, e);
	}

	public void editar(InformacionLaboral infoLab) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(infoLab);
		em.getTransaction().commit();
	}

	public List<InformacionLaboral> informacionLaboralEgresado(Egresado e) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(InformacionLaboral.EGRESADOS_EMPRESA);
		q.setParameter(1, e);
		List<InformacionLaboral> lista = q.getResultList();
		return lista;
	}

}
