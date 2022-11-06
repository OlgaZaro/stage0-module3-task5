package lang.print.gaps.task5;

public class TimeConvertor {
    float minutes;
    public static void main(String[] args) {
        TimeConvertor timeConvertor = new TimeConvertor();
        for(int i = 1; i<60; i++) {

            timeConvertor.convert(i);
        }
    }
    public void convert(float minutes) {
        float sec = minutes*60;
        System.out.println(sec);
    }
}
