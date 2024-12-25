public class Lunologist extends Essence implements Visit {
    private String name;
    private Integer age;

    public Lunologist(String name, Integer age) {
        super(name);
        this.age = age;
    }

    @Override
    public void Visit(String n, String a) {
        System.out.println(n + " гостил в " + a);
    }
}
