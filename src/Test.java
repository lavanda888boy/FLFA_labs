import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        
        String V_n = "SRL";
        String V_t = "abcdef";

        Map<Character, List<String>> productions = new HashMap<>();

        List<String> p1 = new ArrayList<>();
        p1.add("aS");
        p1.add("bS");
        p1.add("cR");
        p1.add("dL");
        productions.put('S', p1);

        List<String> p2 = new ArrayList<>();

        p2.add("cR");
        p2.add("e");
        productions.put('R', p2);

        List<String> p3 = new ArrayList<>();

        p3.add("fL");
        p3.add("eL");
        p3.add("d");
        productions.put('L', p3);

        char S = 'S';

        Grammar grammar = new Grammar(V_n, V_t, productions, S);

        System.out.println(grammar.generateString());
    }
}