package strategy.transport;

public class Car implements Transport{
    @Override
    public void transport() {
        System.out.println("drive car");
    }
}
