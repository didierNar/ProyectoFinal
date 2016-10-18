package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOFacultad;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Facultad;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.utilidades.AdministradorEntityManager;

public class DAOFacultadJPA implements IDAOFacultad{

	public List<Facultad> listar() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Facultad.LISTA_FACULTADES);
		List<Facultad> lista = q.getResultList();
		return lista;
	}

	public List<Programa> programasFacultad(Facultad f) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Programa.PROGRAMAS_FACULTAD);
		q.setParameter(1, f);
		List<Programa> lista = q.getResultList();
		return lista;
	}

}
