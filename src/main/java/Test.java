public class Test {
    public static void main(String[] args) {
        method(1);
        method("Макс");
    }

    static void method(int number){
        System.out.println("number= "+number);
    }

    static void method(String str){
        System.out.println(str);
    }
}
