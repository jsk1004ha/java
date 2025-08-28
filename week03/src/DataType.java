public class DataType {
    public static void main(String[] args) {
        //DataType Conv
        int score = 87;
        float gpa = 4.13f;
        System.out.println(score);
        score = (int) 99.9;
        System.out.println(score);
        System.out.println(gpa);
        score = (int) gpa;
        System.out.println(score);
        gpa = (float) score;
        System.out.println(gpa);
    }
}
