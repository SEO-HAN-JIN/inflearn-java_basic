package extends1.super2;

public class ClassC extends ClassB{

    public ClassC() {
        super(10, 20); // 부모가 기본생성자가 없으므로 직접 선언해주어야 한다.
        System.out.println("ClassC 생성자");
    }
}
