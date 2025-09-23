public class CommuncationSatellite extends Satellite implements ICommunicable {
    @Override
    public void TransmitData() {
        System.out.println(this.getClass().getSimpleName() + "TransmitData");
    }
}
