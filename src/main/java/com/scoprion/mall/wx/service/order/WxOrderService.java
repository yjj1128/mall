package com.scoprion.mall.wx.service.order;

import com.scoprion.result.BaseResult;
import com.scoprion.result.PageResult;

/**
 * @author by Administrator
 * @created on 2017/11/6/006.
 */
public interface WxOrderService {

    /**
     * 我的订单
     *
     * @param pageNo      当前页
     * @param pageSize    每页条数
     * @param wxCode      微信code
     * @param orderStatus 订单状态
     * @return
     */
    PageResult findByUserId(int pageNo, int pageSize, String wxCode, String orderStatus);

    /**
     * 查询订单详情
     * @param orderId
     * @return
     */
    BaseResult findByOrderId(Long orderId);

    /**
     * 退款
     * @param orderId
     * @return
     */
    BaseResult refund(Long orderId);



}
