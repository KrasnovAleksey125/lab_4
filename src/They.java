public class They extends Essence implements Arrive, Build{
    private String n;
    private Integer count;

    public They(String name, Integer count) {
        super(name);
        this.count = count;
    }

    @Override
    public void Arrive(String n, Tools tool1, Tools tool2) {
        System.out.println(n + " приехали познакомиться с устройстовм " + tool1 + " и " + tool2);
    }

    @Override
    public void Build(String n, Tools tool, String a) {
        System.out.println(n + " собирались посторить " + tool +
                " и совершить космический полет к " + a);
    }
}
