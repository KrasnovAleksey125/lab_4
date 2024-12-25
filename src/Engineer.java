public class Engineer extends Essence implements Go, Open, Fix{
    private String name;
    private Integer age;

    public Engineer(String name, Integer age) {
        super(name);
        this.age = age;
    }

    @Override
    public void Go(String n, String a) {
        System.out.println(n + " залез в " + a);
    }

    @Override
    public void Open(String n, Tools tool) {
        System.out.println(n + " открыл " + tool);
    }

    @Override
    public void Fix(String n, String a) {
        System.out.println(n + " починил " + a);
    }
}
