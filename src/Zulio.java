public class Zulio extends Intruders implements Transfer{
    private Integer age;

    public Zulio(String name, String personality, Integer age) {
        super(name, personality);
        this.age = age;
    }

    @Override
    public void Transfer(String n, String a, Tools tool) {
        System.out.println(n + " протянул " + a + " " + tool);
    }
}
