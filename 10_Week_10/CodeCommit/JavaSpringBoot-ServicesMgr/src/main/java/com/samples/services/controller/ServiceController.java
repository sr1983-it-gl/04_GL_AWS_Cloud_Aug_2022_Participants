package com.samples.services.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.samples.services.entity.ServiceEntity;
import com.samples.services.repository.ServiceRepository;

@Controller
public class ServiceController {

	private ServiceRepository repository = new ServiceRepository();

	@GetMapping("/")
	public String home(Model model) {

		try {
			List<ServiceEntity> services = repository.listAll();
			model.addAttribute("services", services);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "services";		
	}
}