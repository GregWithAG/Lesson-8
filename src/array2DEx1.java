
public class array2DEx1 {

    
    public static void main(String[] args) {
        int x[][] = new int[4][5];
        //2D array of 4 rows x 5 columns = 20 locations
        x[0][1] = 50;
        
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                int num = 10 * row + col;
                x[row][col] = num;
                System.out.format("%5d ",x[row][col]);
            }
            System.out.println("");
        }
        
        System.out.println("\n---------------------------------------------------------\n");
        int marks[][] = {
            {67,78,67,55,76,83,91},
            {83,75,64,69,66},
            {69,68,79,57},
            {51,94,66,85,55,99}
        };
        
        for (int row = 0; row < marks.length; row++) {
            for (int col = 0; col < marks[row].length; col++) {
                System.out.format("%5d |",marks[row][col]);
            }
            System.out.println("");
        }
    }
    
}
