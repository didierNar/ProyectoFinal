package co.edu.eam.ingesoftdesarrollo.logica.bo;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOContacto;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa.DAOContactoJPA;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Contacto;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Empresa;

/**
 * BO de la clase contacto
 * @author LuchoBolivar
 *
 */
public class BOContacto {
	
	/**
	 * declaracion de la clase IDAOContacto
	 */
	private IDAOContacto daoContacto;
	
	/**
	 * constructor de la clase BOContacto
	 */
	public BOContacto() {
		// TODO Auto-generated constructor stub
		daoContacto = new DAOContactoJPA();
	}
	
	/**
	 * Metodo que permite registrar un contacto
	 * @param con el contacto que se desea registrar
	 * @throws Exception si falla la operacion
	 */
	public void registrar (Contacto con) throws Exception{
		daoContacto.registrar(con);
	}
	
	/**
	 * Metodo que permite buscar a un contacto 
	 * @param emp la empresa a la que pertence el contacto
	 * @return el contacto
	 * @throws Exception si falla la operacion
	 */
	public Contacto buscar (Empresa emp) throws Exception{
		return daoContacto.buscar(emp);
	}
	
	/**
	 * Metodo que permite editar un contacto 
	 * @param con el contacto que se quiere editar 
	 * @throws Exception si falla la operacion
	 */
	public void editar (Contacto con) throws Exception{
		daoContacto.editar(con);
	}

}
