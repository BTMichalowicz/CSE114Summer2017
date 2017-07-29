package lab07;



//Benjamin Michalowicz (SBU ID: 110982339)
//Lab 7, Part 3: Stock Class


public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice,currentPrice;
    
    public Stock(String symbol, String name, double previousClosingPrice, double currentPrice){
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }
    
    public double getChangePercent(){
        return (((currentPrice-previousClosingPrice)/previousClosingPrice)*100);
        
        
    }
    
    public static void main(String[] args) {
        
        Stock ORCL = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
       
        
        System.out.printf("The price-change percentage for ORCL is %.3f", ORCL.getChangePercent());
        System.out.print("%\n");
        
    }
    
    
    
        
}
