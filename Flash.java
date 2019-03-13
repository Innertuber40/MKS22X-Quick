public class Flash {
    public static void main(String[] args) {
        //System.out.println((int)(Math.round(Math.random())));
        int[] test1 = new int[] {1, 4, 534, 1235, 6666, 74365, 222, -504, 607, -1, 4};
        System.out.println(Quick.quickselect(test1, 0));
        for (int i = 0; i < test1.length; i++) {
            System.out.print(test1[i] + " ");
        }
        int[] test2 = new int[100000];
        for (int i = 0; i < 100000; i++) {
            test2[i] = (int)(Math.random() * 5000000);
        }
        //System.out.println((int)(Math.random() * 2));
	int lastPivot = Quick.quickselect(test2, 50000);
        System.out.println(lastPivot);
	for (int i = 0; i < 50000; i++) {
		if (test2[i] > lastPivot) {
			System.out.print("false"+i);
		}
		//System.out.print(test2[i]);
	}
	for (int i = 50001; i < 100000; i++) {
		if (test2[i] < lastPivot) {
			System.out.print("false"+i);
		}
		//System.out.print(test2[i]);
	}
        int[] test3 = new int[10000];
        for (int i = 0; i < 10000; i++) {
            test3[i] = (int)(Math.random() * 500000000);
        }
	Quick.quicksort(test3);
    }
}
