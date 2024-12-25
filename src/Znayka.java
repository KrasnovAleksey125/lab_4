public class Znayka extends Essence implements Sleep, Calculate, Give, Order, Finish, Off, Lie, GetUp, Wrap, GoOut, See, Go{
    private String name;
    private Integer age;

    public Znayka(String name, Integer age) {
        super(name);
        this.age = age;
    }


    @Override
    public void Calculate(String n, String a) {
        System.out.println(n + " был занят " + a );
    }

    @Override
    public void Sleep(String n, String a, String b) throws CustomException {
        if (age >= 18) {
            System.out.println(n + " " + a + " в " + b);
        } else {
            throw new CustomException("Знайка тоже спал, ему еще нет восемнадцати ");
        }
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

        Znayka other = (Znayka) obj;

        return age.equals(other.age);
    }

    @Override
    public String toString() {
        return "Имя Знайки: " + getName();
    }

    @Override
    public void Give(String n) {
        System.out.print(n + " решил подарить лунным ученым точные чертежи ракеты");
    }
    @Override
    public void Give(String n, Tools tool, String a) {
    }

    @Override
    public void Order(String a) {
        System.out.println( a + ", чтоб им отдали оставшиеся запасы лунита и антилунита");
    }

    @Override
    public void Finish(String n, String a) {
        System.out.println(n + " закончил " + a);
    }

    @Override
    public void Off(String n, String a) {
        System.out.println(n + " выкоючил " + a);
    }

    @Override
    public void Lie(String n, Tools tool) {
        System.out.println(n + " лег в " + tool);
    }

    @Override
    public void GetUp(String n, Tools tool) {
        System.out.println(n + " упал с " + tool);
    }

    @Override
    public void Wrap(String n, Tools tool) {
        System.out.println(n + " завернулся в " + tool);
    }

    @Override
    public void GoOut(String n) {
        System.out.println(n + " выбежал во двор");
    }

    @Override
    public void See(String n, String a) {
        System.out.println(n + " увидел " + a);
    }

    @Override
    public void Go(String n, String a) {
        System.out.println(n + " бросился к " + a);
    }
}
