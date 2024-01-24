package nezet;

import java.util.Scanner;

public class CuiNezet {
    private static final Scanner SC = new Scanner(System.in);
    private static final String SEP = System.lineSeparator();
    
    public void konzolraIr(String msg){
        System.out.print(msg);
    }
    
    public void leirasMegjelenito(String msg){
        konzolraIr(msg + SEP);
    }
    
    public void feladatMegjelenito(String msg){
        konzolraIr(msg + SEP);
    }
    
    public int valasztasBeker(String msg){
        konzolraIr(msg);
        return SC.nextInt();
    }
    
    public void eredmenyMegjelenito(String msg){
        konzolraIr(msg + SEP);
    }
}
