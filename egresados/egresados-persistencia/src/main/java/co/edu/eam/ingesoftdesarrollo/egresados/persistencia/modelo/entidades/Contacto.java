package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Entidad contacto 
 * @author LuchoBolivar
 *
 */
@Entity
@Table(name="T_CONTACTO")
public class Contacto implements Serializable {

	/**
	 * atributo de la clase empresa
	 */
	@JoinColumn(name="NIT", insertable=false, updatable=false)
	@OneToOne
	@MapsId
	private Empresa empresa;
	
	/**
	 * atributo nit 
	 */
	@Id
	@Column(name="NIT")
	private String nit;
	
	/**
	 * atributo nombre
	 */
	@Column(name="nombre")
	private String nombre;
	
	/**
	 * atributo correo
	 */
	@Column(name="correo")
	private String correo;
	
	/**
	 * atributo cargo
	 */
	@Column(name="cargo")
	private String cargo;
	
	/**
	 * atributo telefono
	 */
	@Column(name="telefono")
	private String tel;
	
	/**
	 * constructor clase contacto
	 */
	public Contacto() {
		// TODO Auto-generated constructor stub
	}

	

	/**
	 * @param empresa
	 * @param nombre
	 * @param correo
	 * @param cargo
	 * @param tel
	 */
	public Contacto(Empresa empresa, String nombre, String correo, String cargo, String tel) {
		super();
		nit = empresa.getNit();
		this.empresa = empresa;
		this.nombre = nombre;
		this.correo = correo;
		this.cargo = cargo;
		this.tel = tel;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}



	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}



	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
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
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}



	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}



	/**
	 * @return the empresa
	 */
	public Empresa getEmpresa() {
		return empresa;
	}

	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	/**
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
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
		Contacto other = (Contacto) obj;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		return true;
	}
	
	
	
	
	
}
