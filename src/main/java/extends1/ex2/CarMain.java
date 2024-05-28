package extends1.ex2;

public class CarMain {
    /*
        상속은 부모의 기능을 자식이 물려 받는 것이다. 따라서 자식이 부모의 기능을 물려 받아서 사용할 수 있다.
        반대로 부모 클래스는 자식 클래스에 접근할 수 없다. 자식 클래스는 부모 클래스의 기능을 물려 받기 때문에 접근할 수 있지만, 그 반대는 아니다.
        부모 코드를 보자! 자식에 대한 정보가 하나도 없다. 반면에 자식 코드는 extends Parent 를 통해서 부모를 알고 있다.

        단일 상속
        참고로 자바는 다중 상속을 지원하지 않는다. 따라서 extend 대상은 하나만 선택할 수 있다. 부모를 하나만 선택할 수 있따는 뜻이다.
     */
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
