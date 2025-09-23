 class DragonFly implements IFlightEnabled {
    String Name ;
    String Type;

    DragonFly(String name, String type)
    {
        this.Name = name;
        this.Type = type;
    }
    @Override
     public void TakeOff()
     {
         System.out.println("DragonFly takes off.");
     }
     @Override
     public void Land()
     {
         System.out.println("DragonFly lands.");
     }

     @Override
     public void Fly()
     {
         System.out.println("DragonFly flies.");
     }
}
