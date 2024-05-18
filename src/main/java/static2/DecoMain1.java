package static2;

public class DecoMain1 {

    public static void main(String[] args) {
        String s = "hello java";
        DecoUtils1 decoUtils1 = new DecoUtils1();
        String deco = decoUtils1.deco(s);

        System.out.println("before: " + s);
        System.out.println("after : " + deco);
    }
}
