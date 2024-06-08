package poly.ex6;

public class Bird extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("짹쪽");
    }

    @Override
    public void Fly() {
        System.out.println("새 날기");
    }
}
