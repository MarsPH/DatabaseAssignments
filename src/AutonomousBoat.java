public class AutonomousBoat implements IAutopilot {

    @Override
    public void EngageAutopilot() {
        System.out.println(this.getClass().getSimpleName() + "EngageAutopilot");
    }
}
