public class FlightStageTracker implements Itrackable {
    private FlightStage Stage;

    FlightStageTracker(FlightStage stage){
        this.Stage =stage;
    }

    public void Track()
    {
        if(Stage!= FlightStage.GROUNDED){
            System.out.println("Monitoring "+Stage);
        }
    }}
