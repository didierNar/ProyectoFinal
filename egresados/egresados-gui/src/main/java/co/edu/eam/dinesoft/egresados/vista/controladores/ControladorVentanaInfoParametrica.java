package co.edu.eam.dinesoft.egresados.vista.controladores;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;
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
	
	/**
	 * constructor de la clase ControladorVentanaInfoParametrica
	 */
	public ControladorVentanaInfoParametrica() {
		// TODO Auto-generated constructor stub
		boPrograma = new BOPrograma();
	}
	
	/**
	 * Metodo que permite registrar un programa
	 * @param p programa que se va a registrar
	 * @throws Exception si falla la operacion
	 */
	public void registrar (Programa p) throws Exception{
		boPrograma.registrar(p);
	}
	
	/**
	 * Metodo para hacer una busqueda de un programa 
	 * @param cod del programa que se va a buscar
	 * @return el programa que se busco
	 * @throws Exception null si el egresado no existe 
	 */
	public Programa buscar (int cod) throws Exception{
		return boPrograma.buscar(cod);
	}
	
	/**
	 * Metodo  que permite editar un programa 
	 * @param p el programa que se quiere editar
	 * @throws Exception si la falla la operacion
	 */
	public void editar (Programa p) throws Exception{
		boPrograma.editar(p);
	}
	
}
