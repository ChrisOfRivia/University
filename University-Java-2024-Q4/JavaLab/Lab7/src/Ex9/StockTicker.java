package Ex9;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockTicker {
    Map<String, List<Double>> stringDoubleMap = new HashMap<>();

    public void addStock(String stock, List<Double> price){
        this.stringDoubleMap.put(stock, price);
    }

    public void updatePrice(String stock, double newPrice){
        this.stringDoubleMap.get(stock).add(newPrice);
    }

    public double getLastPrice(String stock){
        return this.stringDoubleMap.get(stock).getLast();
    }
}
