package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    /*
        생성자
        생성자는 메서드와 비슷하지만 다음과 같은 차이가 있다.
            - 생성자의 이름은 클래스 이름과 같아야 한다. 따라서 첫 글자도 대문자로 시작한다.
            - 생성자는 반환 타입이 없다. 비워두어야 한다.
            - 나머지는 메서드와 같다.

        장점
            - 중복 호출 제거
                생성자가 없던 시절에는 생성 직후에 어떤 작업을 수행하기 위해 다음과 같이 메서드를 직접 한번 더 호출해야 한다.
                생성자 덕분에 객체를 생성하면서 동시에 생성 직후에 필요한 작업을 한번에 처리할 수 있게 되었다.
                // 생성자 등장 전
                MemberInit member = new MemberInit();
                member.initMember("user1", 15, 90);
                // 생성자 등장 후
                MemberConstruct memeber = new MemberConstruct("user1", 15, 90);
            - 제약 (생성자 호출 필수)
                위에서 생성자 등장 전 코드를 보자. 이 경우 initMember(...)를 실수로 호출하지 않으면 어떻게 될까?
                이 메서드를 실수로 호출하지 않아도 프로그램은 작동한다. 하지만 회원의 이름과 나이, 성적 데이터가 없는 상태로 프로그램이 동작하게 된다.
                만약에 이 값들을 필수 반드시 입력해야 한다면, 시스템에 큰 문제가 발생할 수 있다. 결국 아무 정보가 없는 유령 회원이 시스템 내부에 등장하게 된다.

        진짜 장점
            객체를 생성할 때 직접 정의한 생성자가 있다면 직접 정의한 생성자를 반드시 호출 해야 한다는 점이다.
            참고로 생성자를 메서드 오버로딩처럼 여러개 정의할 수 있는데, 이 경우에는 하나만 호출하면 된다.
     */
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ", age=" + age + ", grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    /*
        생성자 오버로딩
     */
    MemberConstruct(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.grade= 50;
        /*
            this() 라는 기능을 사용하면 생성자 내부에서 자신의 생성자를 호출할 수 있다.
            참고로 this는 인스턴스 자신을 참조값을 가리킨다. 그래서 자신의 생성자를 호출한다고 생각하면 된다.

            규칙
                this()는 생성자 코드의 첫줄에만 작성할 수 있다.
                ex) System.out.println("go");
                    this(name, age, 50);
                 => this() 가 생성자 코드의 첫줄에 사용되지 않는다.
         */
        this(name, age, 50);
    }
}
