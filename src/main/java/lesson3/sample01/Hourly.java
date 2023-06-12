package lesson3.sample01;

public class Hourly extends  BaseWorker {

    private int zarp;

    public Hourly(String name, String surname, int age, String color, boolean paymenttype, int zarp) {
        super(name,surname,age,color,paymenttype);
        this.zarp = (int) (20.8 * 8 * hoursmoney);
    }

    @Override
    public int getRass() {
        return zarp;
    }
}
