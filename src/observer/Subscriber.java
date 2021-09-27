package observer;

import java.util.List;

public class Subscriber implements Observer{

    private String name;

    public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void update(List<String> cryptocurrencies) {
        System.out.println("Dear Investor " + this.name + "! \nWe have some changes in cryptocurrencies:\n" + cryptocurrencies + "\n");
    }
}
