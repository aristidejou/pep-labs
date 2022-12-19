import javax.lang.model.util.ElementScanner6;

public class Comparators {
    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is equal to b, false otherwise.
     */
    public boolean isEqual(int a, int b){
        boolean bo=true;
        if (a==b) {bo=true;}
        else 
        if (a!=b){bo=false;}
        return bo;
    }
//--------------------------
    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is greater than b, false otherwise.
     */
    public boolean greaterThan(int a, int b){
        boolean bo=true;
        if (a>b) {bo=true;}
        else 
        if (a==b){bo=false;}
        
        return bo;
        
    }
    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is less than b, false otherwise.
     */
    public boolean lessThan(int a, int b){
        boolean bo=true;
        if (a<b) {bo=true;}
        else 
        if (a>=b){bo=false;}
        return bo;
        
    }
    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is greater than or equal to b, false otherwise.
     */
    public boolean greaterThanOrEqualTo(int a, int b){
        boolean bo=true;
        if (a>=b) {bo=true;}
        else
        if(a<b){bo=false;}
       
        return bo;
        
    }
    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is less than or equal to b, false otherwise.
     */
    public boolean lessThanOrEqualTo(int a, int b){
        boolean bo=true;
        if (a<=b) {bo=true;}
        else 
        if (a!=b){bo=false;}
        return bo;
    
    }

    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is not equal to b, false otherwise.
     */
    public boolean notEqualTo(int a, int b){
        boolean bo=true;
        if (a!=b) {bo=true;}
        else 
        if (a==b){bo=false;}
        return bo;
        
    }

}