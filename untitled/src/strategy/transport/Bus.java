package strategy.transport;

public class Bus implements Transport{
    @Override
    public void transport() {
        System.out.println("travel by bus");
    }
}
