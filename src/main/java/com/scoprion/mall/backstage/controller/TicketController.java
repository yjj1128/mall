package com.scoprion.mall.backstage.controller;

import com.scoprion.mall.domain.Ticket;
import com.scoprion.mall.backstage.service.ticket.TicketService;
import com.scoprion.result.BaseResult;
import com.scoprion.result.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2017/10/10.
 *
 * @author ycj
 */
@RestController
@RequestMapping("backstage/ticket")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    /**
     * 创建优惠券
     *
     * @param ticket
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public BaseResult add(@RequestBody Ticket ticket) throws Exception {
        return ticketService.add(ticket);
    }

    /**
     * 优惠券分页
     *
     * @param pageNo
     * @param pageSize
     * @param searchKey
     * @return
     */
    @RequestMapping(value = "/findByCondition", method = RequestMethod.GET)
    public PageResult findByCondition(int pageNo, int pageSize, String searchKey) {
        return ticketService.listByPage(pageNo, pageSize, searchKey);
    }

    /**
     * 编辑优惠券
     *
     * @param ticket
     * @return
     */
    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    public BaseResult modify(@RequestBody Ticket ticket) {
        return ticketService.modify(ticket);
    }

    /**
     * 根据主键删除优惠券
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/deleteById", method = RequestMethod.GET)
    public BaseResult deleteById(Long id) {
        return ticketService.deleteById(id);
    }


}