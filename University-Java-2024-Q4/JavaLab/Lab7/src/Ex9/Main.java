package Ex9;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        StockTicker stockTicker = new StockTicker();

        LinkedList<Double> aaplPrices = new LinkedList<>();
        aaplPrices.add(100.0);

        stockTicker.addStock("AAPL", aaplPrices);
        System.out.println(stockTicker.getLastPrice("AAPL"));
        stockTicker.updatePrice("AAPL", 150);
        System.out.println(stockTicker.getLastPrice("AAPL"));
        System.out.println(stockTicker.stringDoubleMap.get("AAPL"));
    }
}
