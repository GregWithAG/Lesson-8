package ArrayMethods;

public class Attendance {

    public static void main(String[] args) {
        String atendance[][]={
            {"Joe","S09","S12","O14"},
            {"BOB","O13"},
            {"SUE","S24","O12"},
            {"AMY","S05","S23","O11","O23","N12","N23"},
        };
        
        for (int i = 0; i < atendance.length; i++) {
            for (int j = 0; j < atendance[i].length; j++) {
                System.out.print(j==0? atendance[i][j] + " - Absent Days" : atendance[i][j] + " | ");
            }
            System.out.println("\n---------------------------");
        }
        
    }   
    public static String[] getDates(String nm,String att[][]){
        String dates = "";
        for (int i = 0; i < att.length; i++) {
            if (nm.equals(att[i][0])) {
                for (int j = 0; j < att[i].length; j++) {
                    dates += att[i][j];
                }
            }
        }
        
        
    }
    
}
