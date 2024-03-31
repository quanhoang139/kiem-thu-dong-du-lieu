public class Main {

    public static int calculateReward(int questions, int grade, boolean isNaturalScience) {
        int coefficient = 400;
        if (isNaturalScience) {
            coefficient += 100;
        }
        if (grade >= 10 && grade <= 12) {
            coefficient += 200;
        }
        if (questions > 0 && questions <= 10) {
            coefficient += 200;
        }
        if (questions <= 0 || questions > 50 || grade < 6 || grade > 12) {
            return -1;
        }
        return questions * coefficient;
    }
    public static void main(String[] args) {
        System.out.println(calculateReward(15, 9, true));
    }
}