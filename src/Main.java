import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Main
{
    public static void main(String[] args) {
        Words pet = new Words(10);
        try (FileReader baza = new FileReader("bazaSlow.txt")){
            int c;
            String cur = "";
            while ((c = baza.read()) != -1){
                if ((char)c != ' '   &&   (char)c != ';'){
                    cur = cur + (char) c;
                } else if ((char)c == ' '){
                    pet.addEng(cur);
                    cur = "";
                } else if ((char)c == ';'){
                    pet.addRus(cur);
                    cur = "";
                }
            }


        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }


        pet.display();
       /* System.out.println("Nachinayem igru:");
        int correctAnswer = 0;
        for (int i = 0; i < 5; i++){
            int random = (int)(Math.random() * 5);
            System.out.println(pet.getEngString(random));
            Scanner console = new Scanner(System.in);
            String enterWord = console.nextLine();
            if (enterWord.equals(pet.getRusString(random))){
                System.out.println("pravilno!");
                correctAnswer++;
            } else {
                System.out.println("neprawilno");
            }
        }
        int result = correctAnswer * 100 / 5;
        System.out.println("Result - " + result + "%");

        */
    }

}