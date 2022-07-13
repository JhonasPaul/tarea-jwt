package com.example.tarea.controllers;


import com.example.tarea.model.Auto;
import com.example.tarea.services.IAutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class AutoRestController {

	@Autowired
	private IAutoService autoService;

	@GetMapping("/autos")
	public List<Auto> index() {
		return autoService.findAll();
	}


	@GetMapping("/autos/{id}")
	public Auto show(@PathVariable Long id) {
		return this.autoService.findById(id);
	}

	@PostMapping("/autos")
	@ResponseStatus(HttpStatus.CREATED)
	public Auto create(@RequestBody Auto auto) {
		this.autoService.save(auto);
		return auto;
	}

	@PutMapping("/autos/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Auto update(@RequestBody Auto auto, @PathVariable Long id) {
		Auto autoActual = this.autoService.findById(id);
		autoActual.setNombre(auto.getNombre());
		autoActual.setPrecio(auto.getPrecio());
		this.autoService.save(autoActual);
		return autoActual;
	}

	@DeleteMapping("/autos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		Auto autoActual = this.autoService.findById(id);
		this.autoService.delete(autoActual);
	}
}
