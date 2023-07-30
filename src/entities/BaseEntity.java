package entities;

import java.sql.ResultSet;

public interface BaseEntity<T> {
	public void toEntity(ResultSet resultSet);
	public ResultSet toResultSet(T resultSet);
}
