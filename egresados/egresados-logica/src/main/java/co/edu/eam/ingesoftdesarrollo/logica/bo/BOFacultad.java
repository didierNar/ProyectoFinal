package co.edu.eam.ingesoftdesarrollo.logica.bo;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOFacultad;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa.DAOFacultadJPA;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Facultad;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;
import co.edu.eam.ingesoftdesarrollo.logica.excepcion.ExcepcionNegocio;

/**
 * BO de la clase facultad
 * @author LuchoBolivar
 *
 */
public class BOFacultad {
	
    /**
     * Declaracion de la clase IDAOFacultad
     */
	private IDAOFacultad daoFacultad;
	
	/**
	 * constructor de la clase BOFacultad
	 */
	public BOFacultad() {
		// TODO Auto-generated constructor stub
		daoFacultad = new DAOFacultadJPA();
	}
	
	/**
	 * Metodo que lista las facultades
	 * @return la lista de facultades
	 * @throws Exception si falla la operacion
	 */
	public List<Facultad> listar () throws Exception{
		return daoFacultad.listar();
	}
	
	/**
	 * Metodo que lista los programas
	 * @return la lista de programas
	 * @throws Exception si falla la operacion
	 */
	public List<Programa> programasFacultad (Facultad f) throws Exception{
		return daoFacultad.programasFacultad(f);
	}

	/**
     * Metodo que permite registrar a una facultad 
     * @param f la facultad que se desea registrar
     * @throws Exception si la facultad que se decea registrar ya existe
     */
	public void registrar (Facultad f) throws Exception{
		Facultad fac = daoFacultad.buscar(f.getCodigo());
		if (fac != null){
			throw  new ExcepcionNegocio("La facultad con este c�digo ya se encuentra registrada");
		} else {
			daoFacultad.registrar(f);
		}
	}
	
	/**
	 * Metodo que permite buscar una facultad
	 * @param cod codigo de la facultad que se decea buscar
	 * @return la facultad
	 * @throws Exception si la facultad no existe 
	 */
	public Facultad buscar (int cod) throws Exception{
		Facultad fac = daoFacultad.buscar(cod);
		if (fac != null){
			return fac;
		} else {
			throw new ExcepcionNegocio("Esta facultad no se encuentra registrada");
		}
	}
	
	/**
	 * Metodo que permite editar una facultad 
	 * @param f al facultad que se decea editar
	 * @throws Exception si falla la operacion
	 */
	public void editar (Facultad f) throws Exception{
		daoFacultad.editar(f);
	}
	
}
