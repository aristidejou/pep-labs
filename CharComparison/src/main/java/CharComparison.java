public class CharComparison {
    /**
     * Given an array of char, determine if the array A belongs to the left or to the right of char array B lexigraphically.
     * That means its position in a dictionary, eg:
     * cat < dog < mouse
     * cat < car < care
     * You will need to compare an index of both arrays against each other as you iterate with a for loop.
     *
     * @param a an array of char.
     * @param b an array of char.
     * @return -1 if A is less than B, 1 if A is greater than B, and 0 if the two arrays are identical.
     */
    public int compare(char[] a, char[] b){
        int r=0,i=0;
        if(a[0]<b[0]){
            r=-1;
        }
        else
        if(a[0]>b[0]){
            r=1;
        }
        else 
        while(i<a.length){
        if(a[i]==b[i]){i++;}
        else 
        if(a[i]>b[i]){i=20;r=1;}
    }
        return r;
    }
}
