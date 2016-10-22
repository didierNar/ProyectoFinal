package co.edu.eam.ingesoftdesarrollo.egresados.test;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.enumeraciones.TipoEmpresa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Ciudad;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Departamento;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Pais;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.SectorLaboral;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOEmpresa;

public class BOEmpresaTest {
	
	

	@BeforeClass
	public static void beforeClass() {
//		TestDataUtil.ejecutarSQL("sqltest/PruebasEmpresa-addTest.sql");
	}

	@Before
	public void setUp() {
		boEmpresa = new BOEmpresa();
	}
	
	private BOEmpresa boEmpresa;

	@Test
	public void testRegistrar() {

		Empresa empresa = new Empresa();
		empresa.setDireccion("boreal");
		empresa.setNit("123");
		empresa.setRazonSocial("no se");
		empresa.setTelefono("300712");
		empresa.setWeb("no tiene");
		empresa.setTipo(TipoEmpresa.PRIVADA);
		Pais pais = new Pais();
		pais.setCod(567);
		pais.setNombre("colombia");
		empresa.setPais(pais);
		Departamento depar = new Departamento();
		depar.setCodigo(765);
		depar.setNombre("quindio");
		depar.setPais(pais);
		Ciudad ciud = new Ciudad();
		ciud.setCodigoCiudad(345);
		ciud.setDepartamento(depar);
		ciud.setNombre("armenia");
		empresa.setCiudad(ciud);
		SectorLaboral sectorLa = new SectorLaboral();
		sectorLa.setCodigo(765);
		sectorLa.setNombre("Contaduria");
		empresa.setSector(sectorLa);

		try {
			
			boEmpresa.registrar(empresa);
			Empresa emp = boEmpresa.buscar("123");
			Assert.assertNotNull(emp);

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}

	}

	@AfterClass
	public static void afterClass() {
		TestDataUtil.ejecutarSQL("sqltest/PruebasEmpresaTest-del.sql");
	}

}
