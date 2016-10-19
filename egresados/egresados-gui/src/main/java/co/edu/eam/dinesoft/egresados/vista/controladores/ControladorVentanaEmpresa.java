package co.edu.eam.dinesoft.egresados.vista.controladores;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Ciudad;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Contacto;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Departamento;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Pais;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.SectorLaboral;
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
	
	public Empresa buscar (String nit) throws Exception{
		return boEmpresa.buscar(nit);
	}
	
	public Contacto buscar (Empresa emp) throws Exception{
		return boContacto.buscar(emp);
	}	
	
	public void editar (Empresa em, Contacto con) throws Exception{
		boEmpresa.editar(em);
		boContacto.editar(con);
	}
	
	public List<Pais> listaPaises () throws Exception{
		return boEmpresa.listaPaises();
	}
	
	public List<Departamento> deptosPais (Pais p) throws Exception{
		return boEmpresa.deptosPais(p);
	}
	
	public List<Ciudad> ciudadesDepto (Departamento d) throws Exception{
		return boEmpresa.ciudadesDepto(d);
	}
	
	public List<SectorLaboral> listaSectorLab () throws Exception{
		return boEmpresa.listaSectorLab();
	}

}
