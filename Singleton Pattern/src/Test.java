public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread() {
                public void run() {
                  //  System.out.println(EnumModel.getConnection());
                }
            }.start();
        }
    }
}
