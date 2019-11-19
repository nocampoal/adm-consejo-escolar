package com.escolar.concejo.administracion.service;

import java.util.List;

import com.escolar.concejo.administracion.model.Menu;

public interface MenuService {
	public List<Menu> getAllMenu();
	public Menu saveMenu(Menu menu);
	public Menu getMenuById(Long idMenu);
	public void deleteMenu(Menu menu);

}
