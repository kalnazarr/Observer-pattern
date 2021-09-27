package observer;

import java.util.ArrayList;
import java.util.List;

public class CryptoSite implements Observable {

    private List<String> cryptocurrencies = new ArrayList<>();
    private List<Observer> subscribers = new ArrayList<>();

    public void addCryptocurrencies(String cryptocurrency){
        this.cryptocurrencies.add(cryptocurrency);
        notifyAllUsers();
    }

    public void removeCryptocurrencies(String cryptocurrency){
        this.cryptocurrencies.remove(cryptocurrency);
        notifyAllUsers();
    }

    @Override
    public void subscribe(Observer subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Observer subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void notifyAllUsers() {
        for (Observer subscriber:subscribers) {
            subscriber.update(this.cryptocurrencies);
        }
    }
}
