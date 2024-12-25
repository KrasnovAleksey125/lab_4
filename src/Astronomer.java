public class Astronomer extends Essence implements Visit, Speak {
    private String name;
    private Integer age;

    public Astronomer(String name, Integer age) {
        super(name);
        this.age = age;
    }

    @Override
    public void Visit(String n, String a) {
        System.out.println(n + " гостил в " + a);
    }

    @Override
    public void Speak(String n, String a) {
        System.out.println(n + " сказал " + a + " что лунные ученые сохранят" +
                " \nКосмический городок в порядке и \nустроят здесь космодром с" +
                " площадкой для посадки прибывающих \nна их планету космических кораблей" +
                " и для запуска ракет на другие планеты");
    }

    @Override
    public void Speak(String n, String a, String b) {

    }
}
