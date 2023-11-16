public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Game juego = new Game();
        run(juego);
    }

    public static void run(Game juego1) {
        while (juego1.getStatus()) {
            juego1.nextMove();
            juego1.getPlayerMove();
            if (juego1.checkMoves()) {
                juego1.setScore();
            }
        }
    }
}
