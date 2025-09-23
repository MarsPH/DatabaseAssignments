public class Glider implements Itrackable {

    @Override
    public void Track() {
        System.out.println(this.getClass().getSimpleName() + "Track");
    }
}
