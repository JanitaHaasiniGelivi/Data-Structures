
import java.util.Scanner;

class guessNumber {
    private int pickedNumber;

    public guessNumber(int pickedNumber) {
        this.pickedNumber = pickedNumber;
    }

    // Simulates LeetCode's guess API
    public int guess(int num) {
        if (num == pickedNumber) {
            return 0;
        } else if (num > pickedNumber) {
            return -1;
        } else {
            return 1;
        }
    }
}

public class guess extends guessNumber {

    public guess(int pickedNumber) {
        super(pickedNumber);
    }

    public int guessNumber(int n) {
        int l = 1;
        int r = n;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int result = guess(mid);

            if (result == 0) {
                return mid;
            } else if (result == -1) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter picked number: ");
        int picked = sc.nextInt();

        guess sol = new guess(picked);

        int ans = sol.guessNumber(n);
        System.out.println("Guessed Number: " + ans);

        sc.close();
    }
}