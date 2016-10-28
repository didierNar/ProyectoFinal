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
     TestDataUtil.ejecutarSQL("sqltest/PruebasEmpresa-addTest.sql");
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
		empresa.setPais(pais);
		
		Departamento depar = new Departamento();
		depar.setCodigo(765);
        empresa.setDepto(depar);
		
		Ciudad ciud = new Ciudad();
		ciud.setCodigoCiudad(345);
		empresa.setCiudad(ciud);
		
		SectorLaboral sectorLa = new SectorLaboral();
		sectorLa.setCodigo(432);
		empresa.setSector(sectorLa);

		try {
			
			boEmpresa.registrar(empresa);
			Empresa emp = boEmpresa.buscar("123");
			Assert.assertEquals("300712", emp.getTelefono());
		
			emp.setDireccion("unicentro");
			emp.setRazonSocial("limitada");
			emp.setTelefono("3001419");
			emp.setTipo(TipoEmpresa.PUBLICA);
			emp.setWeb("hello");
			boEmpresa.editar(emp);
			Empresa empre = boEmpresa.buscar("123");
			Assert.assertEquals("unicentro", empre.getDireccion());

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
