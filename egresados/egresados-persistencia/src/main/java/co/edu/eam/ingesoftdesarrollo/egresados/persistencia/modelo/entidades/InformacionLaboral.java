package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_INFO_LABORAL")
public class InformacionLaboral implements Serializable {

	@Id
	@Column(name = "ID_EGRESADO")
	private int codEgresado;
	
	@JoinColumn(name = "ID_EGRESADO", insertable=false, updatable=false)
	@OneToOne
	@MapsId
	private Egresado egresado;

	@Column(name = "situa_actual")
	private String situaActual;

	@Column(name = "tipo_empresa")
	private String tipoEmpresa;

	@Column(name = "sector_laboral")
	private String sectorLaboral;

	@Column(name = "nombre_empresa")
	private String nombreEmpresa;

	@Column(name = "fecha_ingreso")
	@Temporal(TemporalType.DATE)
	private Date fechaIngreso;
	
	@Column(name = "cargo_empresa")
	private String cargo;

	@Column(name = "fecha_salida")
	@Temporal(TemporalType.DATE)
	private Date fechaSalida;

	public InformacionLaboral() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param egresado
	 * @param situaActual
	 * @param tipoEmpresa
	 * @param sectorLaboral
	 * @param nombreEmpresa
	 * @param fechaIngreso
	 * @param fechaSalida
	 */
	public InformacionLaboral(Egresado egresado, String situaActual, String tipoEmpresa, String sectorLaboral,
			String nombreEmpresa, Date fechaIngreso, Date fechaSalida, String cargo) {
		super();
		this.cargo = cargo;
		this.egresado = egresado;
		this.situaActual = situaActual;
		this.tipoEmpresa = tipoEmpresa;
		this.sectorLaboral = sectorLaboral;
		this.nombreEmpresa = nombreEmpresa;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
	}
	
	/**
	 * @return the cargo
	 */
	public String getCargo() {
		return cargo;
	}

	/**
	 * @param cargo the cargo to set
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	/**
	 * @return the situaActual
	 */
	public String getSituaActual() {
		return situaActual;
	}

	/**
	 * @param situaActual
	 *            the situaActual to set
	 */
	public void setSituaActual(String situaActual) {
		this.situaActual = situaActual;
	}

	/**
	 * @return the tipoEmpresa
	 */
	public String getTipoEmpresa() {
		return tipoEmpresa;
	}

	/**
	 * @param tipoEmpresa
	 *            the tipoEmpresa to set
	 */
	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}

	/**
	 * @return the sectorLaboral
	 */
	public String getSectorLaboral() {
		return sectorLaboral;
	}

	/**
	 * @param sectorLaboral
	 *            the sectorLaboral to set
	 */
	public void setSectorLaboral(String sectorLaboral) {
		this.sectorLaboral = sectorLaboral;
	}

	/**
	 * @return the nombreEmpresa
	 */
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	/**
	 * @param nombreEmpresa
	 *            the nombreEmpresa to set
	 */
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	/**
	 * @return the fechaIngreso
	 */
	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	/**
	 * @param fechaIngreso
	 *            the fechaIngreso to set
	 */
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	/**
	 * @return the fechaSalida
	 */
	public Date getFechaSalida() {
		return fechaSalida;
	}

	/**
	 * @param fechaSalida
	 *            the fechaSalida to set
	 */
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	/**
	 * @return the egresado
	 */
	public Egresado getEgresado() {
		return egresado;
	}

	/**
	 * @param egresado
	 *            the egresado to set
	 */
	public void setEgresado(Egresado egresado) {
		this.egresado = egresado;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((egresado == null) ? 0 : egresado.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InformacionLaboral other = (InformacionLaboral) obj;
		if (egresado == null) {
			if (other.egresado != null)
				return false;
		} else if (!egresado.equals(other.egresado))
			return false;
		return true;
	}
	
	

}
