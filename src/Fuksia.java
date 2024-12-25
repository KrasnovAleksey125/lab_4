public class Fuksia extends Essence implements Go, Push {
    private String name;
    private Integer age;

    public Fuksia(String name, Integer age) {
        super(name);
        this.age = age;
    }

    @Override
    public void Go(String n, String a) {
        System.out.println(n + " бросилась к " + a);
    }

    @Override
    public void Push(String n, String a) {
        System.out.println(n + " принялась нажимать на " + a);
    }
}
