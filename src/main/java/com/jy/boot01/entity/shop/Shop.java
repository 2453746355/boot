package com.jy.boot01.entity.shop;

import com.jy.boot01.common.util.PageUtil;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Setter
@Getter
public class Shop  extends PageUtil implements Serializable {

    private int shopID;

    private String shopName;

    //金木水火土（1，2，3，4，5）
    private int shopType;

    private String shopTags;

    private int shopAddr;

    private String shopDateStr;
}
