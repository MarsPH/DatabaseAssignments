public class SpaceProbe extends UFO {


    @Override
    public void AchieveOrbit() {
        System.out.println(this.getClass().getSimpleName() + "AchieveOrbit");
    }

    @Override
    public void TakeOff() {
        System.out.println(this.getClass().getSimpleName() + "TakeOff");
    }

    @Override
    public void Land() {
        System.out.println(this.getClass().getSimpleName() + "Landing");
    }

    @Override
    public void Fly() {
        System.out.println(this.getClass().getSimpleName() + "Flying");
    }

    @Override
    void MakeSpaceNoises() {

    }
}
