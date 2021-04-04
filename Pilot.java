
public class Pilot extends Thread{
  private double maxTimeToStop = 1000;
  private double minTimeToStop = 0;
  public double timeInRace = 0;
  @Override
  public void run() {
    super.run();
    for (int x = 0; x < 65; x++) {
      try {
        int timeInLapInMilliseconds = (int) Math.floor(Math.random()*(maxTimeToStop-minTimeToStop+1)+minTimeToStop);
        Thread.sleep(timeInLapInMilliseconds);
        timeInRace += getTimeLapInSeconds(timeInLapInMilliseconds);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println(this.getName() + " has finished");
  }
  private double getTimeLapInSeconds(int timeInLapInMilliseconds) {
    return (double) timeInLapInMilliseconds/1000;
  }
}
