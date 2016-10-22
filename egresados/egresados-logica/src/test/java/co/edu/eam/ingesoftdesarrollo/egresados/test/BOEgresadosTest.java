package co.edu.eam.ingesoftdesarrollo.egresados.test;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOEgresados;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOPrograma;
import junit.framework.Assert;

public class BOEgresadosTest {

	private BOEgresados egresados;
	private BOPrograma programa;

	@BeforeClass
	public static void beforeClass() {
		TestDataUtil.ejecutarSQL("sqltest/PruebasEgresados-Test-add.sql");
	}

	@Before
	public void setUp() {

		egresados = new BOEgresados();
		programa = new BOPrograma();

	}

	@Test
	public void registrarEgresados() {

		Egresado egresado = new Egresado();
		egresado.setCodigoEgresado("123");
		egresado.setApellido("Bolivar");
		egresado.setCorreo("tennluis");
		egresado.setNombre("Luis");
		egresado.setNumDocumento("321");
		egresado.setNumTel("333456");
		egresado.setTipoDocumento("cedula");

		try {

			Programa pro = programa.buscar(567);
			egresado.setCodigoPrograma(pro);
			egresados.registrar(egresado);
			Egresado egre = egresados.buscar("123");
			Assert.assertNotNull(egre);
			
			egre.setCodigoEgresado("123");
			egre.setApellido("Ramirez");
			egre.setCodigoPrograma(pro);
			egre.setCorreo("tennluis77");
			egre.setNombre("Armando");
			egre.setNumDocumento("1094");
			egre.setNumTel("300712");
			egre.setTipoDocumento("pasaporte");
			Egresado egres = egresados.buscar("123");
			Assert.assertEquals("tennluis77", egres.getCorreo());

		} catch (Exception e) {

			e.printStackTrace();
			Assert.fail();

		}

	}

	@AfterClass
	public static void afterClass() {
		TestDataUtil.ejecutarSQL("sqltest/PruebasEgresados-Test-del.sql");

	}

}
