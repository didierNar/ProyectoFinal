package co.edu.eam.ingesoftdesarrollo.egresados.test;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Facultad;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOEgresados;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOFacultad;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOPrograma;
import junit.framework.Assert;

public class BOEgresadosTest {

	@BeforeClass
	public static void beforeClass() {
		TestDataUtil.ejecutarSQL("sqltest/PruebasUnitarias-addTest-add.sql");
	}

	private BOEgresados egresados;
	private BOPrograma programa;
	private BOFacultad facultad;

	@Before
	public void setUp() {
		egresados = new BOEgresados();
		programa = new BOPrograma();
		facultad = new BOFacultad();
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
			Egresado egre = egresados.buscar("321");
			Assert.assertNotNull(egre);

		} catch (Exception e) {

			e.printStackTrace();
			Assert.fail();

		}

	}

	@AfterClass
	public static void afterClass() {
		TestDataUtil.ejecutarSQL("sqltest/PruebasUnitariasTest-del.sql");

	}

}
