package co.edu.eam.ingesoftdesarrollo.egresados.test;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.AreasInteres;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOAreaInteres;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOEgresados;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOPrograma;
import junit.framework.Assert;

/**
 * BO de prueba de la clase BOAreaInteres
 * @author LuchoBolivar
 *
 */
public class BOAreaInteresTest {
	
	/**
	 * Metodo BeforeClass
	 */
	@BeforeClass
	public static void beoreClass() {
//		TestDataUtil.ejecutarSQL("sqltest/PruebasUnitarias-addTest-add.sql");
	}
	
	/**
	 * declara el BOAreaInteres
	 */
	private BOAreaInteres areaInteres;

	/**
	 * metodo setUp
	 */
	@Before
	public void setUp() {
		
		areaInteres = new BOAreaInteres();
		
	}

	/**
	 * Metodo que maneja las pruebas
	 */
	@Test
	public void registrarEgresados() {
		
		AreasInteres area = new AreasInteres();
		area.setCodigo(123);
		area.setNombre("sistemas");

		try {

			areaInteres.registrar(area);
			AreasInteres areaIn = areaInteres.buscar(123);
			Assert.assertNotNull(areaIn);
			
			areaIn.setCodigo(123);
			areaIn.setNombre("el mismo");
			areaInteres.editar(areaIn);
			AreasInteres areaInt = areaInteres.buscar(123);
			Assert.assertEquals("el mismo", areaInt.getNombre());

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
		TestDataUtil.ejecutarSQL("sqltest/PruebasAreaInteres-Test-del.sql");

	}

}
