package LamdaTest;

import java.util.Arrays;
import java.util.function.Consumer;
public class Lamdastring

{
    public static void main(String[] args) {

      
        StringBuilder str = new StringBuilder();
        {

            Arrays.asList("Java", "Oops", "MongoDB", "Github").forEach(word -> str.append(word.charAt(0)));
            System.out.println(str);
        }
    }
}
