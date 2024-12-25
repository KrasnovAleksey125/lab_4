public class Neznaika extends Essence implements GetUp,Speak,Sing,Lie, Cry{
    private String name;
    private Integer age;

    public Neznaika(String name, Integer age) {
        super(name);
        this.age = age;
    }

    @Override
    public void GetUp(String n, Tools tool) {
        System.out.println(n + " вскочил с " + tool);
    }

    @Override
    public void Speak(String n, String a, String b) {
        System.out.println(n + " стал говрить " + a + " что напишет письмо " + b );
    }

    @Override
    public void Speak(String n, String a){
    }


    @Override
    public void Sing(String n, String a) {
        System.out.println(n + " повеселел и " + a );
    }

    @Override
    public void Lie(String n, Tools tool) {
        System.out.println(n + " упал на " + tool);
    }

    @Override
    public void Cry(String n) {
        System.out.println(n + " вспомнил про солнышко и заплакал");
    }
}
