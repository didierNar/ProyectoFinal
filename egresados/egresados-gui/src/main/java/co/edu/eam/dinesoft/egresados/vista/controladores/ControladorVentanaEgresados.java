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

public class ControladorVentanaEgresados {

	private BOEgresados boEgresados;
	private BOInfoAcademica boInfoAcademica;
	private BOInformacionLaboral boInfoLab;
	private BOFacultad boFacultad;
	
	public ControladorVentanaEgresados() {
		// TODO Auto-generated constructor stub
		boEgresados = new BOEgresados();
		boInfoAcademica = new BOInfoAcademica();
		boInfoLab = new BOInformacionLaboral();
		boFacultad = new BOFacultad();
	}
	
	public void registrar (Egresado e, InfoAcademica info, InformacionLaboral infoLab) throws Exception{
		boEgresados.registrar(e);
		boInfoAcademica.agregar(info);
		boInfoLab.agregar(infoLab);
	}
	
	public Egresado buscar (String ced) throws Exception{
		return boEgresados.buscar(ced);
	}
	
	public InfoAcademica buscarInfoAcademica (Egresado e) throws Exception{
		return boInfoAcademica.buscarInfo(e);
	}
	
	public InformacionLaboral buscarInfoLab (Egresado e) throws Exception{
		return boInfoLab.buscarInfoLab(e);
	}
	
//	public void eliminar (String ced) throws Exception{
//		boEgresados.eliminar(ced);
//	}
	
	public List<Facultad> listaFacultades () throws Exception{
		return boFacultad.listar();
	}
	
	public List<Programa> programasFacultad (Facultad f) throws Exception{
		return boFacultad.programasFacultad(f);
	}
	
	public void actualizar (Egresado e, InfoAcademica info, InformacionLaboral infoLab) throws Exception{
		boEgresados.actualizar(e);
		boInfoAcademica.editarInfo(info);
		boInfoLab.editar(infoLab);
	}
	
	public List<SectorLaboral> listaSectores () throws Exception{
		return boInfoLab.listaSectores();
	}
	
}
