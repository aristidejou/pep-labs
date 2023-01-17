import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
       int [] tab={0,0,0,0,0,0,0,0,0,0};
       int j=0;

        // HashMap<String, Integer> map = new HashMap<>();
       for(int i=0;i<10;i++){
        while(j<str.length()){
            if(str.charAt(j)==i){
                tab[i]++;
            }
            j++;

        }
        j=0;
    }
    int max = a[0];
    for(int i = 1; i < a.length;i++) { if(a[i] > max)
    {
    max = a[i];
    }
    }
        return ' ';
    }
}
