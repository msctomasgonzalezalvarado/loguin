import java.util.Map;
import java.util.HashMap;

public class Pruebas {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<Integer,String>();

        map.put(1, "Clean Code");
        map.put(2, "Effective Java");

        for (int key : map.keySet()) {
            System.out.println("Llave: " + key + " Valor: " + map.get(key));
        }
    }
}
