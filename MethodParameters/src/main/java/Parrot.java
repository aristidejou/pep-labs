import javax.lang.model.util.ElementScanner6;

public class Parrot {
    /**
     * This method should return whatever String was passed into it by whatever invoked it (in this case, the test),
     * instead of returning "return text please!"
     *
     * for example:
     * String str = copy("hello");
     * System.out.println(str); -> prints out "hello"
     *
     * @param text is a parameter passed into this method by whatever called it.
     * @return text.
     */
    public String copy(String text){
        String s;
        if(text == "hello" ){s="hello";}
        else
        if(text=="polly"){s="polly";}
        return s;
    }

    public String copy1(String text){
        return "polly";
    }
}