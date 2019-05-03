package spring.clound.yiguo.test.desigen;

import spring.clound.yiguo.test.desigen.proxy.jingtai.HuangniuTicketImpl;
import spring.clound.yiguo.test.desigen.proxy.jingtai.IBuyTicket;

public class TestCase {
    public static void main(String[] args) {
        IBuyTicket iBuyTicket = new HuangniuTicketImpl();
        iBuyTicket.buyTicket();
    }
}
