package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        // final 필드 - 생성자 초기화
        /*
            ConstructInit과 같이 생성자를 사용해서 final 필드를 초기화 하는 경우, 각 인스턴스마다 final 필드에 다른 값을 할당할 수 있다.
            물론 final을 사용했기 때문에 생성 이후에 이 값을 변경하는 것은 불가능하다.
         */
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        // final 필드 - 필드 초기화
        /*
            - FieldInit과 같이 final 필드를 필드에서 초기화 하는경우, 모든 인스턴스가 다음 오른쪽 그림과 같이 같은 값을 가진다.
            - 여기서 FieldInit 인스턴스의 모든 value 값은 10이 된다.
            - 왜냐하면 생성자 초기화오 다르게 필드 초기화는 필드의 코드에 해당 값이 미리 정해져있기 때문이다.
            - 모든 인스턴스가 같은 값을 사용하기 때문에 결과적으로 메모리를 낭비하게 된다.(물론 JVM에 따라서 내부 최적화를 시도할 수 있다.)
                또 메모리 낭비를 떠나서 같은 값이 계속 생성되는 것은 개발자가 보기에 명확한 중복이다. 이럴 때 사용하는 좋은 것이 바로 static 영역이다.
         */
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        // 상수
        /*
            static final
            - FieldInit.MY_VALUE 는 static 영역에 존재한다. 그리고 final 키워드를 사용해서 초기화 값이 변하지 않는다.
            - static 영역은 단 하나만 존재하는 영역이다. MY_VALUE 변수는 JVM 상에서 하나만 존재하므로 앞서 설명한 중복과 메모리 비효율 문제를 모두 해결할 수 있다.
            이런 이유로 필드에 final + 필드 초기화를 사용하는 경우 static을 붙여서 사용하는 것이 효과적이다.
         */
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
