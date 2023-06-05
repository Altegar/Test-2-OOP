public class Main {
    public static void main(String[] args) {
        Soccer soccer = new Soccer("Футбол", 1863, 11);
        soccer.print();
        System.out.println();

        Soccer soccer_copy = new Soccer(soccer);
        soccer_copy.print();
        System.out.println();

        Soccer soccer_assignment = new Soccer("Інший футбол", 2000, 8);
        soccer_assignment.print();
        System.out.println();

        soccer_assignment = soccer;
        soccer_assignment.print();
        System.out.println();

        Soccer new_input = new Soccer(soccer);
        new_input.input();
        new_input.print();
    }
}