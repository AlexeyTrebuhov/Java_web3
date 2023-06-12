package lesson3.sample01;

public class Fixed extends BaseWorker {

    private int zarp;

    public Fixed(String name, String surname, int age, String color, boolean paymenttype, int zarp) {
        super(name,surname,age,color,paymenttype);
        this.zarp = mounthmoney;
    }

    @Override
    public int getRass() {
        return zarp;
    }
}
