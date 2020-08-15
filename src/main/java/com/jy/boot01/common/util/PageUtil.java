package com.jy.boot01.common.util;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PageUtil {

    //页码
    private int page = 10;

    //每页条数
    private int rows = 50;

    private int limit = 50;

    //总条数
    private int total;

    //总页数
    private int pages;

    //开始位置
    private int start;

    //结束位置
    private int end;

    public void startPage() {
        //计算
        pages = pages % rows == 0 ? pages / rows : pages / rows + 1;
        end = page * rows;
        start = (page - 1) * rows;
    }
}
