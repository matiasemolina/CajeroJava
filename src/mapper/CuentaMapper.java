package mapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entities.Cuenta;

public class CuentaMapper implements BaseMapper<Cuenta>{

	@Override
	public Cuenta toEntity(ResultSet resultSet) {
		// TODO Auto-generated method stub
		Cuenta resultado = new Cuenta();
		try {
			//faltan los .set
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
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
