
public class StoringExample {
    static int arr[] = new int[100];
    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 1000 + 1);
            System.out.print(arr[i] + " | ");
            if((i+1) % 10 == 0)
                System.out.println("");
        }
        
        System.out.println("\nSorting in 3 seconds");
        try{
            Thread.sleep(3000);
        }catch(Exception ex){
            
        }
        System.out.println("------------------------------------");
        
        for(int i = 0; i<arr.length;i ++){
            int smallest = findSmallest(i);
            Swap(i,smallest);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
            if((i+1) % 10 == 0)
                System.out.println("");
        }
    }
    public static int findSmallest(int startpoint){
            int smallestLoc=startpoint;
            int smallnum=arr[startpoint];
            for (int i = startpoint+1; i < arr.length; i++) {
            smallestLoc = i;
            smallnum = arr[i];
        }
            return smallestLoc;
        }
    public static void Swap(int loc1,int loc2){
        int Temp = arr[loc1];
        arr[loc1] = arr[loc2];
        arr[loc2] = Temp;
        
    }
    
}
