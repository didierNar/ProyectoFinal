package main;

import javax.persistence.Persistence;

import co.edu.eam.dinesoft.egresados.vista.gui.VentanaPrincipal;

public class Main {

	public static void main(String[] args) {

//		Persistence.createEntityManagerFactory("jpa_pu").createEntityManager();
		VentanaPrincipal ventana = new VentanaPrincipal();
		ventana.setVisible(true);
	}

}
