package final1;

public class ConstructInit {

    final int value;

    public ConstructInit(int value) {
        /*
            final을 이 필드에 사용할 경우에는 생성자를 통해서 한번만 초기화를 할 수 있다.
         */
        this.value = value;
    }

}
