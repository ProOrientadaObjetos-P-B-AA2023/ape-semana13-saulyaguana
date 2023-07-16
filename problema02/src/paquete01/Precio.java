package paquete01;

import java.util.ArrayList;

public class Precio {
    public static double totalPrecioTvs(ArrayList<Televisor> t){
        double sl = 0;
        for (int i = 0; i < t.size(); i++) {
            sl = sl + t.get(i).obtenerPrecio();

        }
        return sl;
    }
}
