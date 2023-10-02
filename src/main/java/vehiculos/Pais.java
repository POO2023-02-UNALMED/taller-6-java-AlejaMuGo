package vehiculos;
import java.util.ArrayList;
public class Pais{
    public static ArrayList<Pais> paises = new ArrayList<>();
    public String nombre;
    public Pais(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public static Pais paisMasVendedor(){
        Pais pais_max=null;
        int contador_max=0;
        for (int i = 0; i < paises.size(); i++){
            int contador=0;
            for (int j = 0; j < paises.size(); j++){
                if (paises.get(j) == paises.get(i)){
                    contador++;
                }
            }
        if (contador_max < contador){
            contador_max = contador;
            pais_max = paises.get(i);
        }
        }
        return pais_max;
    }

}