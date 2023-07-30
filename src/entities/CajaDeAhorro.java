package entities;

import java.sql.Date;

public class CajaDeAhorro extends Transaccion {

	public CajaDeAhorro(Long id, Date fechaTransaccion, Double monto, Long nroTransaccion, Cuenta cuentaOrigen) {
		super(id, fechaTransaccion, monto, nroTransaccion, cuentaOrigen);
	}

}
