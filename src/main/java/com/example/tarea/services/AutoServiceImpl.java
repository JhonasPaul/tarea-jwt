package com.example.tarea.services;


import com.example.tarea.model.Auto;
import com.example.tarea.repository.IAutoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoServiceImpl implements IAutoService {

	@Autowired
	private IAutoDao autoDaoDao;
	
	@Override
	public List<Auto> findAll() {
		return (List<Auto>) autoDaoDao.findAll();
	}

	@Override
	public void save(Auto cliente) {
		autoDaoDao.save(cliente);
	}

	@Override
	public Auto findById(Long id) {
		return autoDaoDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Auto cliente) {
		autoDaoDao.delete(cliente);
		
	}




}
