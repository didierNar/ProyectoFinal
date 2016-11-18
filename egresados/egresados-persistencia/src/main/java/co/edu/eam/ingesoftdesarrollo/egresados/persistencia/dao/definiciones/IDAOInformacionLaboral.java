package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.InformacionLaboral;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.SectorLaboral;

/**
 * IDAO de la clase InfoLaboral
 * @author LuchoBolivar
 *
 */
public interface IDAOInformacionLaboral {

	/**
	 * Metodo que permite registrar una infoLaboral
	 * @param infoLab infoLaboral que se va a registrar
	 * @throws Exception si falla la operacion
	 */
	public void agregar (InformacionLaboral infoLab) throws Exception;
	
	/**
	 * Metodo para hacer una busqueda de una infoLaboral
	 * @param cod del egresado 	que tiene la InfoLaboral
	 * @return la infoLAboral que se busco 
	 * @throws Exception si falla la operacion
	 */
	public InformacionLaboral buscar (Egresado e) throws Exception;
	
	/**
	 * Metodo  que permite editar una infoLAboral
	 * @param infoLab infoLaboral que se quiere editar
	 * @throws Exception si la falla la operacion
	 */
	public void editar (InformacionLaboral infoLab) throws Exception;
	
	/**
	 * Metodo que permite listar la InfoLAboral de un egresado
	 * @param e el gresado al cual se le quiere listar la informacion laboral
	 * @return lista de infoLAboral
	 * @throws Exception si falla la operacion
	 */
	public List<InformacionLaboral> informacionLaboralEgresado (Empresa e) throws Exception;
	
	/**
	 * Metodo que permite listar los sectores laborales
	 * @return lista de sectores laborales
	 * @throws Exception si falla la operacion
	 */
	public List<SectorLaboral> listaSectores() throws Exception;
	
	/**
	 * Obtiene la información laboral de un programa
	 * @param p el programa
	 * @return la información laboral
	 * @throws Exception si falla la operación
	 */
	public List<InformacionLaboral> infoLabPrograma (Programa p) throws Exception;
	
}
