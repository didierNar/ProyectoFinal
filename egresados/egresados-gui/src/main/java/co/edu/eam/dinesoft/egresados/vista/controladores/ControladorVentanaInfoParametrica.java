package co.edu.eam.dinesoft.egresados.vista.controladores;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOPrograma;

public class ControladorVentanaInfoParametrica {

	private BOPrograma boPrograma;
	
	public ControladorVentanaInfoParametrica() {
		// TODO Auto-generated constructor stub
		boPrograma = new BOPrograma();
	}
	
	public void registrar (Programa p) throws Exception{
		boPrograma.registrar(p);
	}
	
	public Programa buscar (int cod) throws Exception{
		return boPrograma.buscar(cod);
	}
	
	public void editar (Programa p) throws Exception{
		boPrograma.editar(p);
	}
	
}
