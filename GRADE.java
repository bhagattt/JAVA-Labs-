import java.util.Scanner;

class GRADE {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the Percentage:");
        int marks = ob.nextInt();
        if (marks >= 91 && marks <= 100) {
            System.out.println("GRADE=A PERCENTAGE=" + marks);
        } else if (marks >= 81 && marks <= 90) {
            System.out.println("GRADE=B PERCENTAGE=" + marks);
        } else if (marks >= 71 && marks <= 80) {
            System.out.println("GRADE=C PERCENTAGE=" + marks);
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("GRADE=D PERCENTAGE=" + marks);
        } else if (marks >= 0 && marks < 60) {
            System.out.println("GRADE=F PERCENTAGE=" + marks);
        } else {
            System.out.println("INVALID PERCENTAGE");
        }
	ob.close();
    }
}
