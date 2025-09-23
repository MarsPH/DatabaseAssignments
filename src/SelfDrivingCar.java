public class SelfDrivingCar implements IAutopilot,INavigable {

    @Override
    public void EngageAutopilot() {
        System.out.println(this.getClass().getSimpleName() + "EngageAutopilot");
    }



    @Override
    public void SetDestination(String destination) {

    }
}
