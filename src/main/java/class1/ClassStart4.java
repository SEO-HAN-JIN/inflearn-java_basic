package class1;

public class ClassStart4 {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        /*
            Student 변수를 2개 보관할 수 있는 사이즈 2의 배열을 만든다.
            Student 타입의 변수는 Student 인스턴스의 참조값을 보관한다. Student 배열의 각각의 항목도 Student 타입의 변수일 뿐이다. 따라서 Student 타입의 참조값을 보관한다.
            배열에는 아직 참조값을 대입하지 않았기 때문에 참조값이 없다는 의미의 null 값으로 초기화 된다.
         */
        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        /*
            (중요) 자바에서 대입은 항상 변수에 들어 있는 값을 복사한다.
            student1, student2 에는 참조값이 보관되어 있다. 따라서 이 참조값이 배열에 저장된다. 또는 student1, student2에 보관된 참조값을 읽고 복사해서 배열에 대입한다고 표현한다.

            !주의
            변수에는 인스턴스 자체가 들어있는 것이 아니다. 인스턴스 위치를 가리키는 참조값이 들어있을 뿐이다. 따라서 대입(=)시에 인스턴스가 복사되는 것이 아니라 참조값만 복사된다.
         */
        System.out.println("이름: " + students[0].name + "나이: " + students[0].age + " 등급 : " + students[0].grade);
        System.out.println("이름: " + students[1].name + "나이: " + students[1].age + " 등급 : " + students[1].grade);
    }
}
