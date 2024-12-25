public class Vintic extends Essence implements RollOut, Take, Comeback, PutOn{
    private String name;
    private Integer age;

    public Vintic(String name, Integer age) {
        super(name);
        this.age = age;
    }

    @Override
    public void RollOut(String n, String a, Tools tool) {
        System.out.println(n + " выкатил из " + a + tool);
    }

    @Override
    public void Take(String n, String a){
        System.out.println( n + " взял с собой " + a);
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

        Vintic other = (Vintic) obj;

        return age.equals(other.age);
    }

    @Override
    public String toString() {
        return "Имя" + getName();
    }

    @Override
    public void Comeback(String n, String a) {
        System.out.println(n + " вернулся в " + a);
    }

    @Override
    public void PutOn(String n, Tools tool) {

    }

    @Override
    public void PutOm(String n, Tools tool, String a) {
        System.out.println(n + " надел скафандр на " + a);
    }
}