public class CurseFloor21 {
    public static void main(String[] args) {
        int floor = (int)Math.floor(Math.random() * (30 - 1 + 1) + 1);
        if (floor == 21) {
            System.out.println("The curse awaits...");
        }
        else {
            System.out.println("You have nothing to worry about");
        }
    }
}
