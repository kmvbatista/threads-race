class Main {
  static Pilot pilot1 = new LouisHamilton();
  static Pilot pilot2 = new MaxVerstapen();
  public static void main(String[] args) throws InterruptedException {
    pilot1.start();
    pilot2.start();
    pilot1.join();
    pilot2.join();
    announceWinner();
    announceRacersTimes();
  }

  private static void announceRacersTimes() {
    String racersTimeAnnoucement = "%s's race time : %f seconds";
    System.out.println(String.format(racersTimeAnnoucement, pilot1.getName(), pilot1.timeInRace));
    System.out.println(String.format(racersTimeAnnoucement, pilot2.getName(), pilot2.timeInRace));
  }

  private static void announceWinner() {
    String winnerName =  pilot1.timeInRace < pilot2.timeInRace ?
                            pilot1.getName() : pilot2.getName();
    System.out.println(String.format("The winner is %s!", winnerName));
  }
}