public class Neelovtsi extends Essence implements Go, Cry, Kiss{
    private String name;
    private Integer count;

    public Neelovtsi(String name, Integer count) {
        super(name);
        this.count = count;
    }


    @Override
    public void Go(String n, String a) {
        System.out.println(n + " пришли прощаться с " + a);
    }

    @Override
    public void Cry(String n) {
        System.out.println(n + " плакали");
    }

    @Override
    public void Kiss(String n, String a) {
        System.out.println(n + " целовали " + a);
    }
}
