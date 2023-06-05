import java.util.Scanner;

public class Soccer extends SportGame {
    private int players_count;

    public Soccer(String name, int foundation_year, int players_count) {
        super(name, foundation_year);
        this.players_count = players_count;
    }

    public Soccer(Soccer soccer) {
        super(soccer);
        this.players_count = soccer.players_count;
    }

    public void print() {
        super.print();
        System.out.println("Кількість гравців: " + players_count);
    }

    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість гравців: ");
        players_count = scanner.nextInt();
    }
}