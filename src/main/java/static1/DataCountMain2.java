package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count = " + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count=" + counter.count);
        /*
            이 코드는 Data2가 몇개 생성되었냐를 알고 싶어서 작성한 코드인데
            Data2 클래스 안에서 해결하고 싶은데 지금은 어쩔 수 없이 밖에서 만들어서 끌고온 경우임
         */
    }
}
