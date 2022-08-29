package com.suwenting.Service.impl;

import com.suwenting.Service.BuyGoodsService;
import com.suwenting.dao.GoodsDao;
import com.suwenting.dao.SaleDao;
import com.suwenting.domian.Goods;
import com.suwenting.domian.Sale;

/**
 * @author admin
 * @Classname BuyGoodsServiceImpl
 * @Version 1.0.0
 * @Date 2022/7/14 9:56
 */
public class BuyGoodsServiceImpl implements BuyGoodsService {
    private SaleDao saleDao;
    private GoodsDao goodsDao;

    @Override
    public void buy(Integer goodsId, Integer nums) {
        System.out.println("========buy方法的开始===========");
        //记录销售信息，想sale表添加记录
        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setNums(nums);
        saleDao.insertSale(sale);
        //更新库存
        Goods goods = goodsDao.selectGoods(goodsId);
        if (goods == null) {
            //商品不存在
            throw new NullPointerException("编号是:" + goodsId + ",商品不存在");
        } else if (goods.getAmount() < nums) {
            //商品库存不存在
            throw new NullPointerException("编号是:" + goodsId + ",商品不存在");
        }
        //修改库存
        Goods buyGoods = new Goods();
        buyGoods.setId(goodsId);
        buyGoods.setAmount(nums);
        goodsDao.updateGoods(buyGoods);
        System.out.println("========buy方法的结束===========");


    }

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }


}
