package gambling;

public class GamblingSimulato {

    static final int STAKE = 100;
    static final int BET = 1;
    static final int DAYS = 20;

    public static void main(String[] args) {

        int totalMoney = 0;
        int winDays = 0;
        int loseDays = 0;

        int maxWin = Integer.MIN_VALUE;
        int maxLoss = Integer.MAX_VALUE;

        int luckyDay = 0;
        int unluckyDay = 0;

        for (int day = 1; day <= DAYS; day++) {

            int cash = playForDay();

            int dailyResult = cash - STAKE;

            totalMoney += dailyResult;

            if (dailyResult > 0)
                winDays++;
            else
                loseDays++;

            if (dailyResult > maxWin) {
                maxWin = dailyResult;
                luckyDay = day;
            }

            if (dailyResult < maxLoss) {
                maxLoss = dailyResult;
                unluckyDay = day;
            }

            System.out.println("Day " + day + " Result = $" + dailyResult);
        }

        System.out.println("\n----- Monthly Report -----");
        System.out.println("Total Profit/Loss = $" + totalMoney);
        System.out.println("Winning Days = " + winDays);
        System.out.println("Losing Days = " + loseDays);
        System.out.println("Luckiest Day = Day " + luckyDay + " Won $" + maxWin);
        System.out.println("Unluckiest Day = Day " + unluckyDay + " Lost $" + Math.abs(maxLoss));

        if (totalMoney > 0)
            System.out.println("Continue Gambling Next Month");
        else
            System.out.println("Stop Gambling");
    }

    public static int playForDay() {

        int cash = STAKE;

        while (cash > 50 && cash < 150) {

            int result = (int) (Math.random() * 2);

            if (result == 1)
                cash += BET;
            else
                cash -= BET;
        }

        return cash;
    }
}