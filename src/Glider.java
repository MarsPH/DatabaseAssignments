public class Glider implements Itrackable,IFlightEnabled {

    @Override
    public void Track() {
        System.out.println(this.getClass().getSimpleName() + "Track");
    }

    @Override
    public void TakeOff() {

    }

    @Override
    public void Land() {

    }

    @Override
    public void Fly() {

    }
}
