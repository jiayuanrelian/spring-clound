package spring.clound.yiguo.test.desigen.factory;

public class BaoMaCarFactory implements ICarFactory {
    @Override
    public ICar produceCar() {
        return new BaoMaCarImpl();
    }
}
