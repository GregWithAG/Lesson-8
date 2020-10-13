
package ArrayMethods;


public class SomeArrayByRow {

    
    public static void main(String[] args) {
        double shopping[][] = {
            {3.49,12.50,14},
            {20.99,30},
            {60.20,1.50,4,1}
        };
        
        double tots[] = getTotals(shopping);
        System.out.println("Totals for " + tots.length + " Days: ");
        
        for (int i = 0; i < tots.length; i++) {
            System.out.format("tots[%d] = %.2f\n",i,tots[i]);
        }
    }
    public static double[] getTotals(double prices[][]){
      double totals[] = new double[prices.length];
        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < prices[i].length; j++) {
                totals[i] += prices[i][j];
            }
        }
        return totals;
    }
}
