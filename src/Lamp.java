public abstract class Lamp implements  Light {
    abstract public void turnOn();
    abstract public void turnOf();

    @Override
    public void lightOff() {
        System.out.println("Light Off");
    }

    @Override
    public void lightOn() {
        System.out.println("Light On");
    }
}
