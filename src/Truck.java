public class Truck implements Itrackable {

    @Override
    public void Track() {
        System.out.println(this.getClass().getSimpleName()+" 's coordinated recorded");
    }
}
