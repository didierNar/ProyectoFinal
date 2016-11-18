package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOOfertaLaboral;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.OfertaLaboral;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.utilidades.AdministradorEntityManager;

public class DAOOfertaLaboralJPA implements IDAOOfertaLaboral{

	/**
	 * Obtiene la lista de ofertas laborales de un programa
	 */
	public List<OfertaLaboral> listaOfertasPrograma(Programa p) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(OfertaLaboral.OFERTAS_PROGRAMA);
		q.setParameter(1, p);
		List<OfertaLaboral> lista = q.getResultList();
		return lista;
	}

}
