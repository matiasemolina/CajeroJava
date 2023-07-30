package mapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import entities.Cliente;

public class ClienteMapper implements BaseMapper<Cliente>{

	@Override
	public Cliente toEntity(ResultSet resultSet) {
		// TODO Auto-generated method stub
		Cliente resultado=new Cliente();
		try {
			//faltan los .set
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}

	@Override
	public PreparedStatement toPrepareStatement(Cliente t, String sql) {
		// TODO Auto-generated method stub
		try {
			//falta llenar el preparedstatement con los datos del sql y del controlador
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
