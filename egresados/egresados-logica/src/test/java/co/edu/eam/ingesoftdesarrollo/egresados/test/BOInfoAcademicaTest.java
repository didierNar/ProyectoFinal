package co.edu.eam.ingesoftdesarrollo.egresados.test;

import java.util.Date;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.enumeraciones.NivelAcademico;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Facultad;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.InfoAcademica;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOEgresados;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOFacultad;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOInfoAcademica;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOPrograma;
import junit.framework.Assert;

public class BOInfoAcademicaTest {
	
	
	@BeforeClass
	public static void beoreClass() {
	TestDataUtil.ejecutarSQL("sqltest/PruebasInfoAcademica-addTest-add.sql");
	}

    private BOInfoAcademica infoAcademica;
    private BOEgresados egresado;
    private BOPrograma programa;
    private BOFacultad facultad;

	@Before
	public void setUp() {
		infoAcademica = new BOInfoAcademica();
		egresado = new BOEgresados();
		programa = new BOPrograma();
		facultad = new BOFacultad();
		
	}

	@Test
	public void registrarEgresados() {
		   
		InfoAcademica info = new InfoAcademica();
		info.setAreaOfertaLaboral("contador");
		info.setNumDiploma("123");
		Date fecha = new Date();
		fecha.setDate(12);
		fecha.setMonth(3);
		fecha.setYear(2002);
		info.setNivelAcademico(NivelAcademico.DIPLOMADO);
		info.setFechaGrado(fecha);
		

		

		try {
            Egresado egre = egresado.buscar("123");
			info.setEgresado(egre);
			Facultad facul = facultad.buscar(432);
			info.setFacultad(facul);
			Programa progra = programa.buscar(12);
			info.setProgramaAcademico(progra);
			infoAcademica.agregar(info);
			InfoAcademica infoAca = infoAcademica.buscarInfo(egre);
			Assert.assertEquals("contador", infoAca.getAreaOfertaLaboral());
			
			infoAca.setAreaOfertaLaboral("Administrador");
			infoAca.setEgresado(egre);
			infoAca.setFacultad(facul);
			infoAca.setFechaGrado(fecha);
			infoAca.setNivelAcademico(NivelAcademico.POSTGRADO);
			infoAca.setNumDiploma("123");
			infoAca.setProgramaAcademico(progra);
			infoAcademica.editarInfo(infoAca);
			InfoAcademica infoAcaB = infoAcademica.buscarInfo(egre);
			Assert.assertEquals("Administrador", infoAcaB.getAreaOfertaLaboral());

		} catch (Exception e) {

			e.printStackTrace();
			Assert.fail();

		}

	}

	@AfterClass
	public static void afterClass() {
		TestDataUtil.ejecutarSQL("sqltest/PruebasInfoAcademica-Test-del.sql");

	}
	

}
