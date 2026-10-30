class NestedIf {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        if (a > b) {
            if (a > c) {
                System.out.println("A is Biggest");
            } else {
                System.out.println("C is Biggest");
            }
        } else {
            if (b > c) {
                System.out.println("B is Biggest");
            } else {
                System.out.println("C is Biggest");
            }
        }
    }
}
