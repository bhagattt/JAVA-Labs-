import java.io.*;

public class StudentInfo {
    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        System.out.println("Enter a number:");
        int a = Integer.parseInt(br.readLine());

        System.out.println("Enter your name:");
        String name = br.readLine();

        System.out.println("Enter your address:");
        String address = br.readLine();

        System.out.println("Enter your email:");
        String email = br.readLine();

        System.out.println("\nStudent Information:");
        System.out.println("Number: " + a);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
    }
}Hello You
