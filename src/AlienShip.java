public class AlienShip  extends UFO{

    @Override
    public void AchieveOrbit() {
        System.out.println(this.getClass().getSimpleName() + "I am achieving orbit");
    }

    @Override
    public void TakeOff() {
        System.out.println(this.getClass().getSimpleName() + "Taking off");
    }

    @Override
    public void Land() {
        System.out.println(this.getClass().getSimpleName() + "Landing");
    }

    @Override
    public void Fly() {
        System.out.println(this.getClass().getSimpleName() + "Flying off");
    }

    @Override
    void MakeSpaceNoises() {
        System.out.println(this.getClass().getSimpleName() + "Making Space Noises");
    }
}
