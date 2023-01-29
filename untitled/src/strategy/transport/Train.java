package strategy.transport;

public class Train implements Transport{

    @Override
    public void transport() {
        System.out.println("travel by train");
    }
}
