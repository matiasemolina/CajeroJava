package mapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import controlador.ConectorBD;
import entities.Cuenta;
import entities.Cliente;
import controlador.ClienteController;

public class CuentaMapper implements BaseMapper<Cuenta>{

	@Override
	public Cuenta toEntity(ResultSet resultSet) {
		// TODO Auto-generated method stub
		Cuenta resultado = new Cuenta();
		List<Cliente> cliente= new ArrayList<>();
		ClienteController cc = new ClienteController();
		
		try {
			//faltan los .set
			resultado.setId(resultSet.getLong("id"));
			cliente=cc.getById(resultSet.getLong("id_cuenta_cliente"));
			resultado.setOwner(cliente.get(0));
			resultado.setNroCuenta(resultSet.getString("nroCuenta"));
			resultado.setBalance(resultSet.getDouble("balance"));
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}

	@Override
	public PreparedStatement toPrepareStatement(Cuenta t, String sql) {
		// TODO Auto-generated method stub
		try {
			//falta llenar el preparedstatement con los datos del sql y del controlador
			PreparedStatement prepareStatement = ConectorBD.getInstance().getConnection().prepareStatement(sql);
			prepareStatement.setLong(1, t.getId());
			prepareStatement.setLong(2, t.getOwner().getId());
			prepareStatement.setString(3, t.getNroCuenta());
			prepareStatement.setDouble(4, t.getBalance());
			return prepareStatement;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
