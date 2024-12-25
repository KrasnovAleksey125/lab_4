public class Seledochka extends Essence implements Go{
    private String name;
    private Integer age;

    public Seledochka(String name, Integer age) {
        super(name);
        this.age = age;
    }

    @Override
    public void Go(String n, String a) {
        System.out.println(n + " бросилась к " + a);
    }
}
