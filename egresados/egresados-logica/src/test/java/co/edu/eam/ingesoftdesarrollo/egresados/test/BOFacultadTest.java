package co.edu.eam.ingesoftdesarrollo.egresados.test;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Facultad;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOFacultad;

public class BOFacultadTest {

	@BeforeClass
	public static void beforeClass() {
		
	}

	private BOFacultad facultad;

	@Before
	public void setUp() {

		facultad = new BOFacultad();

	}

	@Test
	public void registrarEgresados() {

		Facultad facul = new Facultad();
		facul.setCodigo(123);
		facul.setNombre("ingenieria");

		try {

			facultad.registrar(facul);
			Facultad facult = facultad.buscar(123);
			Assert.assertNotNull(facult);

			facult.setCodigo(123);
			facult.setNombre("administracion");
			facultad.editar(facult);
			Facultad facultadB = facultad.buscar(123);
			Assert.assertEquals("administracion", facultadB.getNombre());

		} catch (Exception e) {

			e.printStackTrace();
			Assert.fail();

		}

	}

	@AfterClass
	public static void afterClass() {
		TestDataUtil.ejecutarSQL("sqltest/PruebasFacultad-Test-del.sql");

	}

}
