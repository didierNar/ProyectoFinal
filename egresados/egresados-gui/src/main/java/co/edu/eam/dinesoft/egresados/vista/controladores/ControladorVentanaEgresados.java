package co.edu.eam.dinesoft.egresados.vista.controladores;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Facultad;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.InfoAcademica;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.InformacionLaboral;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.SectorLaboral;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOEgresados;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOFacultad;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOInfoAcademica;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOInformacionLaboral;
/**
 * Controlador de la ventana egresados
 * @author LuchoBolivar
 *
 */
public class ControladorVentanaEgresados {
    
	/**
	 * declaracion del boEgresado
	 */
	private BOEgresados boEgresados;
	
	/**
	 * declaracion del boInfoAcademica
	 */
	private BOInfoAcademica boInfoAcademica;
	
	/**
	 * declaracion del boInfoLab
	 */
	private BOInformacionLaboral boInfoLab;
	
	/**
	 * declaracion del boFacultad
	 */
	private BOFacultad boFacultad;
	
	/**
	 * Constructor clase ControladorVentanaEgresado
	 */
	public ControladorVentanaEgresados() {
		// TODO Auto-generated constructor stub
		boEgresados = new BOEgresados();
		boInfoAcademica = new BOInfoAcademica();
		boInfoLab = new BOInformacionLaboral();
		boFacultad = new BOFacultad();
	}
	
	/**
	 * Metodo que permite registrar un Egresado
	 * @param e egresado que se va a registrar
	 * @param info Informacion academica del egresado
	 * @param infoLab Informacion laboral del egresado a registrar
	 * @throws Exception si falla la operacion
	 */
	public void registrar (Egresado e, InfoAcademica info, InformacionLaboral infoLab) throws Exception{
		boEgresados.registrar(e);
		boInfoAcademica.agregar(info);
		boInfoLab.agregar(infoLab);
	}
	
	/**
	 * Metodo para hacer una busqueda de un egresado 
	 * @param ced la cedula del egresado a buscar
	 * @return el egresado que de busca 
	 * @throws Exception null si el egresado no existe 
	 */
	public Egresado buscar (String ced) throws Exception{
		return boEgresados.buscar(ced);
	}
	
	/**
	 * Metodo para hacer busqueda de informacion academica de un egresado
	 * @param e el egresado del cual se quiere encontrar informacion academica
	 * @return la informacion academica del egresado que se busco
	 * @throws Exception mensaje de no existe si no encuentra al egresado con los datos requeridos
	 */
	public InfoAcademica buscarInfoAcademica (Egresado e) throws Exception{
		return boInfoAcademica.buscarInfo(e);
	}
	
	/**
	 * Metodo para hacer busqueda de informacion laboral de un egresado
	 * @param e el egresado del cual se quiere encontrar informacion laboral
	 * @return la informacion laboral del egresado que se busco
	 * @throws Exception mensaje de no existe si no encuentra al egresado con los datos requeridos
	 */
	public InformacionLaboral buscarInfoLab (Egresado e) throws Exception{
		return boInfoLab.buscarInfoLab(e);
	}
	
	/**
	 * Metodo el cual lista las facultades 
	 * @return las facultades que estan registradas
	 * @throws Exception si falla la operacion
	 */
	public List<Facultad> listaFacultades () throws Exception{
		return boFacultad.listar();
	}
	
	/**
	 * Metodo que lista los programas de una facultad
	 * @param f la facultad a la cual se le quieren listar los programas
	 * @return la lista de programas que contiene la facultad buscada
	 * @throws Exception si falla la operacion
	 */
	public List<Programa> programasFacultad (Facultad f) throws Exception{
		return boFacultad.programasFacultad(f);
	}
	
	/**
	 * Metodo  que permite editar un egresado 
	 * @param e el egresado que se quiere editar
	 * @param info la informacion academica del egresado que se quiere editar
	 * @param infoLab la informacion laboral del egresado que se quiere editar
	 * @throws Exception si la falla la operacion
	 */
	public void actualizar (Egresado e, InfoAcademica info, InformacionLaboral infoLab) throws Exception{
		boEgresados.actualizar(e);
		boInfoAcademica.editarInfo(info);
		boInfoLab.editar(infoLab);
	}
	
	/**
	 * Metodo que lista los sectores laborales
	 * @return la lista de secotres laborales
	 * @throws Exception si falla la operacion
	 */
	public List<SectorLaboral> listaSectores () throws Exception{
		return boInfoLab.listaSectores();
	}
	
}
