package mania.java.study02;

public class StudyMain02 {

    public static void main(String[] args) {

        for (int num = 100; num >= 0; num--) {
            // 짝수일때만 출력
            if (num%2 != 0) {
                System.out.println(num);
            }
        }
    }
}
