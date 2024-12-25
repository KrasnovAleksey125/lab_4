public class Astronauts extends Essence implements Decided, Close, GoOut, Go, Start{
    private String name;
    private Integer count;

    public Astronauts(String name, Integer count) {
        super(name);
        this.count = count;
    }

    public int getCount(){
        return this.count;
    }

    @Override
    public void Decided(String n, String a) {
        System.out.println(n + " решили вернуться на " + a);
    }

    @Override
    public void Close(String n) {
        System.out.println(n + " закрыли дверь на ключ");
    }

    @Override
    public void GoOut(String n) {
        System.out.println(n + " вышли из ангара");
    }

    @Override
    public void Go(String n, String a){
        System.out.println(n + " отправились в " + a);
    }

    @Override
    public void Start(String n, String a) {
        System.out.println(n + " стали готовиться к " + a);
    }
}

