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
    }
}
