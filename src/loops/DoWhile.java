package loops;

public class DoWhile {
    public static void main(String[] args) {
        int count = 5;

        do {
            System.out.println(count);
            count--;
        } while (count > 0);

        System.out.println("Blastoff!");
    }
}
