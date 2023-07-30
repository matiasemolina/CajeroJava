package entities;

import java.sql.Date;
import java.sql.ResultSet;

public class Transaccion implements BaseEntity<Transaccion> {
//Properties
	public Long id;
	public Date fechaTransaccion;
	public Double monto;
	public Long nroTransaccion;
	public Cuenta cuentaOrigen;
	
	
//Constructor	
public Transaccion(Long id, Date fechaTransaccion, Double monto, Long nroTransaccion, Cuenta cuentaOrigen) {
		super();
		this.id = id;
		this.fechaTransaccion = fechaTransaccion;
		this.monto = monto;
		this.nroTransaccion = nroTransaccion;
		this.cuentaOrigen = cuentaOrigen;
	}

//Getters
	public Long getId() {
	return id;
	}

	public Date getFechaTransaccion() {
	return fechaTransaccion;
	}

	public Double getMonto() {
	return monto;
	}

	public Long getNroTransaccion() {
	return nroTransaccion;
	}

	public Cuenta getCuentaOrigen() {
	return cuentaOrigen;
	}
//Setters
	public void setId(Long id) {
	this.id = id;
	}

	public void setFechaTransaccion(Date fechaTransaccion) {
	this.fechaTransaccion = fechaTransaccion;
	}

	public void setMonto(Double monto) {
	this.monto = monto;
	}

	public void setNroTransaccion(Long nroTransaccion) {
	this.nroTransaccion = nroTransaccion;
	}

	public void setCuentaOrigen(Cuenta cuentaOrigen) {
	this.cuentaOrigen = cuentaOrigen;
	}

//Methods
	public void imprimirComprobante() {
		//TODO enable function
	}
	
	@Override
	public void toEntity(ResultSet resultSet) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public ResultSet toResultSet(Transaccion resultSet) {
		// TODO Auto-generated method stub
		return null;
	}
}
