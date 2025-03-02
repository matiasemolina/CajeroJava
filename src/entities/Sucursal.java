package entities;

import java.sql.ResultSet;

public class Sucursal implements BaseEntity<Sucursal>{

//Propiedades	
	public Long id;
	public String codigo;
	public String direccion;
	public String nombre;
	
//Constructor	
	public Sucursal(Long id, String codigo, String direccion, String nombre) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.direccion = direccion;
		this.nombre = nombre;
	}
	
	public Sucursal() {
		
	}

//Getters
	public Long getId() {
		return id;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getNombre() {
		return nombre;
	}

	
//Setters
	public void setId(Long id) {
		this.id = id;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void toEntity(ResultSet resultSet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ResultSet toResultSet(Sucursal resultSet) {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	
}
