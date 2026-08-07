import java.io.*;
import java.util.*;

class Todo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File file = new File("todo.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        Scanner fileReader = new Scanner(file);

        if (!fileReader.hasNextLine()) {
            System.out.println("No data found.");
        } else {
            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
        }
        fileReader.close();
        FileWriter fw = new FileWriter(file, true);
        System.out.print("\nHow many days do you want to add? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("\nDay " + (i + 1));
            System.out.println("Enter the Date:");
            String date = sc.next();
            System.out.print("LeetCode (y/n): ");
            String lc = sc.next();
            System.out.print("Java Practice (y/n): ");
            String java = sc.next();
            System.out.print("College Subjects (y/n): ");
            String college = sc.next();
            fw.write(date + "," + lc + "," + java + "," + college + "\n");
        }

        fw.close();
        System.out.println("\nData saved successfully.");
        sc.close();
    }
}