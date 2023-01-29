package strategy.transport;

public class Airplane implements Transport{
    @Override
    public void transport() {
        System.out.println("Fly by airplane");
    }
}
