package main;

import modell.Lada;
import nezet.CuiNezet;

public class LogikaiProgram {

    public static void main(String[] args) {
       Lada[] ladak = new Lada[]{new Lada("arany", "Én rejtem a kincset", false),
                                 new Lada("ezust", "nem én rejtem a kincset", true),
                                 new Lada("bronz", "Az arany hazudik", false)};
        CuiNezet nezet = new CuiNezet();
        nezet.feladatMegjelenito("csak 1 igaz!");
        for (Lada lada : ladak) {
            nezet.konzolraIr(lada.getAnyag() + ": ");
            nezet.leirasMegjelenito(lada.getFelirat());
        }
        int valasztas = nezet.valasztasBeker("meyik (0..2): ");
        if (ladak[valasztas].isKincs()) {
            nezet.eredmenyMegjelenito("talált, a kincset a(z) %s rejti".formatted(ladak[valasztas].getAnyag()));
        } else {
            nezet.eredmenyMegjelenito("nem talált, a kincset nem a(z) %s rejti".formatted(ladak[valasztas].getAnyag()));
        }
    }
    
}
