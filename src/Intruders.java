public class Intruders extends Essence implements Sit, PullOut, Include, Dig, Show, Try {
    private String name;
    private String personality;

    public Intruders(String name, String personality) {
        super(name);
        this.personality = personality;
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

        Intruders other = (Intruders) obj;

        return personality.equals(other.personality);
    }

    @Override
    public String toString() {
        return "Имя" + getName();
    }

    @Override
    public void Dig(String n, Tools tool) {
        System.out.println( n + " принялись рыть землю с помощью " + tool);
    }

    @Override
    public void Include(String n, String a, Tools tool) {
        System.out.println(n + " включили" + a + tool);
    }

    @Override
    public void PullOut(String n, String a, Tools tool) {
        System.out.println(n + " вытащили из" + a + tool);
    }

    @Override
    public void Sit(String n, String a) {
         System.out.println(n + " присели у" + a);
    }

    @Override
    public void Show(String a, String n) {
        System.out.println(a + " показались " + n);
    }

    @Override
    public void Try(String n, Tools tool) {
        System.out.println(n + " попытались открыть " + tool + " ангара");
    }
}
