import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class Maps {
    
    private void datosMap(){
       System.out.println("********* HashMap *********");
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Belga");		
		map.put(3, "Pastor alemán");		
		map.put(11, "Viejo pastor inglés");	
		map.put(16, "Poodle");	
		map.put(18, "Labrador");		
		map.put(7, "Chihuahua");
		
		// Imprimimos el Map con un Iterador
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()){
		  Integer key = it.next();
		  System.out.println("Clave: " + key + " -> Valor: " + map.get(key)); 
    }

	public static void main(String[] args) {
       Maps m=new Maps();
       m.datosMap();
		
	}
}