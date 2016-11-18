package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOInformacionLaboral;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.InformacionLaboral;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.SectorLaboral;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.utilidades.AdministradorEntityManager;

/**
 * DAO de la clase infoLaboral
 * @author LuchoBolivar
 *
 */
public class DAOInformacionLaboralJPA implements IDAOInformacionLaboral{

	/**
	 * Metodo que permite registrar infoLaboral
	 * @param infoLab infoLaboral que se va a registrar
	 * @throws Exception si falla la operacion
	 */
	public void agregar(InformacionLaboral infoLab) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(infoLab);
		em.getTransaction().commit();		
	}

	/**
	 * Metodo para hacer una busqueda de infoLaboral
	 * @param cod del empresa a buscar
	 * @return la empresa que se busco 
	 * @throws Exception si falla la operacion
	 */
	public InformacionLaboral buscar(Egresado e) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(InformacionLaboral.class, e.getCodigoEgresado());
	}

	/**
	 * Metodo que permite editar infoLaboral
	 * @param infoLab InfoLaboral que se quiere editar
	 * @throws Exception si la falla la operacion
	 */
	public void editar(InformacionLaboral infoLab) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(infoLab);
		em.getTransaction().commit();
	}

    /**
     * metodo que lista la informacion laboral
     */
	public List<InformacionLaboral> informacionLaboralEgresado(Empresa e) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(InformacionLaboral.EGRESADOS_EMPRESA);
		q.setParameter(1, e);
		List<InformacionLaboral> lista = q.getResultList();
		return lista;
	}

	/**
     * metodo que lista los sectores laborales
     */
	public List<SectorLaboral> listaSectores() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(SectorLaboral.LISTA_SECTORES);
		List<SectorLaboral> lista = q.getResultList();
		return lista;
	}

	/**
	 * Obtiene la información laboral de un programa
	 */
	public List<InformacionLaboral> infoLabPrograma(Programa p) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(InformacionLaboral.INFOLAB_PROGRAMA);
		q.setParameter(1, p);
		List<InformacionLaboral> lista = q.getResultList();
		return lista;
	}
	

}
