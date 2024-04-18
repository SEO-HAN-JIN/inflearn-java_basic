package class1;

public class ClassStart2 {

    /*
        배열 사용
        - 한계 : 한 학생의 데이터를 관리하기 위해 3개 배열의 인덱스 순서를 항상 정확하게 맞추어야 한다.
                예를 들어서 학생 2의 데이터를 제거하려면 각각의 배열마다 학생2의 요소를 정확하게 찾아서 제거해주어야 한다.
     */
    public static void main(String[] args) {
        String[] studentNames = {"student1", "sutdent2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("student: " + studentNames[i] + " age:" + studentAges[i] + " grade:" + studentGrades[i]);
        }
    }
}
