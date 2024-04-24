package construct;

/*
    this의 생략
    this는 생략할 수 있다. 이 경우 변수를 찾을 때 가까운 지역변수(매개변수도 지역변수다)를 먼저 찾고 없으면 그 다음으로 멤버 변수를 찾는다.
    멤버 변수도 없으면 오류가 발생한다.

    굳이 this를 사용해야할까?
    this.nameField를 보면 this를 생략할 수 있지만, 생략하지 않고 사용해도 된다.
    이렇게 this를 사용하면 이 코드가 멤버 변수를 사용한다는 것을 눈으로 쉽게 확인할 수 있다. 그래서 과거에 이런 스타일을 많이 사용하기도 했다.
    쉽게 이야기해서 this를 강제로 사용해서, 지역 변수(매개변수)와 멤버 변수를 눈에 보이도록 구분하는 것이다.
    하지만 최근에 IDE가 발전하면서 IDE가 멤버 변수와 지역 변수를 색상으로 구분해준다.
    이런 점 때문에 this는 앞서 설명한 것 처럼 이름이 중복된 것 처럼, 꼭 필요한 경우에만 사용해도 충분하다 생각한다.
 */
public class MemberThis {
    String nameField;

    /*
        예를 들어서 nameField는 앞에 this가 없어도 멤버 변수에 접근한다.
            - nameField는 먼저 지역변수(매개변수)에서 같은 이름이 있는지 찾는다. 이 경우 없으므로 멤버 변수에서 찾는다.
            - nameParameter는 먼저 지역변수(매개변수)에서 같은 이름이 있는지 찾는다. 이 경우 매개변수가 있으므로 매개변수를 사용한다.
     */
    void initMember(String nameParameter) {
        nameField = nameParameter;
    }
}
