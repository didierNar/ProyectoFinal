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
		Empresa empresa = new Empresa();
		empresa.setDireccion("boreal");
		empresa.setNit("123");
		empresa.setRazonSocial("no se");
		empresa.setTelefono("300712");
		empresa.setWeb("didiselacome");
		
		
		
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
