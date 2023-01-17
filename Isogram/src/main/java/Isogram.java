
public class Isogram {
    /**
     * An Isogram is a word where no letters are repeated. You may assume that there will only be lowercase
     * letters in the String.
     *
     * For instance, "cat", "isogram", "uncopyrightable" are isograms. "egg", "java", "programming" are not.
     * You could use a Set of characters or a Map of characters to int or boolean to solve this problem.
     * You could even solve it with an array of 26 booleans, and convert characters to an index of that array.
     * It's also possible to solve this with nested for loops.... but it's not as easy or efficient.
     *
     * @param str a String.
     * @return true if str is an isogram, false otherwise.
     */
    public boolean isIsogram(String str){
        int i,j=0;boolean b=false;
        for(i=0;i<=str.length()-2;i++){
            for(j=i+1;j<=str.length()-1;j++){
                if(str.charAt(i)==str.charAt(j)){
                    i=20;j=20;
                }
            }
        }
        if(i==21) b=false;else b=true;
        return b;
    }
}
