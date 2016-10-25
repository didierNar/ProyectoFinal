package co.edu.eam.ingesoftdesarrollo.egresados.test;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Contacto;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOContacto;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOEmpresa;

public class BOContactoTest {
	
	@BeforeClass
	public static void beforeClass() {
		TestDataUtil.ejecutarSQL("sqltest/PruebasContacto-addTest-add.sql");
	}
	
	private BOContacto contacto;
	private BOEmpresa empresa;

	@Before
	public void setUp() {

		contacto = new BOContacto();
		empresa = new BOEmpresa();

	}

	@Test
	public void registrarEgresados() {
		
		Contacto contact = new Contacto();
		contact.setCargo("Seguridad Informatica");
		contact.setCorreo("tennluis");
		contact.setNombre("Lucho");
		contact.setTel("300712");
		
		try {
			
			Empresa empre = empresa.buscar("656");
			Assert.assertNotNull(empre);
			contact.setEmpresa(empre);
			contacto.registrar(contact);
			
			Contacto contac = contacto.buscar(empre);
			Assert.assertNotNull(contac);
			
			contac.setCargo("Contador");
			contac.setCorreo("tennluis77");
			contac.setEmpresa(empre);
			contac.setNombre("Luis");
			contac.setTel("3001419");
			contacto.editar(contac);
			
			Contacto con = contacto.buscar(empre);
			Assert.assertEquals("tennluis77", con.getCorreo());

			

		} catch (Exception e) {

			e.printStackTrace();
			Assert.fail();

		}

	}

	@AfterClass
	public static void afterClass() {
		TestDataUtil.ejecutarSQL("sqltest/PruebasContacto-Test-del.sql");

	}

}
