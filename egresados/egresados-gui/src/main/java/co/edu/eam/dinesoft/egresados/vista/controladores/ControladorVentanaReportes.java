package co.edu.eam.dinesoft.egresados.vista.controladores;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.InformacionLaboral;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.OfertaLaboral;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOEmpresa;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOInformacionLaboral;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOOfertaLaboral;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOPrograma;

/**
 * Clase controladora de la ventana reportes
 * @author Didier_Narv�ez
 *
 */
public class ControladorVentanaReportes {

	private BOInformacionLaboral boInfoLab;
	private BOEmpresa boEmpresa;
	private BOOfertaLaboral boOferta;
	private BOPrograma boPrograma;
	
	public ControladorVentanaReportes() {
		boInfoLab = new BOInformacionLaboral();
		boEmpresa = new BOEmpresa();
		boOferta = new BOOfertaLaboral();
		boPrograma = new BOPrograma();
	}
	
	/**
	 * Obtiene la informaci�n laboral de los egresados de una empresa
	 * @param e Empresa de la cual se desea obtener la informaci�n laboral
	 * @return Lista de empleados de la empresa
	 * @throws Exception si Falla la operaci�n
	 */
	public List<InformacionLaboral> infoLab (Empresa e) throws Exception{
		return boInfoLab.listaEgresadosEnEmpresa(e);
	}
	
	/**
	 * Lista las empresas registradas
	 * @return las empresas
	 * @throws Exception si falla la operaci�n
	 */
	public List<Empresa> listaEmpresas () throws Exception{
		return boEmpresa.listaEmpresas();
	}
	
	/**
	 * Obtiene la lista de ofertas laborales de un determinado programa
	 * @param p el programa
	 * @return la lista de ofertas
	 * @throws Exception si falla la operaci�n
	 */
	public List<OfertaLaboral> ofertaPorPrograma (Programa p) throws Exception{
		return boOferta.ofertasPorPrograma(p);
	}
	
	/**
	 * Obtiene la lista de programas registrados
	 * @return la lista de programas registrados
	 * @throws Exception si falla la operaci�n
	 */
	public List<Programa> listar () throws Exception{
		return boPrograma.listar();
	}
	
	/**
	 * Obtiene la informaci�n laboral de un programa
	 * @param p el programa
	 * @return la informaci�n laboral
	 * @throws Exception si falla la operaci�n
	 */
	public List<InformacionLaboral> infoLabPro (Programa p) throws Exception{
		return boInfoLab.infoLabPro(p);
	}
	
}
