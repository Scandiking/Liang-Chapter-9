/*
(The stock class) Following the example of the Circle class in Section 9.2, design a class named Stock that contains:
- A string data field named symbol for the stock's symbol
- A string data field named name for stocks' name
- A double data field named previousClosingPrice that stores the stock price for the previous day
- A double data field named currentPrice that stores the stock price for the current time
- A constructor that creates a stock with the specified symbol and name
- A method getChangePercent() that returns the percentage changed from previousClosingPrice to currentPrice.

Draw the UMl diagram for the class then implement the class. Write a test program that creates a Stock object with the
stock symbol ORCL, the name Oracle Corporation, and the previous closing price of 34.5. Set a new current price to
34.35 and display the price-change percentage.
*/

// Naturally would this class be called "Stock"
public class Section_9_2 {
    // Declaring properties
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    // Naturally would this constructor be called "Stock"
    public Section_9_2(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public void setPreviousClosingPrice(double price) {
        this.previousClosingPrice = price;
    }

    public void setCurrentPrice(double price) {
        this.currentPrice = price;
    }

    // Getter for previousClosingPrice
    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    // Getter for currentPrice
    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getChangePercent() {
        if (previousClosingPrice == 0) {
            return 0;
        }
        return ((currentPrice - previousClosingPrice) / previousClosingPrice);
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }
}
