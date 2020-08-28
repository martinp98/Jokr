import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;

public class jokr
{

    public static void main(String[]args)
    {
        ArrayList<String> jokes = new ArrayList<>();
        jokes.add("Laissez fair");
        jokes.add("Konstitutionelt monarki");
        jokes.add("Absolut monarki");
        jokes.add("Hvad er sjovere end 24? 25")

        double j = jokes.size() * Math.random();
        int jok = (int)j;

        System.out.println(jokes.get(jok));

    }

}
