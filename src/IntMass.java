import java.util.ArrayList;



public class IntMass {
private int size;




    public IntMass(int size) {
        ArrayList<Object> IntMass = new ArrayList<>(size);
        
    }
    
    
    

    public static ArrayList getAdd(ArrayList intMass) {
        while (intMass.get(intMass.size() - 1) == null) {
            intMass.add((int) Math.random() * 50);

        }
        return intMass;
    }
    
    
    
}
