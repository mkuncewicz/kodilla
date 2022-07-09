import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    private String username;
    private Sign userSign;
    private Sign computerSign;
    private int userPkt;
    private int computerPkt;
    private int howManyGames;
    private boolean endProgram = false;
    private boolean endGame;
    private List<Sign> list = new ArrayList<>();

    public Game() {
        list.add(0, new Rock());
        list.add(1, new Paper());
        list.add(2, new Scissors());
    }

    public void startGame(){
        System.out.println("Podaj imie");
        username = scanner.next().toString();
        while (!endProgram) {
            userPkt = 0;
            computerPkt = 0;
            System.out.println("Ile gier?");
            howManyGames = scanner.nextInt();
            Message.messageChoice();
            endGame = false;
            while (!endGame){
                char menuChoice = scanner.next().charAt(0);
                if(menuChoice == '1' || menuChoice == '2' || menuChoice == '3'){
            userSign = choiceSign(menuChoice);
            computerSign = list.get(random.nextInt(3));
            System.out.println(username+": " +userSign);
            System.out.println("Computer:"+" "+computerSign);
            whoWin(userSign, computerSign);
            System.out.println("Gracz: " + userPkt + " Computer: " + computerPkt);
            if(userPkt == howManyGames){
                System.out.println(username +" win");
                endGame = true;
            } else if (computerPkt == howManyGames) {
                System.out.println("Computer win");
                endGame = true;
            }
        }else if (menuChoice == 'n'){
                    System.out.println("Czy na pewno zakończyć aktualną grę?");
                    if(scanner.next().charAt(0) == 't'){
                        endGame = true;
                    }else {
                        Message.messageChoice();
                        continue;
                    }
                }
                else if (menuChoice == 'x'){
                    System.out.println("Czy na pewno zakończyć grę?");
                    if(scanner.next().charAt(0) == 't'){
                        endGame = true;
                        endProgram = true;
                    }else {
                        Message.messageChoice();
                        continue;
                    }
                }
            }

            if(!endProgram){
            Message.newGame();
            char wybor = scanner.next().charAt(0);
            if(wybor == 'n'){
                endProgram = true;
                Message.messageChoice();
            }else if (wybor == 't'){
                continue;
            }
        }}
    }

    private Sign choiceSign(char choice){
        switch (choice){
            case '1': return list.get(0);
            case '2': return list.get(1);
            case '3': return list.get(2);
            default: return null;
        }

    }

    private void whoWin(Sign sign1, Sign sing2){
        String choice = sign1.getName();
        switch (choice){
            case "Rock": rockGame(sign1, sing2);
            break;
            case "Paper": paperGame(sign1, sing2);
            break;
            case "Scissors": paperGame(sign1, sing2);
            break;
        }
        }


    private void rockGame(Sign sign1, Sign sign2){
        if(sign1.equals(sign2)){
            System.out.println("Remis");
        }else if(sign1.equals(list.get(0)) && (sign2.equals(list.get(2)))){
            System.out.println("Wygrana");
            userPkt++;
        }else if(sign1.equals(list.get(0)) && (sign2.equals(list.get(1)))){
            System.out.println("Przegrana");
            computerPkt++;
        }
    }
    private void paperGame(Sign sign1, Sign sign2){
        if(sign1.equals(sign2)){
            System.out.println("Remis");
        }else if(sign1.equals(list.get(1)) && (sign2.equals(list.get(0)))){
            System.out.println("Wygrana");
            userPkt++;
        }else if(sign1.equals(list.get(1)) && (sign2.equals(list.get(2)))){
            System.out.println("Przegrana");
            computerPkt++;
        }
    }
    private void ScissorsGame(Sign sign1, Sign sign2){
        if(sign1.equals(sign2)){
            System.out.println("Remis");
        }else if(sign1.equals(list.get(2)) && (sign2.equals(list.get(1)))){
            System.out.println("Wygrana");
            userPkt++;
        }else if(sign1.equals(list.get(2)) && (sign2.equals(list.get(0)))){
            System.out.println("Przegrana");
            computerPkt++;
        }
    }


}
