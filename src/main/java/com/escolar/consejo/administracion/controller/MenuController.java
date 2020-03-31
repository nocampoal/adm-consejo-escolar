package com.escolar.consejo.administracion.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escolar.consejo.administracion.model.Menu;
import com.escolar.consejo.administracion.service.MenuService;

@RestController
@CrossOrigin("*")
@RequestMapping("/menu")
public class MenuController {
	private static final Logger log = LoggerFactory.getLogger(MenuController.class);


	@Autowired
	private MenuService menuService;
	
	@GetMapping(path = "/getAll",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Menu>> getAllMenu(){
		log.debug("call method getAllMenus() ");
		return ResponseEntity.ok(menuService.getAllMenu());
	}
	
	@PostMapping(path = "/save",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Menu> saveMenu(@RequestBody Menu menu)  {
		log.debug("Call saveMenu method");
		return ResponseEntity.ok(menuService.saveMenu(menu));
	 }
	
	@GetMapping(path = "/{idMenu}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Menu> findMenuById(@PathVariable Long id) {
		log.debug("Call method findMenuByID");
		return ResponseEntity.ok(menuService.getMenuById(id));
	}
	
	@PostMapping(path = "/delete")  
	public ResponseEntity<Void> deleteMenu(@RequestBody Menu menu){
		log.debug("call method deleteMenu");
		menuService.deleteMenu(menu);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
