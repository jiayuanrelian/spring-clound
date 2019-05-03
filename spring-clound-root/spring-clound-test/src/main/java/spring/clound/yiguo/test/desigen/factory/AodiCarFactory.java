package spring.clound.yiguo.test.desigen.factory;

public class AodiCarFactory implements ICarFactory {
    @Override
    public ICar produceCar() {
        return new AodiCarImpl();
    }
}
