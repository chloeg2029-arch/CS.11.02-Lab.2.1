/**
 *****************************************************************************************************
 * By writing your name in the space provided below, you are honouring the CIS academic honesty pledge
 * “I have neither given nor received unauthorized aid on this piece of work.”
 * NAME: Chloe Gong
 *****************************************************************************************************
 */

public class Main {

    public static void main(String[] args) {
        int sumOfTwo = add(1, 2);
        System.out.println(sumOfTwo);

        int sumOfFour = add(1, 2, 3, 4);
        System.out.println(sumOfFour);

        String morningMessage = morningGreeting("Natalie");
        System.out.println(morningMessage);

        String afternoonMessage = afternoonGreeting("Natalie");
        System.out.println(afternoonMessage);

        String tripling = triple("hihi"); // Fixed: removed extra ( and added )
        System.out.println(tripling);

        double halfed = half(1);
        System.out.println(halfed);

        int posround = roundPositiveValueToNearestInteger(1.5);
        System.out.println(posround);

        int neground = roundNegativeValueToNearestInteger(-1.5);
        System.out.println(neground);
    }

    // 1. add 2 ints
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // 2. add 4 ints
    public static int add(int num1, int num2, int num3, int num4) {
        int sum1 = add(num1, num2);
        int sum2 = add(num3, num4);
        return sum1 + sum2;
    }

    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!"; // Fixed: added comma and space
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!"; // Fixed: added comma and space
    }

    // 5. triple
    public static String triple(String text) {
        return text + text + text;
    }

    // 6. half
    public static double half(int num1) {
        return (double) num1 / 2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double double1) {
        return (int) (double1 + 0.5);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double double2) {
        return (int) (double2 - 0.5);
    }
}