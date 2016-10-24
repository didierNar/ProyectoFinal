package co.edu.eam.ingesoftdesarrollo.egresados.test;

import java.util.Date;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.enumeraciones.SituacionActual;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.enumeraciones.TipoEmpresa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.InformacionLaboral;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.SectorLaboral;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOEgresados;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOInformacionLaboral;

public class BOInformacionLaboralTest {

	@BeforeClass
	public static void beforeClass() {
		TestDataUtil.ejecutarSQL("sqltest/PruebasInfoLab-Test-add.sql");
	}
	
	private BOInformacionLaboral boInfoLab;
	private BOEgresados boEgresados;

	@Before
	public void setUp() {
		boInfoLab = new BOInformacionLaboral();
		boEgresados = new BOEgresados();
	}

	@Test
	public void testRegistro(){
		
		try{
		
		InformacionLaboral infoLab = new InformacionLaboral();
		
		Egresado egre = boEgresados.buscar("123456");
		
		infoLab.setSituaActual(SituacionActual.EMPLEADO);
		infoLab.setTipoEmpresa(TipoEmpresa.PRIVADA);
		
		infoLab.setEgresado(egre);
		
		SectorLaboral sector = new SectorLaboral();
		sector.setNombre("No se");
		sector.setCodigo(123123);
				
		infoLab.setSectorLaboral(sector);
		infoLab.setNombreEmpresa("tapp");
		
		Date fechaIng = new Date();
		fechaIng.setDate(12);
		fechaIng.setMonth(2);
		fechaIng.setYear(2000);
		
		Date fechaSal = new Date();
		fechaSal.setDate(12);
		fechaSal.setMonth(2);
		fechaSal.setYear(2016);
		
		infoLab.setFechaIngreso(fechaIng);
		infoLab.setFechaSalida(fechaSal);
		
		infoLab.setCargo("barre");
		
		boInfoLab.agregar(infoLab);
		
		InformacionLaboral info = boInfoLab.buscarInfoLab(egre);
		Assert.assertNotNull(info);
		
		} catch (Exception e){
			e.printStackTrace();
			Assert.fail();
		}
		
	}

	@AfterClass
	public static void afterClass() {
		TestDataUtil.ejecutarSQL("sqltest/PruebasInfoLab-Test-del.sql");

	}

}
