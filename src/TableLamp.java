public class TableLamp extends Lamp{


    @Override
    public void turnOn() {
        System.out.println("Light ON");
    }

    @Override
    public void turnOf() {
        System.out.println("Light OFF");
    }

    public void lightState(boolean state) {
        System.out.println("Light state now: " + state);
    }
}
