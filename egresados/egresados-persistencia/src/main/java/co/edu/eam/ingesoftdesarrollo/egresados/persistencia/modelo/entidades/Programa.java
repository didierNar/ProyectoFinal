package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "T_PROGRAMA")
@NamedQueries({
		@NamedQuery(name = Programa.PROGRAMAS_FACULTAD, query = "SELECT p FROM Programa p WHERE p.facultad = ?1") })
public class Programa implements Serializable {

	public static final String PROGRAMAS_FACULTAD = "Programa.programasFacultad";

	@Id
	@Column(name = "ID_PROGRAMA")
	private int codigo;

	@JoinColumn(name = "ID_FACULTAD")
	@ManyToOne(cascade={})
	private Facultad facultad;

	@Column(name = "nom_programa")
	private String nomPrograma;

	@Column(name = "creditos_programa")
	private int creditosPrograma;

	public Programa() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param codigo
	 * @param facultad
	 * @param nomPrograma
	 * @param creditosPrograma
	 */
	public Programa(int codigo, Facultad facultad, String nomPrograma, int creditosPrograma) {
		super();
		this.codigo = codigo;
		this.facultad = facultad;
		this.nomPrograma = nomPrograma;
		this.creditosPrograma = creditosPrograma;
	}

	/**
	 * @return the nomPrograma
	 */
	public String getNomPrograma() {
		return nomPrograma;
	}

	/**
	 * @param nomPrograma
	 *            the nomPrograma to set
	 */
	public void setNomPrograma(String nomPrograma) {
		this.nomPrograma = nomPrograma;
	}

	/**
	 * @return the creditosPrograma
	 */
	public int getCreditosPrograma() {
		return creditosPrograma;
	}

	/**
	 * @param creditosPrograma
	 *            the creditosPrograma to set
	 */
	public void setCreditosPrograma(int creditosPrograma) {
		this.creditosPrograma = creditosPrograma;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo
	 *            the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return nomPrograma;
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
		result = prime * result + codigo;
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
		Programa other = (Programa) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

}
