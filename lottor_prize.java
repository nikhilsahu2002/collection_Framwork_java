import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.lang.Math;

public class lottor_prize {

    public static final int NUMBER = 6;
    public static final int Max_Number =40;
    public static final int Prize = 100;

    public static Set<Integer> CreateWinningNumber() {
        Set <Integer> winning = new TreeSet<>();
        Random random = new Random();

        while (winning.size() < NUMBER) {
            int number = random.nextInt(Max_Number) + 1;
            winning.add(number);
        }
        return winning;
    }
    public static Set<Integer> getTicket (){
        Set <Integer> ticket = new TreeSet<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter " + NUMBER +" Lotto Number:  ");
        
        while (ticket.size() <NUMBER) {
            int number = scan.nextInt();
            if (number<=Max_Number) {
                ticket.add(number);
            }
        }

        scan.close();
        return ticket;
    }
    public static void main(String[] args) {
        Set <Integer> winning = CreateWinningNumber();        
        Set <Integer> Ticket = getTicket();

        Set <Integer> Matches =new TreeSet<>(Ticket);
        Matches.retainAll(winning);

        System.out.println("Your Ticket Was : " + Ticket);
        System.out.println("Winning Number: " + winning);

        if (Matches.size()>0) {
            double prize = Prize * Math.pow(2, Matches.size());
            System.out.println("Matched Number: " + Matches);
            System.out.printf("Your Prize is $%.2f\n",prize);
        }

    }
}
