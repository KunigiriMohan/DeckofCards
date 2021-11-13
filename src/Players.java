import java.util.ArrayList;
import java.util.Scanner;

public class Players {
    public void inputPlayer(){
        ArrayList<String> persons= new ArrayList<String>();                           //Creating arrayList of persons
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many player play the Game");
        int i =scanner.nextInt();                       //Taking input from user how many players play the Game

        if (i>=2&& i<=4)                            //Checking input condition
        {
            for (i=2;i<=4;i++){
                System.out.println("Enter player name: ");
                String name= scanner.next();
                persons.add(name);
            }
        }
        for (String name : persons){
            System.out.println(persons.indexOf(name));
        }
    }
}
