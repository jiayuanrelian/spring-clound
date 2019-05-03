package spring.clound.yiguo.test.desigen.proxy.jingtai;

public class HuangniuTicketImpl implements IBuyTicket {

    @Override
    public void buyTicket() {
        IBuyTicket iBuyTicket = new StationTicketImpl();
        iBuyTicket.buyTicket();
    }
}
