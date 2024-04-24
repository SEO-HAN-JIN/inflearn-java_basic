package construct;

/*
    생성자 - 필요한 이유
    객체를 생성하는 시점에 어떤 작업을 하고 싶다면 생성자(Constuct)를 이용하면 된다.
 */
public class MemberInit {
    String name;
    int age;
    int grade;

    /*
        추가
        this : Member의 코드를 다시 보자.
        initMember(String name..)의 코드를 보면 메서드의 매개변수에 정의한 String name과 Member의 멤버 변수의 이름이 String name으로 똑같다.
        나머지 변수 이름도 name, age, grade 로 모두 같다.
        멤버 변수와 메서드의 매개변수의 이름이 같으면 둘을 어떻게 구분해야 할까?
            - 이 경우 멤버 변수보다 매개변수가 코드 블럭의 더 안쪽에 있기 때문에 매개변수가 우선순위를 가진다. 따라서 initMember(String name, ...) 메서드 안에서
                name이라고 적으면 매개변수에 접근하게 된다.
            - 멤버 변수에 접근하려면 앞에 this. 이라고 해주면 된다. 여기서 this 는 인스터스 자신의 참조값을 가리킨다.
            this.name = name; // 1. 오른쪽의 name은 매개변수에 접근
            this.name = "user"; // 2. name 매개변수의 값 사용
            x001.name = "user"; // 3. this.은 인스턴스 자신의 참조값을 뜻함, 따라서 인스턴스의 멤버 변수에 접근
        this 제거
        만약 이 예제에서 this를 제거하면 어떻게 될까?
        this.name = name
        다음과 같이 수정하면 name은 둘다 매개변수를 뜻하게 된다. 따라서 멤버변수의 값이 변경되지 않는다.
        name = name
        -- 정리 --
            - 매개변수의 이름과 멤버 변수의 이름이 같은 경우 this를 사용해서 둘을 명확하게 구분해야 한다.
            - this는 인스턴스 자신을 가리킨다.

        initMember(...)는 Member 에 초기값 설정 기능을 제공하는 메서드이다.
     */
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
