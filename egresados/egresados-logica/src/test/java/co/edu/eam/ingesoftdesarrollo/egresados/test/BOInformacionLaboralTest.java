package co.edu.eam.ingesoftdesarrollo.egresados.test;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.enumeraciones.SituacionActual;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.enumeraciones.TipoEmpresa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Facultad;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.InformacionLaboral;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.SectorLaboral;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOInformacionLaboral;

public class BOInformacionLaboralTest {
	
	private BOInformacionLaboral boInfoLab;
	
	public BOInformacionLaboralTest() {
		// TODO Auto-generated constructor stub
		boInfoLab = new BOInformacionLaboral();
	}
	
	@Test
	private void testRegistro(){
		
		try{
		
		InformacionLaboral infoLab = new InformacionLaboral();
		
		Egresado egre = new Egresado();
		egre.setApellido("Ortiz");
		egre.setCodigoEgresado("456");
		
		Programa pro = new Programa();
		pro.setCodigo(123123);
		pro.setCreditosPrograma("50");
		
		Facultad fac = new Facultad();
		fac.setCodigo(123123);
		fac.setNombre("Administracion");
		
		pro.setFacultad(fac);
		pro.setNomPrograma("hotelería");
		
		egre.setCodigoPrograma(pro);
		egre.setCorreo("holis");
		egre.setNombre("Dario");
		egre.setNumDocumento("123123");
		egre.setNumTel("no tiene");
		egre.setTipoDocumento("cedula");
		
		infoLab.setSituaActual(SituacionActual.EMPLEADO);
		infoLab.setTipoEmpresa(TipoEmpresa.PRIVADA);
		
		SectorLaboral sector = new SectorLaboral();
		sector.setCodigo(123123);
		sector.setNombre("No se");
		
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
		
		} catch (Exception e){
			e.printStackTrace();
			Assert.fail();
		}
		
	}

}
