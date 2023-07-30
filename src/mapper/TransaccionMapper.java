package mapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import entities.Transaccion;

public class TransaccionMapper implements BaseMapper<Transaccion>{

	@Override
	public Transaccion toEntity(ResultSet resultSet) {
		// TODO Auto-generated method stub
		Transaccion resultado= new Transaccion();
		try {
			//faltan los .set
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
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
