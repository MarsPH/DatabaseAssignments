public class ReconDrone extends Drone implements IAutopilot, ICameraEnabled, IMilitary, INavigable  {

    @Override
    public void EngageAutopilot() {
        System.out.println(this.getClass().getSimpleName() + "I am engaging autopilot");
    }

    @Override
    public void CaptureImage() {
System.out.println(this.getClass().getSimpleName() + "I am capturing image");
    }

    @Override
    public void TakeOff() {
System.out.println(this.getClass().getSimpleName() + "I am taking off");
    }

    @Override
    public void Land() {
System.out.println(this.getClass().getSimpleName() + "I am landing");
    }

    @Override
    public void Fly() {
System.out.println(this.getClass().getSimpleName() + "I am flying");
    }

    @Override
    public void DeployWeapon() {
    System.out.println(this.getClass().getSimpleName() + "I am deploying weopon");
    }

    @Override
    public void SetDestination(String destination) {
    System.out.println(this.getClass().getSimpleName() + "I set destination");
    }

    @Override
    public void ReadSensors() {
    System.out.println(this.getClass().getSimpleName() + "I am reading sensors");
    }

    @Override
    public void Track() {
    System.out.println(this.getClass().getSimpleName() + "I am tracking");
    }
}
