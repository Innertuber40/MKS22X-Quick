public class Flash {
    public static void main(String[] args) {
        int[] test1 = new int[] {1, 4, 534, 1235, 6666, 74365, 222, -504, 607, -1, 4};
        System.out.println(Quick.quickselect(test1, 5));
        for (int i = 0; i < test1.length; i++) {
            System.out.print(test1[i] + " ");
        }
    }
}