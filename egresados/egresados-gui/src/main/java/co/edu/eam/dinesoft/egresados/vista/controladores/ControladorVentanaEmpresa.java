package co.edu.eam.dinesoft.egresados.vista.controladores;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Ciudad;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Contacto;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Departamento;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Pais;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.SectorLaboral;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOContacto;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOEmpresa;

/**
 * Clase controlador de la ventana empresa
 * @author LuchoBolivar
 *
 */
public class ControladorVentanaEmpresa {
	
	/**
	 * declaracion del BOEmpresa
	 */
	private BOEmpresa boEmpresa;
	
	/**
	 * declaracion del BOContacto
	 */
	private BOContacto boContacto;
	
	/**
	 * constructor de la clase ControladorVentanaEmpresa
	 */
	public ControladorVentanaEmpresa() {
	
		boEmpresa = new BOEmpresa();
		boContacto = new BOContacto();
		
	}
	
	/**
	 * Metodo que permite registrar una empresa
	 * @param em empresa que se va a registrar
	 * @param con contacto de la empresa
	 * @throws Exception si falla la operacion
	 */
	public void registrar (Empresa em, Contacto con) throws Exception{
		boEmpresa.registrar(em);
		boContacto.registrar(con);
	}
	
	/**
	 * Metodo para hacer una busqueda de una empresa
	 * @param nit de la empresa a buscar
	 * @return la empresa que se busco 
	 * @throws Exception si falla la operacion 
	 */
	public Empresa buscar (String nit) throws Exception{
		return boEmpresa.buscar(nit);
	}
	
	/**
	 * Metodo para hacer una busqueda de un contacto
	 * @param emp la empresa a la cual pertense el contacto
	 * @return el contacto que busco 
	 * @throws Exception si falla la operacion
	 */
	public Contacto buscar (Empresa emp) throws Exception{
		return boContacto.buscar(emp);
	}	
	
	/**
	 * Metodo  que permite editar una empresa 
	 * @param em la empresa que se quiere editar
	 * @param con contacto de la empresa que se quiere editar
	 * @throws Exception si falla la operacion
	 */
	public void editar (Empresa em, Contacto con) throws Exception{
		boEmpresa.editar(em);
		boContacto.editar(con);
	}
	
	/**
	 * Metodo que lista los paises
	 * @return la lista de paises
	 * @throws Exception si falla la operacion
	 */
	public List<Pais> listaPaises () throws Exception{
		return boEmpresa.listaPaises();
	}
	
	/**
	 * Metodo que lista los departamentos
	 * @return la lista de departamentos
	 * @throws Exception si falla la operacion
	 */
	public List<Departamento> deptosPais (Pais p) throws Exception{
		return boEmpresa.deptosPais(p);
	}
	
	/**
	 * Metodo que lista las ciudades
	 * @return la lista de ciudades
	 * @throws Exception si falla la operacion
	 */
	public List<Ciudad> ciudadesDepto (Departamento d) throws Exception{
		return boEmpresa.ciudadesDepto(d);
	}
	
	/**
	 * Metodo que lista los sectores laborales
	 * @return la lista de secotres laborales
	 * @throws Exception si falla la operacion
	 */
	public List<SectorLaboral> listaSectorLab () throws Exception{
		return boEmpresa.listaSectorLab();
	}

}
