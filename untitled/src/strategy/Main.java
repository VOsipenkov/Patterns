package strategy;

import strategy.location.Brazil;
import strategy.location.Thailand;
import strategy.transport.Car;

public class Main {
    public static void main(String[] args) {
        var vacation =new Vacation(new Car(), new Brazil());
        vacation.info();

        System.out.println("Change destination");
        vacation.setCountry(new Thailand());
        vacation.info();
    }
}
