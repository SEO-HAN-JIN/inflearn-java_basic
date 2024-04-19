package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);
        changePrimitive(a);
        System.out.println("메서드 호출 후: b = " + a);
    }

    /*
        메서드를 호출할 때 매개변수 x에 변수 a의 값을 전달한다. 이 코드는 다음과 같이 해석할 수 있다.
        int x = a;

        자바에서 변수에 값을 대입하는 것은 항상 값을 복사해서 대입한다. 따라서 변수 a,x 각각 숫자 10을 가지고 있다.
        참고로 메서드가 종료되면 매개변수 x는 제거된다.
     */
    static void changePrimitive(int x) {
        x = 20;
    }
}
