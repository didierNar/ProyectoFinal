package co.edu.eam.ingesoftdesarrollo.egresados.test;

import org.junit.Assert;
import org.junit.Test;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Facultad;
import co.edu.eam.ingesoftdesarrollo.logica.bo.BOFacultad;

public class BOFacultadTest {
	
	private BOFacultad boFacultad;
	
	public BOFacultadTest() {
		// TODO Auto-generated constructor stub
		boFacultad = new BOFacultad();
	}
	
	@Test
	private void testRegistro(){
		
		try{
		
		Facultad fac = new Facultad();
		fac.setCodigo(111);
		fac.setNombre("Administracion");
		
		boFacultad.registrar(fac);
		
		boFacultad.buscar(111);
		
		} catch (Exception e){
			e.printStackTrace();
			Assert.fail();
		}
		
	}

}
