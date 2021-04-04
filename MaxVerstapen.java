public class MaxVerstapen extends Pilot{
  @Override
  public void run() {
    Thread.currentThread().setName(this.getClass().getName());
    super.run();
  }
}
