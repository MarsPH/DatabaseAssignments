public class Missile implements ISensorEquipped, Itrackable, IEnergySource {

    String EnergyType = "Fuel";

    @Override
    public void ReadSensors() {
        System.out.println(this.getClass().getSimpleName() + "ReadSensors");
    }

    @Override
    public void Track() {
        System.out.println(this.getClass().getSimpleName() + "Tracking Sensors");
    }

    @Override
    public String GetEnergyType() {
        System.out.println(this.getClass().getSimpleName() + "GetEnergyType");
        return EnergyType;
    }
}
