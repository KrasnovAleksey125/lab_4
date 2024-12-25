public class Shpuntic extends Essence implements RollOut, Teach, Comeback, Give {
    private String name;
    private Integer age;

    public Shpuntic(String name, Integer age) {
        super(name);
        this.age = age;
    }
    @Override
    public void RollOut(String n, String a, Tools tool) {
        System.out.println(n + " выкатил из " + a + tool);
    }

    @Override
    public void Comeback(String n, String a) {
        System.out.println(n + " вернулся в " + a);
    }

    @Override
    public void Teach(String n, String a, Tools tool) {
        System.out.println(n + " учил " + a + " управлять " + tool);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!super.equals(obj)) {
            return false;
        }

        Shpuntic other = (Shpuntic) obj;

        return age.equals(other.age);
    }

    @Override
    public String toString() {
        return "Имя" + getName();
    }

    @Override
    public void Give(String n) {
    }

    @Override
    public void Give(String n, Tools tool, String a) {
        System.out.println(n + " подарил " + tool + " " + a);
    }
}
