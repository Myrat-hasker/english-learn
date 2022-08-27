import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Main
{
    public static void main(String[] args) {
        Words pet;
        int arrSize = 0;
        try (FileReader baza = new FileReader("bazaSlow.txt")){
            int c;
            String cur = "";
            while((c = baza.read()) != -1){
                if((char)c == ';'){
                    arrSize++;
                }
            }
            pet = new Words(arrSize);
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
            System.out.println("Nachinayem igru:");
            int correctAnswer = 0;
            for (int i = 0; i < arrSize; i++){
                Helper val = new Helper();
                int rand = val.random(1, arrSize);
                System.out.println(pet.getEngString(rand));
                Scanner console = new Scanner(System.in);
                String enterWord = console.nextLine();
                if (enterWord.equals(pet.getRusString(rand))){
                    System.out.println("pravilno!");
                    correctAnswer++;
                } else {
                    System.out.println("neprawilno -" + pet.getRusString(rand) );
                }
            }
            int result = correctAnswer * 100 / arrSize;
            System.out.println("Result - " + result + "%");
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }


        //pet.display();

    }

}