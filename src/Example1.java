public class Example1 {

    public static void main(String[] args) {
        int x[] = {66,44,55,33,76,44,454,23,22,476};
        
        x[1] = 100;
        int ii = 4;
        int count7=0;
        x[ii - 1] = 94;
        for(int i=0; i<x.length;i++){
            System.out.format("x[%d] = %d\n",i,x[i]);
            if(x[i]==7) count7++;
        }
        System.out.println("there are " + count7 + " 7's in the list");
    }
    
}
