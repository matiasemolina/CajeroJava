package controlador;

import java.sql.ResultSet;
import java.sql.Statement;
import controlador.ConectorBD;

import entities.BaseEntity;
public class BaseControler {
	public BaseControler() {
		
	}
	
	public BaseEntity readFrom(String consulta, BaseEntity entidadBase) {
		try {
			Statement statement = ConectorBD.getInstance().getConnection().createStatement();

			ResultSet resultado = statement.executeQuery(consulta);

			while (resultado.next()) {
				entidadBase.toEntity(resultado);				 
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return entidadBase;
	}
}