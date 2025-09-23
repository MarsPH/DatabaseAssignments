class Main {

    public static void main(String[] args) {
        // Bird extends Animal implements IFlightEnabled, ITrackable
        goBird();
        // Satellite implements IOrbitEarth which extends IFlightEnabled
        goSatellite();
        // gathering all entities implementing the ITrackable interface
        goTrackables();

        goUFO();

        goDolphin();

        goVehicles();
    }

    private static void goNext() {
        System.out.println("\n\n-------------\n\n");
    }

    private static void goTrackables() {
        // gathering all entities implementing the ITrackable interface
        Itrackable[] trackables = { new Bird(), new Truck(), new Jet(), new Drone(), new Glider(),new Missile() {
        } };
        for (Itrackable trackable : trackables) {
            trackable.Track();
        }
        goNext();
    }

    private static void goSatellite() {
        // Satellite implements IOrbitEarth which extends IFlightEnabled
        Satellite satellite = new Satellite();
        satellite.AchieveOrbit();
        satellite.TakeOff();
        satellite.Fly();
        satellite.Land();

        IOrbitEarth orbitEarth = satellite;
        // orbitEarth and satellite point to the same object
        System.out.println(satellite == orbitEarth);

        orbitEarth.AchieveOrbit();
        // downcasting gives access back to Satellite
        ((Satellite) orbitEarth).TakeOff();
        goNext();
    }

    private static void goBird() {
        // Bird extends Animal implements IFlightEnabled, ITrackable
        Bird bird = new Bird();
        Animal animal = bird;
        // downcasting animal
        ((Bird) animal).Track();

        IFlightEnabled flier = bird; // flier has access to the 3 methods of IFlightEnabled

        Itrackable tracked = bird;
        tracked.Track(); // only access to track() method from ITrackable

        goNext();
    }

    private static void goDolphin(){
        Dolphin dolphin = new Dolphin();
        Animal animal = dolphin;
        dolphin.SetDestination("Ocean");
        goNext();
    }

    private static void  goVehicles(){
        System.out.println("\n\nn----------------");

        Truck truck = new Truck();
        truck.Track();

        SelfDrivingCar slfcar=new SelfDrivingCar();
        slfcar.SetDestination("Hosiptal");
        slfcar.EngageAutopilot();

        AutonomousBoat boat =  new AutonomousBoat();
        boat.EngageAutopilot();
        goNext();
    }
    private static void goUFO(){
  SpaceProbe probe = new SpaceProbe();
  probe.AchieveOrbit();
  probe.TakeOff();
  probe.Fly();
  probe.Land();


        AlienShip alien = new AlienShip();
        alien.AchieveOrbit();
       alien.TakeOff();
       alien.Fly();
       alien.Land();
       goNext();

    }
}
