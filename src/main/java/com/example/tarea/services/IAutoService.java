package com.example.tarea.services;



import com.example.tarea.model.Auto;

import java.util.List;

public interface IAutoService {
	
	public List<Auto> findAll();
	
	public void save(Auto cliente);
	
	public Auto findById(Long id);
	
	public void delete(Auto cliente);

}
