public class functionaldemp {
    interface a{
        void show();
    }
    public static void main(String[] args) {
        a obj = ()-> System.out.println("showing");
        obj.show();
    }
}
