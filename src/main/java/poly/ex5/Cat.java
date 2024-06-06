package poly.ex5;

import poly.ex2.Animal;

public class Cat implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("냐용");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
