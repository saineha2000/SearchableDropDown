package net.javaguidesspringboot.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguidesspringboot.repository.BtRepository;

import net.javaguidesspringboot.model.page1;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class page1Controller {
	@Autowired
	private BtRepository btRepository;
	
	@GetMapping("/data")
	public java.util.List<page1> getAllData(){
		return btRepository.findAll();
	}
	
	@PostMapping("/data")
	public page1 createData(@RequestBody page1 page)
	{
		return btRepository.save(page);
	}
	
	@GetMapping("/data/{id}")
	public ResponseEntity<page1> getDataById(@PathVariable Long id)
	{
		page1 page=btRepository.findById(id).orElse(null);
		return ResponseEntity.ok(page);
	}
	
	//updating
	@PutMapping("/data/{id}")
	public ResponseEntity<page1> updateData(@PathVariable Long id,@RequestBody page1 pagedata)
	{
		page1 page=btRepository.findById(id).orElse(null);
		page.setRequestNumber(pagedata.getRequestNumber());
		page.setCountryOfOrigin(pagedata.getCountryOfOrigin());
		page.setAccessType(pagedata.getAccessType());
		page.setBulkAccessNoWorkflow(pagedata.getBulkAccessNoWorkflow());
		page.setSioAcceptanceDate(pagedata.getSioAcceptanceDate());
		page.setCommitDate(pagedata.getCommitDate());
	
		page.setMultiBuild(pagedata.getMultiBuild());
		
		
		page.setSearchType(pagedata.getSearchType());
		page.setCountry(pagedata.getCountry());
		page.setSwitchdd(pagedata.getSwitchdd());
		page.setSearch_no(pagedata.getSearch_no());
		page.setQuantity(pagedata.getQuantity());
		page.setRadio_button_value(pagedata.getRadio_button_value());
		page.setAuto_look_up(pagedata.getAuto_look_up());
		page.setExact(pagedata.getExact());
		
		page1 updatedPage1=btRepository.save(page);
		return ResponseEntity.ok(updatedPage1);
		
	}
}
