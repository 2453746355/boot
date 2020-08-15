package com.jy.boot01.entity.menu;

import com.jy.boot01.common.util.PageUtil;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
public class Menu extends PageUtil implements Serializable {
    private int id;

    private String text;

    private String href;

    private boolean checked;

    private int pid;

    private List<Menu> children;

    //添加业务字段
    private int userID;

    private String type = "all";
}
