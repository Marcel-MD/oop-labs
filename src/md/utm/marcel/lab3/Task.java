package md.utm.marcel.lab3;

public class Task {
    public static void main(String[] args) {
        String text = "Go is expressive, concise, clean, and efficient. Its concurrency mechanisms make it easy to" +
                " write programs that get the most out of multicore and networked machines, while its novel type" +
                " system enables flexible and modular program construction. Go compiles quickly to machine code" +
                " yet has the convenience of garbage collection and the power of run-time reflection. It's a fast," +
                " statically typed, compiled language that feels like a dynamically typed, interpreted language.";

        TextInfo info = new TextInfo(text);

        System.out.println("//=============    Task 1-2-3    ==============//");
        System.out.println(info);
    }
}
