public class Bee extends Animal implements INavigable {

    @Override
    public void Move() {
        System.out.println(this.getClass().getSimpleName() + "Move");
    }

    @Override
    public void SetDestination(String destination) {
        System.out.println(this.getClass().getSimpleName() + "Destination set to: " + destination);
    }

    public void Fly() {
    }
}
