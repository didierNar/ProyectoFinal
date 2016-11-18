package co.edu.eam.dinesoft.egresados.vista.controladores;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.AreasInteres;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Facultad;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOAreaInteres;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOFacultad;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOPrograma;

/**
 * Clase controlador de la ventanaInfoParametrica
 * @author LuchoBolivar
 *
 */
public class ControladorVentanaInfoParametrica {
    
	/**
	 * declaracion del boPrograma
	 */
	private BOPrograma boPrograma;
	private BOFacultad boFacultad;
	private BOAreaInteres boAreaInteres;
	
	/**
	 * constructor de la clase ControladorVentanaInfoParametrica
	 */
	public ControladorVentanaInfoParametrica() {
		// TODO Auto-generated constructor stub
		boPrograma = new BOPrograma();
		boFacultad = new BOFacultad();
		boAreaInteres = new BOAreaInteres();
	}
	
	/**
	 * Metodo que permite registrar un programa
	 * @param p programa que se va a registrar
	 * @throws Exception si falla la operacion
	 */
	public void registrarPro (Programa p) throws Exception{
		boPrograma.registrar(p);
	}
	
	/**
	 * Metodo para hacer una busqueda de un programa 
	 * @param cod del programa que se va a buscar
	 * @return el programa que se busco
	 * @throws Exception null si el egresado no existe 
	 */
	public Programa buscarPro (int cod) throws Exception{
		return boPrograma.buscar(cod);
	}
	
	/**
	 * Metodo  que permite editar un programa 
	 * @param p el programa que se quiere editar
	 * @throws Exception si la falla la operacion
	 */
	public void editarPro (Programa p) throws Exception{
		boPrograma.editar(p);
	}
	
	public void registrarFac (Facultad f) throws Exception{
		boFacultad.registrar(f);
	}
	
	public Facultad buscarFac (int cod) throws Exception{
		return boFacultad.buscar(cod);
	}
	
	public void editarFac (Facultad f) throws Exception{
		boFacultad.editar(f);
	}
	
	public void registrarArea (AreasInteres area) throws Exception{
		boAreaInteres.registrar(area);
	}
	
	public AreasInteres buscarArea (int cod) throws Exception{
		return boAreaInteres.buscar(cod);
	}
	
	public void editarArea (AreasInteres a) throws Exception{
		boAreaInteres.editar(a);
	}
	
	public List<Facultad> listarFacultad () throws Exception{
		return boFacultad.listar();
	}
	
}
