package com.escolar.consejo.administracion.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escolar.consejo.administracion.model.Menu;
import com.escolar.consejo.administracion.repository.MenuRepository;
import com.escolar.consejo.administracion.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService{
	
	
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
		
		return menuRepository.findById(idMenu).get();
	}

	@Override
	public void deleteMenu(Menu menu) {
		
		menuRepository.delete(menu);
		
	}

}
