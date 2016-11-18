package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.enumeraciones.NivelAcademico;

/**
 * Entidad InfoAcademica
 * @author LuchoBolivar
 *
 */
@Entity
@Table(name = "T_INFO_ACADEMICA")
public class InfoAcademica implements Serializable {

	/**
	 * atributo codEgresado
	 */
	@Id
	@Column(name = "ID_EGRESADO")
	private String codEgresado;
	
	/**
	 * atributo de tipo Egresado
	 */
	@JoinColumn(name = "ID_EGRESADO", insertable=false, updatable=false)
	@MapsId
	@OneToOne
	private Egresado egresado;

	/**
	 * atributo de tipo Date 
	 */
	@Column(name = "fecha_grado")
	@Temporal(TemporalType.DATE)
	private Date fechaGrado;

	/**
	 * atributo de tipo Facultad
	 */
	@JoinColumn(name = "facultad")
	@ManyToOne(cascade = {})
	private Facultad facultad;

	/**
	 * atributo de tipo NivelAcademico
	 */
	@Column(name = "nivel_academico")
	private NivelAcademico nivelAcademico;

	/**
	 * atributo de tipo programa
	 */
	@JoinColumn(name = "programa_academico")
	@ManyToOne(cascade = {})
	private Programa programaAcademico;

	/**
	 * atributo numDiploma
	 */
	@Column(name = "num_diploma")
	private String numDiploma;

	/**
	 * atributo areaOfertaLaboral
	 */
	@JoinColumn(name = "area_ofertalaboral")
	@ManyToOne
	private OfertaLaboral areaOfertaLaboral;

	/**
	 * constructor de la clase InfoAcademica
	 */
	public InfoAcademica() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param egresado
	 * @param fechaGrado
	 * @param facultad
	 * @param nivelAcademico
	 * @param programaAcademico
	 * @param numDiploma
	 * @param areaOfertaLaboral
	 */
	public InfoAcademica(Egresado egresado, Date fechaGrado, Facultad facultad, NivelAcademico nivelAcademico,
			Programa programaAcademico, String numDiploma, OfertaLaboral areaOfertaLaboral) {
		super();
		codEgresado = egresado.getCodigoEgresado();
		this.egresado = egresado;
		this.fechaGrado = fechaGrado;
		this.facultad = facultad;
		this.nivelAcademico = nivelAcademico;
		this.programaAcademico = programaAcademico;
		this.numDiploma = numDiploma;
		this.areaOfertaLaboral = areaOfertaLaboral;
	}

	/**
	 * @return the fechaGrado
	 */
	public Date getFechaGrado() {
		return fechaGrado;
	}

	/**
	 * @param fechaGrado
	 *            the fechaGrado to set
	 */
	public void setFechaGrado(Date fechaGrado) {
		this.fechaGrado = fechaGrado;
	}

	/**
	 * @return the facultad
	 */
	public Facultad getFacultad() {
		return facultad;
	}

	/**
	 * @param facultad
	 *            the facultad to set
	 */
	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

	/**
	 * @return the nivelAcademico
	 */
	public NivelAcademico getNivelAcademico() {
		return nivelAcademico;
	}

	/**
	 * @param nivelAcademico
	 *            the nivelAcademico to set
	 */
	public void setNivelAcademico(NivelAcademico nivelAcademico) {
		this.nivelAcademico = nivelAcademico;
	}

	/**
	 * @return the programaAcademico
	 */
	public Programa getProgramaAcademico() {
		return programaAcademico;
	}

	/**
	 * @param programaAcademico
	 *            the programaAcademico to set
	 */
	public void setProgramaAcademico(Programa programaAcademico) {
		this.programaAcademico = programaAcademico;
	}

	/**
	 * @return the numDiploma
	 */
	public String getNumDiploma() {
		return numDiploma;
	}

	/**
	 * @param numDiploma
	 *            the numDiploma to set
	 */
	public void setNumDiploma(String numDiploma) {
		this.numDiploma = numDiploma;
	}

	/**
	 * @return the areaOfertaLaboral
	 */
	public OfertaLaboral getOfertaLaboral() {
		return areaOfertaLaboral;
	}

	/**
	 * @param areaOfertaLaboral
	 *            the areaOfertaLaboral to set
	 */
	public void setOfertaLaboral(OfertaLaboral areaOfertaLaboral) {
		this.areaOfertaLaboral = areaOfertaLaboral;
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

	/**
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((egresado == null) ? 0 : egresado.hashCode());
		return result;
	}

	/**
	 * (non-Javadoc)
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
		InfoAcademica other = (InfoAcademica) obj;
		if (egresado == null) {
			if (other.egresado != null)
				return false;
		} else if (!egresado.equals(other.egresado))
			return false;
		return true;
	}

}
