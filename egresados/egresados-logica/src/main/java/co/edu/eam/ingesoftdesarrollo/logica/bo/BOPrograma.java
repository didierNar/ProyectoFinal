package co.edu.eam.ingesoftdesarrollo.logica.bo;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOPrograma;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa.DAOProgramaJPA;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;
import co.edu.eam.ingesoftdesarrollo.logica.excepcion.ExcepcionNegocio;

/**
 * Bo de la clase Programa
 * @author LuchoBolivar
 *
 */
public class BOPrograma {
	
	/**
	 * declaracion de la clase IDAOPrograma
	 */
	private IDAOPrograma daoPrograma;
	
	/**
	 * constructor de la clase BOEmpresa
	 */
	public BOPrograma() {
		// TODO Auto-generated constructor stub
		daoPrograma = new DAOProgramaJPA();
	}
	
	/**
     * Metodo que permite registrar a un programa 
     * @param p el programa que se desea registrar
     * @throws Exception si el programa que se decea registrar ya existe
     */
	public void registrar (Programa p) throws Exception{
		Programa pro = daoPrograma.buscar(p.getCodigo());
		if (pro == null){
			daoPrograma.registrar(p);
		} else {
			throw new ExcepcionNegocio("Este programa ya existe");
		}
	}
	
	/**
	 * Metodo que permite buscar a un programa 
	 * @param cod codigo del programa que se decea buscar
	 * @return el programa
	 * @throws Exception si el programa no existe 
	 */
	public Programa buscar (int cod) throws Exception{
		Programa pro = daoPrograma.buscar(cod);
		if (pro != null){
			return pro;
		} else {
			throw new ExcepcionNegocio("No exisite este programa");
		}
	}
	
	/**
	 * Metodo que permite editar un programa
	 * @param p el programa que se decea editar
	 * @throws Exception si falla la operacion
	 */
	public void editar (Programa p) throws Exception{
		daoPrograma.editar(p);
	}
	
	/**
	 * Obtiene la lista de programas registrados
	 * @return la lista de programas registrados
	 * @throws Exception si falla la operación
	 */
	public List<Programa> listar () throws Exception{
		return daoPrograma.listar();
	}

}
