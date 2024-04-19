package ref;

/*
    기본형과 참조형의 메서드 호출
    자바에서 메서드의 매개변수(파라미터)는 항상 값에 의해 전달된다. 그러나 이 값이 실제 값이냐, 참조(메모리 주소)값이냐에 따라 동작이 달라진다.
        - 기본형 : 메서드로 기본형 데이터를 전달하면, 해당 값이 복사되어 전달된다. 이 경우, 메서드 내부에서 파라미터의 값을 변경해도, 호출자의 변수 값에는 영향이 없다.
        - 참조형 : 메서드로 참조형 데이터를 전달하면, 참조값이 복사되어 전달된다. 이 경우, 메서드 내부에서 파라미터로 전달된 객체의 멤버 변수를 변경하면, 호출자의 객체도 변경된다.
 */
public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
        changeReference(dataA);
        System.out.println("메서드 호출 후 : dataA.value = " + dataA.value);
    }

    /*
        메서드를 호출할 떄 매개변수 dataX에 변수 dataA의 값을 전달한다. 이 코드는 다음과 같이 해석할 수 있다.
        int dataX = dataA;

        자바에서 변수에 값을 대입하는 것은 항상 값을 복사해서 대입한다. 변수 dataA는 참조값 x001을 가지고 있으므로 참조값을 복사해서 전달했다.
        따라서 변수 dataA, dataX 둘다 같은 참조값인 x001을 가지게 된다.
        이제 dataX를 통해서도 x001에 있는 Data 인스턴스에 접근할 수 있다.

        메서드 안에서 dataX.value = 20으로 새로운 값을 대입한다.
        참조값을 통해 x001 인스턴스에 접근하고 그 안에 있는 value의 값을 20으로 변경했다.
        dataA, dataX 모두 같은 x001 인스턴스를 참조하기 떄문에 dataA.value 와 dataX.value 는 둘다 20이라는 값을 가진다.
     */
    static void changeReference(Data dataX) {
        dataX.value = 20;
    }
}
