package vehiculos;
import java.util.ArrayList;
public class Fabricante{
    public static ArrayList<Fabricante> fabricas = new ArrayList<>();
    public String nombre;
    public Pais pais;
    public Fabricante(String nombre, Pais pais){
        this.nombre = nombre;
        this.pais = pais;
        Pais.paises.add(this.pais);
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public Pais getPais(){
        return this.pais;
    }
    public void setPais(Pais pais){
        this.pais = pais;
    }
    public static Fabricante fabricaMayorVentas(){
        Fabricante fabrica_max=null;
        int contador_max=0;
        for (int i = 0; i < fabricas.size(); i++){
            int contador=0;
            for (int j = 0; j < fabricas.size(); j++){
                if (fabricas.get(j) == fabricas.get(i)){
                    contador++;
                }
            }
        if (contador_max < contador){
            contador_max = contador;
            fabrica_max = fabricas.get(i);
        }
        }
        return fabrica_max;
    }
}