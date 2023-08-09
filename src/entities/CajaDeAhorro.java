package entities;

public class CajaDeAhorro extends Cuenta {
	
	public CajaDeAhorro(Long id, Cliente owner, String nroCuenta, Double balance) {
		super(id, owner, nroCuenta, balance);
	}
	
}
