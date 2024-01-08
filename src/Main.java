//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        boolean isAlien = false;
        //if else example
        if (isAlien == false) {
            System.out.println("It is not Alien");
        } else {
            System.out.println("It is Alien");
        }
        //Ternary operator
        boolean isDomestic = isAlien ? false : true;
        System.out.println("Person is Domestic " + isDomestic);
        //Method call
        int score = calculateScore(true, 800, 5, 100);

        Car car = new Car();
        car.setMake("Porshe");
        car.setModel("Maccan");
        System.out.println("car model is " + car.getModel());
        System.out.println("Car make is " + car.getMake());
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;
        if(gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score is " + finalScore);
        }
        return finalScore;
    }
}