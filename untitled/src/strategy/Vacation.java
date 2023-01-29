package strategy;

import strategy.location.Country;
import strategy.transport.Transport;

public class Vacation {
    private Transport transport;
    private Country country;

    public Vacation(Transport transport, Country country) {
        this.transport = transport;
        this.country = country;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void info() {
        country.location();
        transport.transport();
    }
}
