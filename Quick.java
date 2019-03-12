public class Quick {
	public static int quickselect(int[] values, int k) {
		int start = 0;
		int end = values.length - 1;
		while (true) {
			int parted = partition(values, start, end);
			if (parted < k) {
				start = parted;
			}
			if (parted > k) {
				end = parted;
			}
			if (parted == k) {
				return values[k];
			}
		}
	}

	private static int partition(int[] values, int low, int high) {
		int randPos = (int)(Math.random() * (high - low) + low);
		//System.out.println(randPos);
		int pivot = values[randPos];
		//System.out.println(pivot);
		int start = low + 1;
		int end = high;
		values[randPos] = values[low];
		values[low] = pivot;
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
			values[low] = values[end - 1];
			values[end - 1] = pivot;
			return end - 1;
		} else {
			values[low] = values[end];
			values[end] = pivot;
			return end;
		}
	}
}
