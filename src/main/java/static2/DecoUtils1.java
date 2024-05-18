package static2;

public class DecoUtils1 {

    /*
        deco() 메서드를 호출하기 위해서는 DecoUtil1의 인스턴스를 먼저 생성해야한다. 그런데 deco()라는 기능은 멤버 변수도 없고,
        단순히 기능만 제공할 뿐이다. 인스턴스가 필요한 이유는 멤버 변수(인스턴스 변수)등을 사용하는 목적이 큰데, 이 메서드는 사용하는 인스턴스 변수도 없고 단순히 기능만 제공한다.
     */
    public String deco(String str) {
        return "*" + str + "*";
    }
}
