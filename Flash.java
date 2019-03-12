public class Flash {
    public static void main(String[] args) {
        //System.out.println((int)(Math.round(Math.random())));
        int[] test1 = new int[] {1, 4, 534, 1235, 6666, 74365, 222, -504, 607, -1, 4};
        System.out.println(Quick.quickselect(test1, 0));
        for (int i = 0; i < test1.length; i++) {
            System.out.print(test1[i] + " ");
        }
        int[] test2 = new int[10000];
        for (int i = 0; i < 10000; i++) {
            test2[i] = (int)(Math.random() * 2);
        }
        //System.out.println((int)(Math.random() * 2));
        System.out.println(Quick.quickselect(test2, 5000));
    }
}