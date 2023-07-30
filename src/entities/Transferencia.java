package entities;

import java.sql.Date;

public class Transferencia extends Transaccion {
		
	public Cuenta cuentaDestino;
	public String motivo;

	public Transferencia(Long id, Date fechaTransaccion, Double monto, Long nroTransaccion, Cuenta cuentaOrigen, Cuenta cuentaDestino, String motivo) {
		super(id, fechaTransaccion, monto, nroTransaccion, cuentaOrigen);
		this.cuentaDestino = cuentaDestino;
		this.motivo = motivo;
	}
}
