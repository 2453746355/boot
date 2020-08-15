package com.jy.boot01.service.menu.impl;

import com.jy.boot01.entity.menu.Menu;
import com.jy.boot01.mapper.menu.MenuMapper;
import com.jy.boot01.service.menu.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> selectSideMenuList(Menu menu) {
        List<Menu> mlist = menuMapper.selectSideMenuList(menu);
        if (null == mlist)
            return new ArrayList<>();

        mlist.forEach(me -> {
            Menu m = new Menu();
            m.setPid(me.getId());
            //查询当前节点的子项列表
            List<Menu> ml = menuMapper.selectSideMenuList(m);
            if (null == ml) {
                me.setChildren(new ArrayList<>());
            } else {
                me.setChildren(ml);
            }
        });

        return mlist;
    }
}
