
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Rational_Arithmetic {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = reader.readLine().split(" ");
        String[] s2 = s1[0].split("/");
        String[] s3 = s1[1].split("/");
        int a1 = Integer.parseInt(s2[0]);
        int b1 = Integer.parseInt(s2[1]);
        int a2 = Integer.parseInt(s3[0]);
        int b2 = Integer.parseInt(s3[1]);
        int c1 = GCD(a1, b1);
        int c2 = GCD(a2, b2);
        a1 = a1 / c1;
        b1 = b1 / c1;
        a2 = a2 / c2;
        b2 = b2 / c2;
//        System.out.printf("%d,%d,%d,%d,%d,%d",a1,b1,c1,a2,b2,c2);//2,3,1,-2,1,2
        sum(a1, b1, a2, b2);
        System.out.println();
        difference(a1, b1, a2, b2);
        System.out.println();
        product(a1, b1, a2, b2);
        System.out.println();
        quotient(a1, b1, a2, b2);
    }

    private static void sum(int m1, int n1, int m2, int n2) {
        int mtemp = m1 * n2 + m2 * n1;
        int ntemp = n1 * n2;
        printSingleNum(m1, n1);
        System.out.print(" + ");
        printSecondNumAndResult(m2, n2, mtemp, ntemp);
    }

    private static void difference(int m1, int n1, int m2, int n2) {
        int mtemp = m1 * n2 - m2 * n1;
        int ntemp = n1 * n2;
        printSingleNum(m1, n1);
        System.out.print(" - ");
        printSecondNumAndResult(m2, n2, mtemp, ntemp);
    }

    private static void product(int m1, int n1, int m2, int n2) {
        int mtemp = m1 * m2;
        int ntemp = n1 * n2;
        if (m1 == 0) {
            System.out.print("0 * ");
            printSingleNum(m2, n2);
            System.out.print(" = 0");
        }
        if (m2 == 0) {
            printSingleNum(m1, n1);
            System.out.print(" * 0 = 0");
        } else {
            printSingleNum(m1, n1);
            System.out.print(" * ");
            printSecondNumAndResult(m2, n2, mtemp, ntemp);
        }
    }

    private static void quotient(int m1, int n1, int m2, int n2) {
        if (m2 != 0) {
            int mtemp = m1 * n2;
            int ntemp = m2 * n1;
            if (ntemp < 0) {
                mtemp = -mtemp;
                ntemp = -ntemp;
            }
            printSingleNum(m1, n1);
            System.out.print(" / ");
            printSecondNumAndResult(m2, n2, mtemp, ntemp);
        } else {
            printSingleNum(m1, n1);
            System.out.print(" / 0 = Inf");
        }
    }

    private static void printSingleNum(int m, int n) {
        if (m % n == 0) {
            if (m >= 0) {
                System.out.print(m / n);
            } else {
                System.out.printf("(%d)", m / n);
            }
        } else {
            if (Math.abs(m) > Math.abs(n)) {
                if (m >= 0) {
                    System.out.printf("%d %d/%d", m / n, m - m / n * n, n);
                } else {
                    m = -m;
                    System.out.printf("(-%d %d/%d)", m / n, m - m / n * n, n);
                }
            } else {
                if (m >= 0) {
                    System.out.printf("%d/%d", m - m / n * n, n);
                } else {
                    System.out.printf("(%d/%d)", m - m / n * n, n);
                }
            }
        }
    }

    private static void printSecondNumAndResult(int m, int n, int mtemp, int ntemp) {
        printSingleNum(m, n);
        System.out.print(" = ");
        int ctemp = Math.abs(GCD(mtemp, ntemp));
        printSingleNum(mtemp / ctemp, ntemp / ctemp);
    }

    private static int GCD(int m, int n) {
        return n == 0 ? m : GCD(n, m % n);
    }
}