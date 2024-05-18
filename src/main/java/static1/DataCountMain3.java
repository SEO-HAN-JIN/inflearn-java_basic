package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        /*
            생성자에는 count++ 코드가 있다. count는 static 이 붙은 정적 변수다. 정적 변수는 인스턴스 영역이 아니라 메서드 영역에서 관리한다.
            따라서 이 경우 메서드 영역에 있는 count의 값이 하나 증가된다.
         */
        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count); // Data3.count : 클래스에 직접 접근하는 느낌이다.

        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count);

        // 추가
        // 인스턴스를 통한 접근 - 권장x (이유 : 코드를 읽을 때 마치 인스턴스 변수에 접근하는 것 처럼 오해할 수 있기 때문)
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);

        // 클래스를 통한 접근
        // 추천 ( 이유 : 정적 변수는 클래스에서 공용으로 관리하기 때문에 클래스를 통해서 접근하는 것이 더 명확하다. 따라서 정적 변수에 접근할 떄는 클래스를 통해 접근하자 )
        System.out.println(Data3.count);
    }
}
