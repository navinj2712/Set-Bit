import java.util.Scanner;

public class SetBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A bit : ");
        int aBit = scanner.nextInt();
        System.out.println("Enter B bit : ");
        int bBit = scanner.nextInt();
        int output = findSetBit(aBit, bBit);
        System.out.println("Output : " + output);
    }

    private static int findSetBit(int aBit, int bBit) {
        int output = 0;
        output = output | 1 << aBit;
        output = output | 1 << bBit;
        return output;
    }
}
