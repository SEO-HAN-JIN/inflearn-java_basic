package oop1;

public class ValueObjectMain {
    /*
        인스턴스의 메서드 호출
        인스턴스의 메서드를 호출하는 방법은 멤버 변수를 사용하는 방법과 동일하다. .(dot)을 찍어서 객체 접근한 다음에 원하는 메서드를 호출하면 된다.

        valueData.add();    // 1
        x002.add();         // 2 : x002 ValueObject 인스턴스에 있는 add() 메서드를 호출한다.
        add() 메서드를 호출하면 메서드 내부에서 value++ 을 호출하게 된다. 이때 value 에 접근해야 하는데, 기본으로 본인 인스턴스에 있는 멤버 변수에 접근한다.
        본인 인스턴스가 x002 참조값을 사용하므로 자기 자신인 x002.value 에 접근하게 된다.

        정리
            - 클래스는 속성(데이터, 멤버 변수)과 기능(메서드)을 정의할 수 있다.
            - 객체는 자신의 메서드를 통해 자신의 멤버 변수에 접근할 수 있다.
            - 객체의 메서드 내부에서 접근하는 멤버 변수는 객체 자신의 멤버 변수이다.
     */
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        valueData.add();
        valueData.add();
        valueData.add();
        System.out.println("최종 숫자=" + valueData.value);
    }

}
