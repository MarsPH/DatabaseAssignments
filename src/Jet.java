public class Jet implements IFlightEnabled ,Itrackable{
    @Override
    public void TakeOff() {
        System.out.println(this.getClass().getSimpleName()+" is taking off");
    }

    @Override
    public void Land() {
        System.out.println(this.getClass().getSimpleName()+" is Landing");

    }

    @Override
    public void Fly() {
        System.out.println(this.getClass().getSimpleName()+" is Flying off");
    }

    @Override
    public void Track() {
        System.out.println(this.getClass().getSimpleName()+" 's coordinates recorded");
    }
}
