package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.enumeraciones.SituacionActual;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.enumeraciones.TipoEmpresa;

@Entity
@Table(name = "T_INFO_LABORAL")
@NamedQueries({
		@NamedQuery(name = InformacionLaboral.EGRESADOS_EMPRESA, query = "SELECT i FROM InformacionLaboral i WHERE i.egresado = ?1") })
public class InformacionLaboral implements Serializable {

	/**
	 * Obtiene la informaci�n laboral de un egresado
	 * ?1: EL egresado
	 */
	public static final String EGRESADOS_EMPRESA = "InformacionLaboral.egresadosEmpresa";

	@Id
	@Column(name = "ID_EGRESADO")
	private String codEgresado;

	@JoinColumn(name = "ID_EGRESADO", insertable = false, updatable = false)
	@OneToOne
	@MapsId
	private Egresado egresado;

	@Column(name = "situa_actual")
	private SituacionActual situaActual;

	@Column(name = "tipo_empresa")
	private TipoEmpresa tipoEmpresa;

	@JoinColumn(name = "sector_laboral")
	@ManyToOne(cascade={})
	private SectorLaboral sectorLaboral;

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
	public InformacionLaboral(Egresado egresado, SituacionActual situaActual, TipoEmpresa tipoEmpresa,
			SectorLaboral sectorLaboral, String nombreEmpresa, Date fechaIngreso, Date fechaSalida, String cargo) {
		super();
		codEgresado=egresado.getCodigoEgresado();
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
	 * @param cargo
	 *            the cargo to set
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	/**
	 * @return the situaActual
	 */
	public SituacionActual getSituaActual() {
		return situaActual;
	}

	/**
	 * @param situaActual
	 *            the situaActual to set
	 */
	public void setSituaActual(SituacionActual situaActual) {
		this.situaActual = situaActual;
	}

	/**
	 * @return the tipoEmpresa
	 */
	public TipoEmpresa getTipoEmpresa() {
		return tipoEmpresa;
	}

	/**
	 * @param tipoEmpresa
	 *            the tipoEmpresa to set
	 */
	public void setTipoEmpresa(TipoEmpresa tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}

	/**
	 * @return the sectorLaboral
	 */
	public SectorLaboral getSectorLaboral() {
		return sectorLaboral;
	}

	/**
	 * @param sectorLaboral
	 *            the sectorLaboral to set
	 */
	public void setSectorLaboral(SectorLaboral sectorLaboral) {
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((egresado == null) ? 0 : egresado.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
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
