class Bird extends Animal implements IFlightEnabled, Itrackable {

    @Override
    public void Move() {
        System.out.println("Flaps wings");
    }

    @Override
    public void TakeOff() {
        System.out.println(getClass().getSimpleName() + " is taking off");
    }

    @Override
    public void Land() {
        System.out.println(getClass().getSimpleName() + " is landing");
    }

    @Override
    public void Fly() {
        System.out.println(getClass().getSimpleName() + " is flying");
    }

    @Override
    public void Track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates recorded");
    }
}
