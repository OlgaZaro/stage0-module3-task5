package lang.print.gaps.task5;

public class NumberDivider {
    void divide(int toBeDivided) {
        toBeDivided= toBeDivided/5;
        System.out.println(toBeDivided);
    }

    public static void main(String[] args) {
        NumberDivider numberDivider = new NumberDivider();
        numberDivider.divide(10);
    }
}
