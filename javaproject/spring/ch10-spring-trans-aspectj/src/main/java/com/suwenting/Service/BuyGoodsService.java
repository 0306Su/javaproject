package com.suwenting.Service;

/**
 * @author admin
 * @Classname BuyGoodsService
 * @Version 1.0.0
 * @Date 2022/7/14 9:53
 */
public interface BuyGoodsService {
    //购买商品的方法，goodsId：购买商品的编号，nums：购买商品的数量

    void buy(Integer goodsId, Integer nums);
}
