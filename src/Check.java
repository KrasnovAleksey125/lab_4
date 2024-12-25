public class Check implements Spend{
    private String name;
    private String personality;

    public Check(String name, String personality) {
        this.name = name;
        this.personality = personality;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void Spend(String n) {
        System.out.println(n + " заняла много времени");
    }
}
