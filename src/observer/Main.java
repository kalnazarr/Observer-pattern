package observer;

public class Main {
    public static void main(String[] args) {
        CryptoSite binance = new CryptoSite();

        binance.addCryptocurrencies("Bitcoin (BTC)");
        binance.addCryptocurrencies("Ethereum (ETH)");
        binance.addCryptocurrencies("Litecoin (LTC)");

        Subscriber sub1 = new Subscriber("Warren Buffett");
        Subscriber sub2 = new Subscriber("Elon Musk");

        binance.subscribe(sub1);
        binance.subscribe(sub2);

        binance.addCryptocurrencies("Dogecoin (DOGE)");

        binance.unsubscribe(sub2);

        binance.removeCryptocurrencies("Litecoin (LTC)");
    }
}
