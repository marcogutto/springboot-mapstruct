package com.example.mapstruts.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapstruts.domain.Source;
import com.example.mapstruts.domain.SourceTargetMapper;
import com.example.mapstruts.domain.Target;

@RestController
@RequestMapping(value = "/api/targets")
public class TargetController {
	
	@Autowired
	private SourceTargetMapper mapper;
	
	@GetMapping
	public ResponseEntity<List<Target>> getTargets(){
		
		List<Target> targets = new ArrayList<>();
		
		Source source = new Source();
		source.setBar(1l);
		source.setBaz(2l);
		source.setFoo(3);
		source.setQax(4);
		source.setZip(5);
		
		Target target = mapper.sourceToTarget(source);
		targets.add(target);
		
		return new ResponseEntity<>(targets, HttpStatus.OK);
		
	}
	
}
