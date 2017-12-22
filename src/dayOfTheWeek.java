import java.util.Scanner;

public class dayOfTheWeek {
    public static void main(String[] args) {
        Scanner dataInput = new Scanner(System.in);
        System.out.println("Please enter a number from 1 to 7: ");
        int dayOfTheWeek = dataInput.nextInt();
        String day;
        switch (dayOfTheWeek) {
            case 1: day = "Sunday";
                    break;
            case 2: day = "Monday";
                    break;
            case 3: day = "Tueday";
                    break;
            case 4: day = "Wednesday";
                    break;
            case 5: day = "Thursday";
                    break;
            case 6: day = "Friday";
                    break;
            case 7: day = "Saturday";
                    break;
            default: day = "Number out of range.";
                    break;
        }
        System.out.println(day);
        
    }
    
}
