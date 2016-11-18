package co.edu.eam.dinesoft.egresados.vista.controladores;

import java.util.List;

import org.hibernate.tool.schema.extract.internal.ExtractionContextImpl;

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
 * @author Didier_Narváez
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
	 * Obtiene la información laboral de los egresados de una empresa
	 * @param e Empresa de la cual se desea obtener la información laboral
	 * @return Lista de empleados de la empresa
	 * @throws Exception si Falla la operación
	 */
	public List<InformacionLaboral> infoLab (Empresa e) throws Exception{
		return boInfoLab.listaEgresadosEnEmpresa(e);
	}
	
	/**
	 * Lista las empresas registradas
	 * @return las empresas
	 * @throws Exception si falla la operación
	 */
	public List<Empresa> listaEmpresas () throws Exception{
		return boEmpresa.listaEmpresas();
	}
	
	/**
	 * Obtiene la lista de ofertas laborales de un determinado programa
	 * @param p el programa
	 * @return la lista de ofertas
	 * @throws Exception si falla la operación
	 */
	public List<OfertaLaboral> ofertaPorPrograma (Programa p) throws Exception{
		return boOferta.ofertasPorPrograma(p);
	}
	
	/**
	 * Obtiene la lista de programas registrados
	 * @return la lista de programas registrados
	 * @throws Exception si falla la operación
	 */
	public List<Programa> listar () throws Exception{
		return boPrograma.listar();
	}
	
	/**
	 * Obtiene la información laboral de un programa
	 * @param p el programa
	 * @return la información laboral
	 * @throws Exception si falla la operación
	 */
	public List<InformacionLaboral> infoLabPro (Programa p) throws Exception{
		return boInfoLab.infoLabPro(p);
	}
	
	/**
	 * Obtiene la lista de ofertas laborales de un determinado programa
	 * @param p el programa
	 * @return la lista de ofertas
	 * @throws Exception si falla la operación
	 */
	public List<OfertaLaboral> ofertaLabPrograma (Programa p) throws Exception{
		return boOferta.ofertasPorPrograma(p);
	}
	
	/**
	 * Obtiene la lista de información laboral
	 * @return la lista de información laboral
	 * @throws Exception si falla la operación
	 */
	public List<InformacionLaboral> listarInfoLab() throws Exception{
		return boInfoLab.listarInfoLab();
	}
	
	/**
	 * Obtiene la lista de ofertas
	 * @return la lista de ofertas
	 * @throws Exception si falla la operación
	 */
	public List<OfertaLaboral> listarOfertas () throws Exception{
		return boOferta.listaOfertas();
	}
	
}
