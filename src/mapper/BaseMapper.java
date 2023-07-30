package mapper;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public interface BaseMapper <T>{
	public T toEntity(ResultSet resultSet);
	public PreparedStatement toPrepareStatement(T t, String sql);
}
