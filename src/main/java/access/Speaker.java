package access;

public class Speaker {


    /*
        Speaker 객체를 사용하는 사용자는 Speaker 의 volume 필드와 메서드에 모두 접근할 수 있다.
        앞서 volumeUp()과 같은 메서드를 만들어서 음량이 100을 넘지 못하도록 기능을 개발했지만 소용없다. 왜냐하면 Speaker 를 사용하는 입장에서는
        volume 필드에 직접 접근해서 값을 설정할 수 있기 때문이다.
     */
//    int volume;

    /*
        private 접근자는 모든 외부 호출을 막는다. 따라서 private이 붙은 경우 해당 클래스 내부에서만 호출할 수 있다.
     */
    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음략입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("현재 음량 : " + volume);
    }
}
