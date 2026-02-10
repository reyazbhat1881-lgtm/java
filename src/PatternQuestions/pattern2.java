package src.PatternQuestions;

public class pattern2{
    public static void main(String[] args) {
        pattern2(5);
    }
    static void pattern2(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
