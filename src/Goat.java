public class Goat extends Essence implements Comeback{
    private String name;
    private Integer age;

    public Goat(String name, Integer age){
        super(name);
        this.age = age;
    }

    @Override
    public void Comeback(String n, String a) {
        System.out.println(n + " вернулся в " + a);
    }
}
