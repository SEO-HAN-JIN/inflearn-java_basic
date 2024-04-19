package ref;

public class VarChange2 {
    /*
        변수의 대입은 변수에 들어있는 값을 복사해서 대입한다. 변수 dataA에는 참조값 x001이 들어있다.
        여기서는 변수 dataA에 들어있는 참조값 x001을 복사해서 변수 dataB에 대입한다.
        ** 참고로 변수 dataA가 가리키는 인스턴스를 복사하는 것이 아니다! 변수에 들어있는 참조값만 복사해서 전달한다.
        이제 dataA와 dataB에 들어있는 참조값은 같다. 따라서 둘다 같은 x001 Data인스턴스를 가진다.

        여기서 핵심은 Data dataB = dataA 라고 했을 떄 변수에 들어있는 값을 복사해서 사용한다는 점이다. 그런데 그 값이 참조값이다.
        따라서 dataA와 dataB는 같은 참조값을 가지게 되고, 두 변수는 같은 객체 인스턴스를 참조하게 된다.
     */
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA 참조값 = " + dataA);
        System.out.println("dataB 참조값 = " + dataB);
        System.out.println("dataA.value = " + dataA.value); // 10
        System.out.println("dataB.value = " + dataB.value); // 10

        // dataA변경
        dataA.value = 20;
        System.out.println("변경  dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value); // 20
        System.out.println("dataB.value = " + dataB.value); // 20

        // dataB변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value); // 30
        System.out.println("dataB.value = " + dataB.value); // 30
    }
}
