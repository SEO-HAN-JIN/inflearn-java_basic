package class1;

/*
    클래스는 설계도이고, 이 설계도를 기반으로 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라 한다. (둘다 같은 의미)
    여기서는 학생(Student) 클래스를 기반으로 학생1(student1), 학생2(student2) 객체 또는 인스턴스를 만들었다.
 */
public class ClassStart3 {

    /*
        int는 정수를, String은 문자를 담을 수 있듯이 Student는 Student 타입의 객체(인스턴스)를 받을 수 있다.
     */
    public static void main(String[] args) {
        Student student1 ;          // 변수 선언
        /*
            new Student()는 Student 클래스 정보를 기반으로 새로운 객체를 생성하라는 뜻이다.
            이렇게 하면 메모리에 실제 Student 객체(인스턴스)를 생성한다.
            Student 클래스는 String name, int age, int grade 멤버 변수를 가지고 있다. 이 변수를 사용하는데 필요한 메모리 공간도 함께 확보한다.
         */
        /*
            참조값 보관
            객체를 생성하면 자바는 메모리 어딘가에 있는 이 객체에 접근할 수 있는 참조값(주소) ( ex. x001)을 반환한다.
            new 키워드를 통해 객체가 생성되고 나면 참조값을 반환한다. 앞서 선언한 변수인 Student student1에 생성된 객체의 참조값(x001)을 보관한다.
            따라서 이 변수를 통해서 객체를 접근(참조) 할 수 있다.
         */
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("이름: " + student1.name + "나이: " + student1.age + " 등급 : " + student1.grade);
        System.out.println("이름: " + student2.name + "나이: " + student2.age + " 등급 : " + student2.grade);
    }
}
