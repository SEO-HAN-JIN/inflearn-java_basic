package oop1;

public class MusicPlayer {
    /*
        캡슐화
        이렇게 '속성과 기능'을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것을 캡슐화라 한다.

        객체 지향 프로그래밍 덕분에 음악 플레이어 객체를 사용하는 입장에서 진짜 음악 플레이어를 만들고 사용하는 것 처럼 친숙하게 느껴진다.
        그래서 코드가 더 읽기 쉬운 것은 물론이고, 속성과 기능이 한 곳에 있기 때문에 변경도 더 쉬워진다.
        예를 들어서 MusicPlayer 내부 코드가 변하는 경우에 다른 코드는 변경하지 않아도 된다. 또 음악 플레이어가 내부에서 출력하는 메시지를 변경할 때도
        MusicPlayer 내부만 변경하면 된다. 이 경우 MusicPlayer 를 사용하는 개발자는 코드를 전혀 변경하지 않아도 된다.
        물론 외부에서 호출하는 MusicPlayer의 메서드 이름을 변경한다면 MusicPlayer 를 사용하는 곳의 코드도 변경해야한다.

     */
    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이러를 종료합니다.");
    }

    void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        } else{
            System.out.println("음악 플레이어 OFF");
        }
    }
}
