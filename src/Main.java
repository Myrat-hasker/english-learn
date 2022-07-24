import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Words pet = new Words(10);
        pet.add("cat", "koshka");
        pet.add("fish", "ryba");
        pet.add("dog", "sobaka");
        pet.add("bird", "ptica");
        pet.add("parrot", "popugay");
        // pet.rusDisplay();
        System.out.println("Nachinayem igru:");
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
    }

}