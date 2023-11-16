import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private ArrayList<String> possibleMoves = new ArrayList<>(List.of("red", "yellow", "green", "blue"));
    public List<String> partyMoves = new ArrayList<>();
    private List<String> playerMoves = new ArrayList<>();
    private boolean win = true;
    private int score = 0;

    public Game() {
        
    }

    public void nextMove() {
        Random randomize = new Random();
        int index = randomize.nextInt(possibleMoves.size());
        partyMoves.add(possibleMoves.get(index));
    }

    public String getPlayerMove() {
        this.playerMoves.clear();
        Scanner watchMove = new Scanner(System.in);
        System.out.println("Enter your move (red, yellow, green, or blue): ");
        String move = watchMove.nextLine();
        if (move.contains(",")){
            String[] movements = move.split(",");
            for (String movement: movements){
                playerMoves.add(movement);
            }
        }
        else{
            playerMoves.add(move);
        }
        System.out.println(this.playerMoves);
        return move;
    }

    public boolean checkMoves() {
        for (String computerMove : partyMoves) {
            for (String playerMove : playerMoves) {
                if (!computerMove.equals(playerMove)) {
                    System.out.println("Score: " + Integer.toString(this.getScore()));
                    win = false;
                    return win;
                }
                else {
                    return true;
                }
            }
        }
        return win;
    }
    
    public boolean getStatus(){
        return win;
    }
    
    public void setScore(){
        this.score =  this.score + 10;
    }
    
    public int getScore(){
        return this.score;
    }


}
