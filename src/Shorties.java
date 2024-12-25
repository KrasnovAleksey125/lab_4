public class Shorties extends Essence implements Sleep, Go, See, PullOut, PutOn {
    private String name;
    private String personality;

    public Shorties(String name, String personality) {
        super(name);
        this.personality = personality;
    }

    @Override
    public void Sleep(String n, String a, String b) {
        System.out.println( n + " уже давно " + a + " в " + b);
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

        Shorties other = (Shorties) obj;

        return personality.equals(other.personality);
    }
    @Override
    public String toString() {
        return "Имя" + getName();
    }

    @Override
    public void Go(String n, String a) {
        System.out.println(n + " прибежали к " + a);
    }

    @Override
    public void See(String n, String a) {
        System.out.println(n + " увидели что " + a);
    }

    @Override
    public void PullOut(String n, String a, Tools tool) {
        System.out.println(n + " принялись " + a + " " + tool );
    }

    @Override
    public void PutOn(String n, Tools tool) {
        System.out.println(n + " стали надевать " + tool);
    }

    @Override
    public void PutOm(String n,Tools tool , String a) {

    }
}
