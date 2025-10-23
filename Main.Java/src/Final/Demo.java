package Final;
class Demo {
    final int value = 99;
    void methodd(){
        System.out.println(value);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.methodd();
    }
}
