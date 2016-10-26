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
		
		InformacionLaboral infoLabo = new InformacionLaboral();
		infoLabo.setCargo("contador");
		Date fecha = new Date();
		fecha.setYear(2016);
		fecha.setMonth(05);
		fecha.setDate(13);
		infoLabo.setFechaIngreso(fecha);
		Date fecha2 = new Date();
		fecha2.setYear(1992);
		fecha2.setMonth(05);
		fecha2.setDate(28);
		infoLabo.setFechaSalida(fecha2);
		infoLabo.setNombreEmpresa("boreal");
		infoLabo.setSituaActual(SituacionActual.EMPLEADO);
		infoLabo.setTipoEmpresa(TipoEmpresa.PUBLICA);
		SectorLaboral sector = new SectorLaboral();
		sector.setCodigo(567);
		infoLabo.setSectorLaboral(sector);
		
		try{
			
		   Egresado egresa = boEgresados.buscar("123");
		   infoLabo.setEgresado(egresa);
		   boInfoLab.agregar(infoLabo);
		   InformacionLaboral infoLaboB = boInfoLab.buscarInfoLab(egresa);
		   Assert.assertEquals("boreal", infoLaboB.getNombreEmpresa());
		   
		   infoLaboB.setCargo("Administrador");
		   infoLaboB.setEgresado(egresa);
		   infoLaboB.setFechaIngreso(fecha);
		   infoLaboB.setFechaSalida(fecha2);
		   infoLaboB.setNombreEmpresa("no se");
		   infoLaboB.setSituaActual(SituacionActual.DESEMPLEADO);
		   infoLaboB.setSectorLaboral(sector);
		   infoLaboB.setTipoEmpresa(TipoEmpresa.PUBLICA);
		   boInfoLab.editar(infoLaboB);
		   
		   InformacionLaboral inf = boInfoLab.buscarInfoLab(egresa);
		   Assert.assertEquals("Administrador", inf.getCargo());
		   
		   
		
		
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
