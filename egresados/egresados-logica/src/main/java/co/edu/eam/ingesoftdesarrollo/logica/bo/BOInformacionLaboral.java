package co.edu.eam.ingesoftdesarrollo.logica.bo;

import java.util.ArrayList;
import java.util.List;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOEgresados;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.definiciones.IDAOInformacionLaboral;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa.DAOEgresadoJPA;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.dao.implementacion.jpa.DAOInformacionLaboralJPA;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.enumeraciones.SituacionActual;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.InformacionLaboral;
import co.edu.eam.ingesoftdesarrollo.logica.excepcion.ExcepcionNegocio;

public class BOInformacionLaboral {

	private IDAOInformacionLaboral daoInfoLab;
	private IDAOEgresados daoEgresados;

	public BOInformacionLaboral() {
		// TODO Auto-generated constructor stub
		daoInfoLab = new DAOInformacionLaboralJPA();
		daoEgresados = new DAOEgresadoJPA();
	}

	public void agregar(InformacionLaboral infoLab) throws Exception {
		daoInfoLab.agregar(infoLab);
	}

	public InformacionLaboral buscarInfoLab(Egresado e) throws Exception {
		InformacionLaboral infoLab = daoInfoLab.buscar(e);
		if (infoLab == null) {
			throw new ExcepcionNegocio("No hay información laboral");
		} else {
			return infoLab;
		}
	}
	
	public void editar (InformacionLaboral infoLab) throws Exception{
		daoInfoLab.editar(infoLab);
	}
	
	public List<InformacionLaboral> listaEgresadosEnEmpresa () throws Exception{
		List<InformacionLaboral> lista = new ArrayList<InformacionLaboral>();
		List<Egresado> listaEgre = daoEgresados.listar();
		for (Egresado egresado : listaEgre) {
			List<InformacionLaboral> listaInfo = daoInfoLab.informacionLaboralEgresado(egresado);
			for (InformacionLaboral informacionLaboral : listaInfo) {
				if (informacionLaboral.getSituaActual().equals(SituacionActual.EMPLEADO)){
					lista.add(informacionLaboral);
				}
			}
		}
		return lista;
	}

}
