package Term6;

public class ex5 {
    public static void main(String[] args) {
        Sample_ex5.num = 10;
        Sample_ex5 s = new Sample_ex5();
        Sample_ex5 s2 = new Sample_ex5();
        s.num += 10;
        s2.num = 30;
        System.out.println(Sample_ex5.num);
    }
}
