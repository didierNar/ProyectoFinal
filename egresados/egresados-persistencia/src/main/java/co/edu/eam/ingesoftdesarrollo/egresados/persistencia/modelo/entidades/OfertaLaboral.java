package co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entidad OfertaLaboral
 * @author LuchoBolivar
 *
 */
@Entity
@Table(name="T_OFERTALABORAL")
@NamedQueries({
	@NamedQuery(name = OfertaLaboral.OFERTAS_PROGRAMA, query = "SELECT o FROM OfertaLaboral o WHERE o.programa = ?1"),
	@NamedQuery(name = OfertaLaboral.LISTAR_OFERTAS, query = "SELECT o FROM OfertaLaboral o")
})
public class OfertaLaboral implements Serializable{

	/**
	 * Obtiene las ofertas laborales de un programa
	 * ?1: el programa
	 */
	public static final String OFERTAS_PROGRAMA = "OfertaLaboral.OfertasPrograma";
	
	/**
	 * Obtiene la lista de ofertas
	 */
	public static final String LISTAR_OFERTAS = "OfertaLaboral.listar";
	
	/**
	 * atributo codigo
	 */
	@Id
	@Column(name="ID_OFERTA")
	private int codigo;
	
	/**
	 * atributo de tipo empresa
	 */
	@JoinColumn(name="ID_EMPRESA")
	@ManyToOne(cascade={})
	private Empresa empresa;
	
	/**
	 * atributo de tipo ciudad
	 */
	@JoinColumn(name="ID_CIUDAD")
	@ManyToOne(cascade={})
	private Ciudad ciudad;
	
	@Column(name="CERRAR_OFERTA")
	private boolean cerrarOferta;
	
	/**
	 * atributo Programa
	 */
	@JoinColumn(name="ID_PROGRAMA")
	@ManyToOne
	private Programa programa;
	
	/**
	 * atributo de tipo areaInteres
	 */
	@JoinColumn(name="ID_AREA")
	@ManyToOne(cascade={})
	private AreasInteres area;
	
	/**
	 * atributo resumen
	 */
	@Column(name="resumen")
	private String resumen;
	
	/**
	 * atributo cargo
	 */
	@Column(name="cargo")
	private String cargo;
	
	/**
	 * atributo salario
	 */
	@Column(name="salario")
	private double salario;
	
	/**
	 * atributo descripcion
	 */
	@Column(name="descripcion_oferta")
	private String descripcion;
	
	/**
	 * atributo requerimientos
	 */
	@Column(name="requerimiento_oferta")
	private String requerimientos;
	
	/**
	 * atributo de tipo Date
	 */
	@Column(name="fecha_apertura")
	@Temporal(TemporalType.DATE)
	private Date fechaApertura;
	
	/**
	 * atributo fecha de cierre
	 */
	@Column(name="fecha_cierre")
	@Temporal(TemporalType.DATE)
	private Date fechaCierre;
	
	/**
	 * constructor de la clase OfertaLaboral
	 */
	public OfertaLaboral() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param codigo
	 * @param empresa
	 * @param ciudad
	 * @param area
	 * @param resumen
	 * @param cargo
	 * @param salario
	 * @param descripcion
	 * @param requerimientos
	 * @param fechaApertura
	 */
	public OfertaLaboral(int codigo, Empresa empresa, Ciudad ciudad, AreasInteres area, String resumen, String cargo,
			double salario, String descripcion, String requerimientos, Date fechaApertura) {
		super();
		this.codigo = codigo;
		this.empresa = empresa;
		this.ciudad = ciudad;
		this.area = area;
		this.resumen = resumen;
		this.cargo = cargo;
		this.salario = salario;
		this.descripcion = descripcion;
		this.requerimientos = requerimientos;
		this.fechaApertura = fechaApertura;
	}



	/**
	 * @return the cerrarOferta
	 */
	public boolean isCerrarOferta() {
		return cerrarOferta;
	}

	/**
	 * @param cerrarOferta the cerrarOferta to set
	 */
	public void setCerrarOferta(boolean cerrarOferta) {
		this.cerrarOferta = cerrarOferta;
	}

	/**
	 * @return the programa
	 */
	public Programa getPrograma() {
		return programa;
	}

	/**
	 * @param programa the programa to set
	 */
	public void setPrograma(Programa programa) {
		this.programa = programa;
	}

	/**
	 * @return the fechaCierre
	 */
	public Date getFechaCierre() {
		return fechaCierre;
	}

	/**
	 * @param fechaCierre the fechaCierre to set
	 */
	public void setFechaCierre(Date fechaCierre) {
		this.fechaCierre = fechaCierre;
	}

	/**
	 * @return the resumen
	 */
	public String getResumen() {
		return resumen;
	}

	/**
	 * @param resumen the resumen to set
	 */
	public void setResumen(String resumen) {
		this.resumen = resumen;
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
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the requerimientos
	 */
	public String getRequerimientos() {
		return requerimientos;
	}

	/**
	 * @param requerimientos the requerimientos to set
	 */
	public void setRequerimientos(String requerimientos) {
		this.requerimientos = requerimientos;
	}

	/**
	 * @return the fechaApertura
	 */
	public Date getFechaApertura() {
		return fechaApertura;
	}

	/**
	 * @param fechaApertura the fechaApertura to set
	 */
	public void setFechaApertura(Date fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	 * @return the ciudad
	 */
	public Ciudad getCiudad() {
		return ciudad;
	}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * @return the area
	 */
	public AreasInteres getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(AreasInteres area) {
		this.area = area;
	}

	/**
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
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
		OfertaLaboral other = (OfertaLaboral) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
	
	
	
	
}
