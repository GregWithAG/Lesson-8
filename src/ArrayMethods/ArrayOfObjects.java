
package ArrayMethods;

public class ArrayOfObjects {

    
    public static void main(String[] args) {
        Room myrooms[] = new Room[5];
        String roomNames[] = {"kitchen","den","washroom","bedroom","playroom"};
        
        for (int i = 0; i < myrooms.length; i++) {
            myrooms[i] = new Room(
            roomNames[i],
            (int)(Math.random() * 20 + 10),
            (int)(Math.random() * 20 + 10)
            );
        
        System.out.println(myrooms[i]);
        }
        }
    }
    

