package com.github.pattern.flyweight;

/**
 * Created by JC on 2016-07-13.
 */
public class Test {

    public static void main(String[] args) {
        Ticket ticket01 = TicketFactory.getTicket("北京","青岛");
        ticket01.showTicketInfo("上铺");

        Ticket ticket02 = TicketFactory.getTicket("北京","青岛");
        ticket01.showTicketInfo("下铺");

        Ticket ticket03 = TicketFactory.getTicket("北京","青岛");
        ticket01.showTicketInfo("坐票");

    }
}
