package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.enumeraciones.TipoEmpresa;

/**
 * Entidad Empresa 
 * @author LuchoBolivar
 *
 */
@Entity
@Table(name = "T_EMPRESA")
@NamedQueries({
	@NamedQuery(name = Empresa.LISTA_EMPRESAS, query = "SELECT e FROM Empresa e")
})
public class Empresa implements Serializable {

	public static final String LISTA_EMPRESAS = "Empresa.Listar";
	
	/**
	 * atributo nit
	 */
	@Id
	@Column(name = "NIT")
	private String nit;
	
	/**
	 * atributo Contacto
	 */
	@OneToOne(mappedBy="empresa")
	private Contacto contacto;

	/**
	 * atributo de tipo SectorLaboral
	 */
	@JoinColumn(name = "ID_SECTOR")
	@ManyToOne(cascade={})
	private SectorLaboral sector;
	
	/**
	 * atributo RazonSocial
	 */
	@Column(name = "razon_social")
	private String razonSocial;
	
	/**
	 * atributo de tipo Departamento
	 */
	@JoinColumn(name = "depto")
	@ManyToOne(cascade={})
	private Departamento depto;
	
	/**
	 * atributo telefono
	 */
	@Column(name = "telefono")
	private String telefono;
	
	/**
	 * atributo de tipo TipoEmpresa
	 */
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_empresa")
	private TipoEmpresa tipo;
	
	/**
	 * atributo web
	 */
	@Column(name = "dir_web")
	private String web;
	
	/**
	 * atributo direccion
	 */
	@Column(name="direccion")
	private String direccion;

	/**
	 * atributo de tipo Ciudad
	 */
	@JoinColumn(name = "ID_CIUDAD")
	@ManyToOne(cascade={})
	private Ciudad ciudad;
	
	/**
	 * atributo Pais
	 */
	@JoinColumn(name="pais")
	@ManyToOne(cascade={})
	private Pais pais;

	/**
	 * constructor de la clase Empresa
	 */
	public Empresa() {
		// TODO Auto-generated constructor stub
	}	

	/**
	 * @param nit
	 * @param sector
	 * @param razonSocial
	 * @param depto
	 * @param telefono
	 * @param tipo
	 * @param web
	 * @param direccion
	 * @param ciudad
	 * @param nombre
	 */
	public Empresa(String nit, SectorLaboral sector, String razonSocial, Departamento depto, String telefono,
			TipoEmpresa tipo, String web, String direccion, Ciudad ciudad, Pais pais) {
		super();
		this.nit = nit;
		this.sector = sector;
		this.razonSocial = razonSocial;
		this.depto = depto;
		this.telefono = telefono;
		this.tipo = tipo;
		this.web = web;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.pais = pais;
	}

	/**
	 * @return the pais
	 */
	public Pais getPais() {
		return pais;
	}



	/**
	 * @param pais the pais to set
	 */
	public void setPais(Pais pais) {
		this.pais = pais;
	}



	/**
	 * @return the razonSocial
	 */
	public String getRazonSocial() {
		return razonSocial;
	}



	/**
	 * @param razonSocial the razonSocial to set
	 */
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}



	/**
	 * @return the depto
	 */
	public Departamento getDepto() {
		return depto;
	}



	/**
	 * @param depto the depto to set
	 */
	public void setDepto(Departamento depto) {
		this.depto = depto;
	}



	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}



	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	/**
	 * @return the tipo
	 */
	public TipoEmpresa getTipo() {
		return tipo;
	}



	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoEmpresa tipo) {
		this.tipo = tipo;
	}



	/**
	 * @return the web
	 */
	public String getWeb() {
		return web;
	}



	/**
	 * @param web the web to set
	 */
	public void setWeb(String web) {
		this.web = web;
	}



	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}



	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the codigoEmpresa
	 */
	public String getNit() {
		return nit;
	}

	/**
	 * @param codigoEmpresa
	 *            the codigoEmpresa to set
	 */
	public void setNit(String nit) {
		this.nit = nit;
	}

	/**
	 * @return the sector
	 */
	public SectorLaboral getSector() {
		return sector;
	}

	/**
	 * @param sector
	 *            the sector to set
	 */
	public void setSector(SectorLaboral sector) {
		this.sector = sector;
	}

	/**
	 * @return the ciudad
	 */
	public Ciudad getCiudad() {
		return ciudad;
	}

	/**
	 * @param ciudad
	 *            the ciudad to set
	 */
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return razonSocial;
	}	

}
