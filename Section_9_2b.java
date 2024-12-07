public class Section_9_2b {
    public static void main(String[] args) {

        // Creating new instance of (Stock) object
        Section_9_2 oracleStock = new Section_9_2("ORCL", "Oracle Corporation");

        // Give arguments for method
        oracleStock.setPreviousClosingPrice(34.5);
        oracleStock.setCurrentPrice(34.35);

        // Output
        //
        System.out.println("Stock symbol: " + oracleStock.getSymbol());
        System.out.println("Stock name: " + oracleStock.getName());
        System.out.println("Previous Closing Price: " + oracleStock.getPreviousClosingPrice());
        System.out.println("Current Price: " + oracleStock.getCurrentPrice());
        System.out.println("Price-change percentage: " + oracleStock.getChangePercent() + " %");

    }
}
