import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        List<String> lista = new ArrayList<>();
        lista.add("Apor");
        lista.add("Adi");
        lista.add("Sall");

        for (String s: lista) {
            System.out.println(s + " ");
        }
    }
}