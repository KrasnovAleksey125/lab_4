public class Spruts extends Intruders implements Up, Drop{
    private Integer age;

    public Spruts(String name, String personality, Integer age) {
        super(name, personality);
        this.age = age;
    }

    @Override
    public void Up(String n, String a) {
        System.out.println(n + " перелез через " + a);
    }

    @Override
    public void Drop(String n, Tools tool) {
        System.out.println(n + " уронил " + tool);
    }
}
