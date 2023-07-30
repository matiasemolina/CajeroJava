package controlador;

import java.util.List;

import mapper.BaseMapper;

public abstract class ControladorBase<T> {
	protected List<T> readAll(String consulta, BaseMapper mapper){
		return null;
	};
	protected List<T> getByParameters(T request, String query){
		return null;
	};
	protected Integer insert(T t, String sql) {
		return null;
	};
}