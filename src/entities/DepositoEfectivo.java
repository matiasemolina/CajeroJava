package entities;

import java.sql.Date;

public class DepositoEfectivo extends Transaccion {

	public DepositoEfectivo(Long id, Date fechaTransaccion, Double monto, Long nroTransaccion, Cuenta cuentaOrigen, String tipoTransaccion) {
		super(id, fechaTransaccion, monto, nroTransaccion, cuentaOrigen, tipoTransaccion);
	}
	
}
