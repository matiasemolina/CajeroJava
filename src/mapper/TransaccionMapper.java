package mapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Transaccion;
import entities.Cuenta;
import controlador.CuentaController;
import controlador.ConectorBD;

public class TransaccionMapper implements BaseMapper<Transaccion>{

	@Override
	public Transaccion toEntity(ResultSet resultSet) {
		// TODO Auto-generated method stub
		Transaccion resultado= new Transaccion();
		List<Cuenta> cuenta = new ArrayList<>();
		CuentaController cc= new CuentaController();
		try {
			//faltan los .set
			resultado.setId(resultSet.getLong("id"));
			resultado.setFechaTransaccion(resultSet.getDate("fechaTransaccion"));
			resultado.setMonto(resultSet.getDouble("monto"));
			resultado.setNroTransaccion(resultSet.getLong("nroTransaccion"));
			cuenta=cc.getById(resultSet.getLong("id_cuenta"));
			resultado.setCuentaOrigen(cuenta.get(0));
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}

	@Override
	public PreparedStatement toPrepareStatement(Transaccion t, String sql) {
		// TODO Auto-generated method stub
		try {
			//falta llenar el preparedstatement con los datos del sql y del controlador
			PreparedStatement prepareStatement = ConectorBD.getInstance().getConnection().prepareStatement(sql);
			prepareStatement.setLong(1, t.getId());
			prepareStatement.setDate(2,t.getFechaTransaccion());
			prepareStatement.setDouble(3, t.getMonto());
			prepareStatement.setLong(4, t.getNroTransaccion());
			prepareStatement.setLong(5,t.getCuentaOrigen().getId());
			return prepareStatement;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
