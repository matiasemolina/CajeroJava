package mapper;
import entities.Sucursal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SucursalMapper implements BaseMapper<Sucursal>{

	@Override
	public Sucursal toEntity(ResultSet resultSet) {
		Sucursal resultado = new Sucursal();
		try {
			//faltan los .set
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}

	@Override
	public PreparedStatement toPrepareStatement(Sucursal t, String sql) {
		// TODO Auto-generated method stub
		try {
			//falta llenar el preparedstatement con los datos del sql y del controlador
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
