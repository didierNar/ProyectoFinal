package co.edu.eam.dinesoft.egresados.vista.controladores;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Contacto;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOContacto;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOEmpresa;

public class ControladorVentanaEmpresa {
	
	private BOEmpresa boEmpresa;
	private BOContacto boContacto;
	
	public ControladorVentanaEmpresa() {
	
		boEmpresa = new BOEmpresa();
		boContacto = new BOContacto();
		
	}
	
	public void registrar (Empresa em, Contacto con) throws Exception{
		boEmpresa.registrar(em);
		boContacto.registrar(con);
	}
	
	public Empresa buscar (int nit) throws Exception{
		return boEmpresa.buscar(nit);
	}
	
	public Contacto buscar (Empresa emp) throws Exception{
		return boContacto.buscar(emp);
	}	
	
	public void editar (Empresa em, Contacto con) throws Exception{
		boEmpresa.editar(em);
		boContacto.editar(con);
	}
	
	

}
