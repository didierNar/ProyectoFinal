package co.edu.eam.ingesoftdesarrollo.logica.bo;

import java.util.ArrayList;
import java.util.List;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOEgresados;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOInformacionLaboral;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa.DAOEgresadoJPA;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa.DAOInformacionLaboralJPA;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.enumeraciones.SituacionActual;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.InformacionLaboral;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.SectorLaboral;
import co.edu.eam.ingesoftdesarrollo.logica.excepcion.ExcepcionNegocio;

/**
 * BO de la clase InformacionLaboral
 * @author LuchoBolivar
 *
 */
public class BOInformacionLaboral {
    
	/**
	 * declaracion de la clase IDAOInformacionLaboral 
	 */
	private IDAOInformacionLaboral daoInfoLab;
	
	/**
	 * declaracion de la clase IDAOEgresado
	 */
	private IDAOEgresados daoEgresados;

    /**
     * constructor de la clase BOInformacionLaboral
     */
	public BOInformacionLaboral() {
		// TODO Auto-generated constructor stub
		daoInfoLab = new DAOInformacionLaboralJPA();
		daoEgresados = new DAOEgresadoJPA();
	}
	
	/**
     * Metodo que permite registrar una infoLaboral
     * @param infoLab la infoLaboral que se desea registrar
     * @throws Exception si falla la operacion
     */
	public void agregar(InformacionLaboral infoLab) throws Exception {
		daoInfoLab.agregar(infoLab);
	}
    
	/**
	 * Metodo que permite buscar a una infoLaboral
	 * @param e el egresa de la infolaboral que se decea buscar
	 * @return la infoLAboral del egresado
	 * @throws Exception si la infoLaboral no existe 
	 */
	public InformacionLaboral buscarInfoLab(Egresado e) throws Exception {
		InformacionLaboral infoLab = daoInfoLab.buscar(e);
		if (infoLab == null) {
			throw new ExcepcionNegocio("No hay informaci�n laboral");
		} else {
			return infoLab;
		}
	}
	
	/**
	 * Metodo que permite editar una infoLaboral 
	 * @param infoLab la infoLaboral que se decea editar
	 * @throws Exception si falla la operacion
	 */
	public void editar (InformacionLaboral infoLab) throws Exception{
		daoInfoLab.editar(infoLab);
	}
	
	/**
	 * Metodo que permite listar infoLaboral
	 * @return lista de infoLaboral
	 * @throws Exception si falla la operacion
	 */
	public List<InformacionLaboral> listaEgresadosEnEmpresa (Empresa e) throws Exception{
		return daoInfoLab.informacionLaboralEgresado(e);
	}
	
	/**
	 * Metodo que permite listar los sectoresLaborales
	 * @return lista de sectores laborales
	 * @throws Exception si falla la operacion
	 */
	public List<SectorLaboral> listaSectores () throws Exception{
		return daoInfoLab.listaSectores();
	}
	
	/**
	 * Obtiene la informaci�n laboral de un programa
	 * @param p el programa
	 * @return la informaci�n laboral
	 * @throws Exception si falla la operaci�n
	 */
	public List<InformacionLaboral> infoLabPro (Programa p) throws Exception{
		return daoInfoLab.infoLabPrograma(p);
	}
	
	/**
	 * Obtiene la lista de informaci�n laboral
	 * @return la lista de informaci�n laboral
	 * @throws Exception si falla la operaci�n
	 */
	public List<InformacionLaboral> listarInfoLab () throws Exception{
		return daoInfoLab.listarInfoLab();
	}

}
