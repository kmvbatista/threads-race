public class LouisHamilton extends Pilot{
  @Override
  public void run() {
    super.run();
    Thread.currentThread().setName(this.getClass().getName());
  }
}