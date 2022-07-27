package com.devsuperior.dsclient.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsclient.entities.Client;


	
	@RestController
	@RequestMapping(value = "/clients")
	public class ClientResource {
		
		@GetMapping
		public ResponseEntity<List<Client>> findAll() {
			List<Client> list = new ArrayList<>();
			list.add(new Client(1L, "Paulo", "005512", null, null, 1));
			list.add(new Client(2L, "Stryder", "005513", null, null, 2));
			return ResponseEntity.ok().body(list);
			
		}
	

	}


