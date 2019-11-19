package com.escolar.concejo.administracion.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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

import com.escolar.concejo.administracion.model.Menu;
import com.escolar.concejo.administracion.service.MenuService;

@RestController
@CrossOrigin("*")
@RequestMapping("/menu")
public class MenuController {
	private static final Log log = LogFactory.getLog(MenuController.class);

	
	
	@Autowired
	private MenuService menuService;
	
	@GetMapping(path = "/getAll",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Menu>> getAllMenu(){
		log.info("call method getAllMenus() ");
		List<Menu> menus = menuService.getAllMenu();
		return new ResponseEntity<>(menus, HttpStatus.OK);
	}
	
	@PostMapping(path = "/save",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Menu> saveMenu(@RequestBody Menu menu)  {
		log.info("call method saveMenu() ");
		try {
			menuService.saveMenu(menu);
		} 
		catch (Exception e) {
			 log.error("Save menu method error",e);
			 return new ResponseEntity<>(menu, HttpStatus.NOT_FOUND); 
		}
		 return new ResponseEntity<>(menu, HttpStatus.OK); 
	 }
	

	@GetMapping(path = "/{idMenu}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Menu> findMenuById(@PathVariable Long idMenu) {
			Menu menu = new Menu();
			try {
				menu = menuService.getMenuById(idMenu);
			} catch (Exception e) {
				log.error("Error in find by menu", e);
				return  new ResponseEntity<>(menu, HttpStatus.BAD_REQUEST);
			}
			return new ResponseEntity<>(menu, HttpStatus.OK); 
	}
	
	@PostMapping(path = "/delete")  
	public ResponseEntity<Void> deleteMenu(@RequestBody Menu menu){
		try {
			log.info("call method deleteMenu");
			menuService.deleteMenu(menu);
		} catch (Exception e){
			log.error("Error removing menu "+menu.getNombre(), e);
		}
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
