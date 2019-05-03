package spring.clound.yiguo.test.desigen.proxy.jingtai;

public class StationTicketImpl implements IBuyTicket {
    @Override
    public void buyTicket() {
        System.out.println("do buy ticket...");
    }
}
