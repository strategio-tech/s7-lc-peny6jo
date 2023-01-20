package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * FIXME: WHAT DOES THIS METHOD DO?
     * Calculate the 10% to pay of a given amount what is not pay yet.
     * @param
     * amount :int - initial quantity landed.
     * @return
     * own_money: int - quantity of owned money them after 3 months.
     */
    static int getRemainingAmountIn3Months(int amount) {
        int own_money = amount;
        int i = 0;
        while(i<3) {
            own_money -= own_money * 0.10;
            i++;

        }
        return own_money;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
