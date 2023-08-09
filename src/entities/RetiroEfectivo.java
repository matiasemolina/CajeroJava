package entities;

import java.sql.Date;

public class RetiroEfectivo extends Transaccion {

	public RetiroEfectivo(Long id, Date fechaTransaccion, Double monto, Long nroTransaccion, Cuenta cuentaOrigen, String tipoTransaccion) {
		super(id, fechaTransaccion, monto, nroTransaccion, cuentaOrigen, tipoTransaccion);
	}
	
}
