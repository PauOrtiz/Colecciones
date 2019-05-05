
import java.util.*;

public class SetEjemplo
{ 
    public static void main(String[] args) 
    { 
        // HashSet 
        Set<String> hash_Set = new HashSet<String>(); 
        hash_Set.add("Nombre de la mascota"); 
        hash_Set.add("Dueño"); 
        hash_Set.add("Nombre de la mascota"); 
        hash_Set.add("Mail"); 
        hash_Set.add("Mail"); 
        System.out.print("Set no admite elementos duplicados:" + hash_Set); 
  
        // TreeSet 
        System.out.print("Ordenando por medio de TreeSet"); 
        Set<String> tree_Set = new TreeSet<String>(hash_Set); 
        System.out.println(tree_Set); 
    } 
} 