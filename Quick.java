public class Quick {
	public static int quickselect(int[] values, int k) {
		return partition(values);
	}

	private static int partition(int[] values) {
		int randPos = (int)(Math.random() * values.length);
		System.out.println(randPos);
		int pivot = values[randPos];
		System.out.println(pivot);
		int start = 1;
		int end = values.length - 1;
		values[randPos] = values[0];
		values[0] = pivot;
		while (start != end) {
			int current = values[start];
			if (current <= pivot) {
				start++;
			} else {
				values[start] = values[end];
				values[end] = current;
				end--;
			}
		}
		if (values[end] > pivot) {
			values[0] = values[end - 1];
			values[end - 1] = pivot;
			return end - 1;
		} else {
			values[0] = values[end];
			values[end] = pivot;
			return end;
		}
	}
}
