public abstract class TableLamp extends  Lamp{
    @Override
    public void lightOff() {
        System.out.println("Light OFF");
    }

    @Override
    public void lightOn() {
        System.out.println("Light ON");
    }

    public void lightState(boolean state) {
        System.out.println("Light state now: " + state);
    }
}
