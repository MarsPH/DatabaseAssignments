public class Missile implements ISensorEquipped, Itrackable, IEnergySource, IFlightEnabled {

    String EnergyType = "Fuel";

    @Override
    public void ReadSensors() {
        System.out.println(this.getClass().getSimpleName() + "ReadSensors");
    }

    @Override
    public void Track() {
        System.out.println(this.getClass().getSimpleName() + " Missile Tracking Sensors");
    }

    @Override
    public String GetEnergyType() {
        System.out.println(this.getClass().getSimpleName() + "GetEnergyType");
        return EnergyType;
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
