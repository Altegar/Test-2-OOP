import java.util.Scanner;

public class SportGame {
    protected String name;
    protected int foundation_year;

    public SportGame(String name, int foundation_year) {
        this.name = name;
        this.foundation_year = foundation_year;
    }

    public SportGame(SportGame game) {
        this.name = game.name;
        this.foundation_year = game.foundation_year;
    }

    public void print() {
        System.out.println("Назва: " + name);
        System.out.println("Рік заснування: " + foundation_year);
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть назву: ");
        name = scanner.nextLine();
        System.out.print("Введіть рік заснування: ");
        foundation_year = scanner.nextInt();
    }
}