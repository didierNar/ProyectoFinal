package co.edu.eam.ingesoftdesarrollo.egresados.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Clase que maneja todas las otras clases de pruebas
 * @author LuchoBolivar
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ BOAreaInteresTest.class, BOContactoTest.class, BOEgresadosTest.class, BOEmpresaTest.class,
		BOFacultadTest.class, BOInfoAcademicaTest.class, BOInformacionLaboralTest.class, BOProgramaTest.class })
public class AllTests {

}
