
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        int i=0,j=0;String s=null;
        for(i=0;i<arr.length-1;i++){
            if(arr[i].length()<arr[i+1].length()){s=arr[i+1];j=j+1;}
        }
            if (j==arr.length-1)
      return s; else
       return null;
        
    }
}
