package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.utilidades;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * clase que maneja la conexion
 * @author LuchoBolivar
 *
 */
public class AdministradorEntityManager {
	
private static EntityManager em;
	
    /**
     * Metodo que permite la conexion con la base de datos
     * @return la conexion
     */
	public static EntityManager getEntityManager(){
		
		if(em==null){
		 em = Persistence.createEntityManagerFactory("jpa_pu").createEntityManager();
		}
		return em;
		
	}

}
