package co.edu.eam.ingesoftdesarrollo.egresados.test;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.AfterClass;
import org.junit.Assert;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.enumeraciones.TipoEmpresa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Ciudad;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Departamento;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Pais;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.SectorLaboral;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOEmpresa;


public class BOEmpresaTest {
	
	private BOEmpresa boEmpresa;
	
	public BOEmpresaTest() {
		boEmpresa = new BOEmpresa();
	}
	
	@BeforeClass
	public static void beforeClass(){
		TestDataUtil.ejecutarSQL("sqltest/PruebasEmpresa-addTest.sql");
	}
	
	@Test
	public void testRegistrar(){
		
		try{
		
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
		
		boEmpresa.registrar(em);
		
		boEmpresa.buscar("111");
		
		} catch (Exception e){
			e.printStackTrace();
			Assert.fail();
		}
		
	}
	
	@AfterClass
	public static void afterClass(){
		TestDataUtil.ejecutarSQL("sqltest/PruebasEmpresaTest-del.sql");
	}
	

}
