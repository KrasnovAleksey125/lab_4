public class Professor extends Essence implements Sleep, Calculate, Finish, GetUp, Go, See{
    private String name;
    private Integer age;

    public Professor(String name, Integer age) {
        super(name);
        this.age = age;
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

        Professor other = (Professor) obj;

        return age.equals(other.age);
    }

    @Override
    public String toString() {
        return "Имя" + getName();
    }

    @Override
    public void Calculate(String n, String a) {
        System.out.println(n + " был занят " + a);
    }

    @Override
    public void Sleep(String n, String a, String b) {
        System.out.println(n + " " + a + " в " + b);
    }

    @Override
    public void Finish(String n, String a) {
        System.out.println(n + " закончил " + a);
    }

    @Override
    public void GetUp(String n, Tools tool) {
        System.out.println(n + " упал с " + tool);
    }

    @Override
    public void Go(String n, String a) {
        System.out.println(n + " бросился к " + a);
    }

    @Override
    public void See(String n, String a) {
        System.out.println(n + " увидел " + a);
    }
}
