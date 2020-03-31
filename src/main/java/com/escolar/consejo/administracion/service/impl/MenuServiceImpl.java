package com.escolar.consejo.administracion.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escolar.consejo.administracion.model.Menu;
import com.escolar.consejo.administracion.repository.MenuRepository;
import com.escolar.consejo.administracion.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService{
	private static final Logger log = LoggerFactory.getLogger(MenuServiceImpl.class);
	
	@Autowired
	private MenuRepository menuRepository;
	
	@Override
	public List<Menu> getAllMenu() {
		
		return menuRepository.findAll();
	}

	@Override
	public Menu saveMenu(Menu menu) {
		
		return menuRepository.save(menu);
	}

	@Override
	public Menu getMenuById(Long idMenu) {
		log.info("Find menu with id: {}",idMenu);
		return menuRepository.findById(idMenu).get();
	}

	@Override
	public void deleteMenu(Menu menu) {
		log.info("Delete Menu: ",menu);
		menuRepository.delete(menu);
	}

}
