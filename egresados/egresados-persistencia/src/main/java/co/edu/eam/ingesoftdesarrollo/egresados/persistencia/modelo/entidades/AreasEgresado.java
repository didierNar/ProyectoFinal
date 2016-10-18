package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_AREAS_EGRESADO")
@IdClass(AreasEgresadoPK.class)
public class AreasEgresado implements Serializable {

	@Id
	@JoinColumn(name="ID_EGRESADO")
	@ManyToOne
	private Egresado codigoEgresado;
	
	@Id
	@JoinColumn(name="ID_AREA")
	@ManyToOne
	private AreasInteres codigoArea;
	
	public AreasEgresado() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param areaIntres
	 * @param egresado
	 */
	public AreasEgresado(AreasInteres areaIntres, Egresado egresado) {
		super();
		this.codigoArea = areaIntres;
		this.codigoEgresado = egresado;
	}

	/**
	 * @return the areaIntres
	 */
	public AreasInteres getAreaIntres() {
		return codigoArea;
	}

	/**
	 * @param areaIntres the areaIntres to set
	 */
	public void setAreaIntres(AreasInteres areaIntres) {
		this.codigoArea = areaIntres;
	}

	/**
	 * @return the egresado
	 */
	public Egresado getEgresado() {
		return codigoEgresado;
	}

	/**
	 * @param egresado the egresado to set
	 */
	public void setEgresado(Egresado egresado) {
		this.codigoEgresado = egresado;
	}

	
}
