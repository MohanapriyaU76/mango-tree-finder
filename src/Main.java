import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int treeNumber = scanner.nextInt();

        boolean isMangoTree = true;

        if (treeNumber == 1 || treeNumber == columns || treeNumber == columns + 1 || treeNumber == columns * rows) {
            isMangoTree = false;
        }

        System.out.println(isMangoTree);
    }
}
