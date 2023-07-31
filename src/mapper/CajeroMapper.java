package mapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controlador.ConectorBD;
import entities.Cajero;
public class CajeroMapper implements BaseMapper<Cajero>{

	@Override
	public Cajero toEntity(ResultSet resultSet) {
		// TODO Auto-generated method stub
		Cajero resultado = new Cajero();
		try {
			//faltan los .set
			resultado.setId(resultSet.getLong("id"));
			resultado.setUbicacion(resultSet.getString("ubicacion"));
			resultado.setSucursal(resultSet.getLong("id_sucursal"));
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
			PreparedStatement prepareStatement=ConectorBD.getInstance().getConnection().prepareStatement(sql);
			prepareStatement.setLong(1, t.getId());
			prepareStatement.setString(2, t.getUbicacion());
			prepareStatement.setObject(3, t.getSucursal());
			return prepareStatement;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
