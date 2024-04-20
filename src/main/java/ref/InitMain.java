package ref;

public class InitMain {
    public static void main(String[] args) {
        // new로 생성하는 것들은 java가 인스턴스를 만들면서 값들을 초기화 해준다.
        InitData data = new InitData();
        System.out.println("value1 = " + data.value1);
        System.out.println("value2 = " + data.value2);
    }
}
