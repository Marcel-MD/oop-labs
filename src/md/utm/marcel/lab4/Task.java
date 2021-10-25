package md.utm.marcel.lab4;

import java.util.List;

public class Task {

    public static void main(String[] args) {
        List<String> oneExp = Reader.read("one_expression.txt");
        List<String> threeExp = Reader.read("three_expressions.txt");

        System.out.println(Parenthesis.check(oneExp.get(0)) + " " + oneExp.get(0));

        for(int i = 0; i < threeExp.size(); i++) {
            System.out.println(Parenthesis.check(threeExp.get(i)) + " " + threeExp.get(i));
        }
    }
}
