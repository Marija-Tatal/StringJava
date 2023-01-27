package Class14;

public class Task2 {
    public static void main(String[] args) {
        String str="hsdafjhaskdj7834817637^%^%$%$(()";
        System.out.println(str.replace("[^A-Za-z0-]", "").length());

    }
}
