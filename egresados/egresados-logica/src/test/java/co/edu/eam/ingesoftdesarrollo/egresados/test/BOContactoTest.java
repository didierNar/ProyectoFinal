package co.edu.eam.ingesoftdesarrollo.egresados.test;

import org.junit.Assert;
import org.junit.Test;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.enumeraciones.TipoEmpresa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Ciudad;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Contacto;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Departamento;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Pais;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.SectorLaboral;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOContacto;

public class BOContactoTest {
	
	private BOContacto boContacto;
	
	public BOContactoTest() {
		// TODO Auto-generated constructor stub
		boContacto = new BOContacto();
	}
	
	@Test
	private void testRegistro(){
		
		try{
		
		Contacto con = new Contacto();
		
		con.setCargo("aseo");
		con.setCorreo("@@@");
		
		Empresa em = new Empresa();
		em.setNit("111");
		
		SectorLaboral sector = new SectorLaboral();
		sector.setCodigo(111);
		sector.setNombre("el sector");
		
		em.setSector(sector);
		em.setRazonSocial("no se");
		
		Departamento depto = new Departamento();
		depto.setCodigo(111);
		depto.setNombre("Bolivar");
		
		Pais pais = new Pais();
		pais.setCod(111);
		pais.setNombre("España");
		
		depto.setPais(pais);
		
		em.setTelefono("123123");
		em.setTipo(TipoEmpresa.PRIVADA);
		em.setWeb("No tiene");
		em.setDireccion("cualquiera");
		
		Ciudad ciudad = new Ciudad();
		ciudad.setCodigoCiudad(111);
		ciudad.setDepartamento(depto);
		ciudad.setNombre("no se");
		
		em.setCiudad(ciudad);
		em.setPais(pais);
		
		con.setEmpresa(em);
		con.setNombre("Mara");
		con.setTel("234");
		
		boContacto.registrar(con);
		
		boContacto.buscar(em);
		
		} catch (Exception e){
			e.printStackTrace();
			Assert.fail();
		}
		
	}

}
