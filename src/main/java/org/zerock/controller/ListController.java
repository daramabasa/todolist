package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.service.ListService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/todo/*")
@AllArgsConstructor
public class ListController {
	private ListService service;
	
	@PostMapping("/list")
	
	@PostMapping("/list-uncompleted")
	
	@PostMapping("/list-completed")
	
	@PostMapping("/insert")
	
	@PostMapping("/delete")
	
	@PostMapping("/update-content")
	
	@PostMapping("/update-completed")
	
	@PostMapping("/update-uncompleted")
}
