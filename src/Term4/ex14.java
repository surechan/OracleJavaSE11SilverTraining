package Term4;

public class ex14 {
    public static void main(String[] args) {
        String[] array = {"A", "B"};
        for (String a : array) {
            for (String b : array) {
                if ("B".equals(b))
                    break;
                System.out.print(b);
            }
        }
    }
}
