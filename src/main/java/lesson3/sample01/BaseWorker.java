package lesson3.sample01;

public abstract class BaseWorker {

    protected String name;
    protected String surname;
    protected int age;
    protected String color;
    protected boolean paymenttype;

    public BaseWorker(String name, String surname, int age, String color, boolean paymenttype) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.color = color;
        this.paymenttype = paymenttype;
        }


    int hoursmoney = 12;
    int mounthmoney = 2000;

    public abstract int getRass();

}

