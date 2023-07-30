package mapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entities.Cajero;
public class CajeroMapper implements BaseMapper<Cajero>{

	@Override
	public Cajero toEntity(ResultSet resultSet) {
		// TODO Auto-generated method stub
		Cajero resultado = new Cajero();
		try {
			//faltan los .set
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}

	@Override
	public PreparedStatement toPrepareStatement(Cajero t, String sql) {
		// TODO Auto-generated method stub
		try {
			//falta llenar el preparedstatement con los datos del sql y del controlador
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
