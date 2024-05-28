package extends1.ex1;

public class CarMain1 {

    /*
        상속은 객체 지향 프로그램ㅇ의 핵심 요소 중 하나로, 기존 클래스 필드와 메서드를 새로운 클래스에서 재사용하게 해준다.
        이름 그대로 기존 클래스의 속성과 기능을 그대로 물려받는 것이다. 상속을 사용하려면 extends 키워드를 사용하면 된다.
        그리고 extends 대상은 하나만 선택할 수 있다.

        용어정리
        - 부모 클래스(슈퍼 클래스) : 상속을 통해 자신의 필드와 메섣르르 다른 클래스에 제공하는 클래스
        - 자식 클래스(서브 클래스) : 부모 클래스로부터 필드와 메서드를 상속받는 클래스
     */
    public static void main(String[] args) {
        ElectricCar1 electricCar = new ElectricCar1();
        electricCar.move();
        electricCar.charge();

        GasCar1 gasCar = new GasCar1();
        gasCar.move();
        gasCar.fillUp();
    }
}
