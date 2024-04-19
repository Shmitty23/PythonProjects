public class Chapter6ProgrammingChallenge15 {
    public static void main(String[] args) {
        Die compDie = new Die(6);
        Die userDie = new Die(6);
        int compWins = 0;
        int userWins = 0;

        for (int i = 0; i < 10; i++) {
            int compRoll = compDie.roll();
            int userRoll = userDie.roll();

            System.out.println("Round " + (i + 1) + ":");
            System.out.println("Computer rolls: " + compRoll);
            System.out.println("User rolls: " + userRoll);

            if (compRoll > userRoll) {
                compWins++;
                System.out.println("Computer wins");
            } else if (userRoll > compRoll) {
                userWins++;
            } else {
                System.out.println("Its a tie");
            }
        }
        System.out.println("Final Results:");
        System.out.println("Computer wins: " + compWins);
        System.out.println("User wins: " + userWins);

        if (compWins > userWins) {
            System.out.println("Computer is the grand winner!");
        } else if (userWins > compWins) {
            System.out.println("User is the grand winner!");
        } else {
            System.out.println("The game is a tie!");
        }
    }
}
