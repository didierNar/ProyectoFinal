package co.edu.eam.dinesoft.egresados.vista.controladores;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.AreasInteres;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Facultad;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOAreaInteres;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOFacultad;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOPrograma;

public class ControladorVentanaInfoParametrica {

	private BOPrograma boPrograma;
	private BOFacultad boFacultad;
	private BOAreaInteres boAreaInteres;
	
	public ControladorVentanaInfoParametrica() {
		// TODO Auto-generated constructor stub
		boPrograma = new BOPrograma();
		boFacultad = new BOFacultad();
		boAreaInteres = new BOAreaInteres();
	}
	
	public void registrarPro (Programa p) throws Exception{
		boPrograma.registrar(p);
	}
	
	public Programa buscarPro (int cod) throws Exception{
		return boPrograma.buscar(cod);
	}
	
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
