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

/**
 * BO de prueba de la clase BOPrograma
 * @author LuchoBolivar
 *
 */
public class BOProgramaTest {

	/**
	 * Metodo BeforeClass
	 */
	@BeforeClass
	public static void beoreClass() {
		TestDataUtil.ejecutarSQL("sqltest/PruebasPrograma-addTest-add.sql");
	}
    
	/**
	 * declara el BOAreaInteres
	 */
	private BOPrograma programa;
	
	/**
	 * declara el BOFacultad
	 */
	private BOFacultad facultad;

	/**
	 * metodo setUp
	 */
	@Before
	public void setUp() {
		programa = new BOPrograma();
		facultad = new BOFacultad();
	}

	/**
	 * Metodo que maneja las pruebas
	 */
	@Test
	public void registrarEgresados() {

		Programa progra = new Programa();
		progra.setCodigo(123);
		progra.setCreditosPrograma(5);
		progra.setNomPrograma("matematicas");

		try {
			Facultad facul = facultad.buscar(432);
			progra.setFacultad(facul);
			programa.registrar(progra);
			Programa program = programa.buscar(123);
			Assert.assertNotNull(program);
			
			program.setCodigo(123);
			program.setCreditosPrograma(8);
			program.setNomPrograma("algebra");
			Facultad facul1 = facultad.buscar(432);
			program.setFacultad(facul1);
			programa.editar(program);
			Programa programaT = programa.buscar(123);
			Assert.assertEquals("algebra", programaT.getNomPrograma());

		} catch (Exception e) {

			e.printStackTrace();
			Assert.fail();

		}

	}

	/**
	 * metodo AfterClass
	 */
	@AfterClass
	public static void afterClass() {
         TestDataUtil.ejecutarSQL("sqltest/PruebasPrograma-Test-del.sql");

	}

}
