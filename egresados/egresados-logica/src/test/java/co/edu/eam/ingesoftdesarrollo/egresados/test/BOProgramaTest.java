package co.edu.eam.ingesoftdesarrollo.egresados.test;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Facultad;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOFacultad;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOPrograma;
import junit.framework.Assert;

public class BOProgramaTest {

	@BeforeClass
	public static void beoreClass() {
		TestDataUtil.ejecutarSQL("sqltest/PruebasPrograma-addTest-add.sql");
	}

	private BOPrograma programa;
	private BOFacultad facultad;

	@Before
	public void setUp() {
		programa = new BOPrograma();
		facultad = new BOFacultad();
	}

	@Test
	public void registrarEgresados() {

		Programa progra = new Programa();
		progra.setCodigo(123);
		progra.setCreditosPrograma("5");
		progra.setNomPrograma("matematicas");

		try {
			Facultad facul = facultad.buscar(432);
			progra.setFacultad(facul);
			programa.registrar(progra);
			Programa program = programa.buscar(123);
			Assert.assertNotNull(program);

		} catch (Exception e) {

			e.printStackTrace();
			Assert.fail();

		}

	}

	@AfterClass
	public static void afterClass() {
		TestDataUtil.ejecutarSQL("sqltest/PruebasPrograma-Test-del.sql");

	}

}
