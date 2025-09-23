class Satellite implements IOrbitEarth {



    @Override
    public void TakeOff() {
        System.out.println("satellite takes off.");
    }

    @Override
    public void Land() {
        System.out.println("satellite lands.");
    }

    @Override
    public void Fly() {
        System.out.println("satellite flies.");
    }

    @Override
    public void AchieveOrbit() {

    }

}
