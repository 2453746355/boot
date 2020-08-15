package com.jy.boot01.service.menu;

import com.jy.boot01.entity.menu.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> selectSideMenuList(Menu menu);
}
