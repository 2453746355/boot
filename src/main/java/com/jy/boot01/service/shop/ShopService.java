package com.jy.boot01.service.shop;

import com.jy.boot01.entity.shop.Shop;

import java.util.Map;

public interface ShopService {
    Map<String,Object> selectShopList(Shop shop);

    Shop selectShopInfoByID(Shop shop);

    void updateShopInfoByID(Shop shop);

}
