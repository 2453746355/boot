package com.jy.boot01.mapper.menu;

import com.jy.boot01.entity.menu.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface MenuMapper {
    @Select(" select m.t_id id, m.t_text text," +
            " m.t_href href, m.t_pid pid " +
            " from t_menus m" +
            " where m.t_pid = #{pid}")
    List<Menu> selectSideMenuList(Menu menu);
}
