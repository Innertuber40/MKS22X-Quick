public class Quick {
	public static int quickselect(int[] values, int k) {
		int start = 0;
		int end = values.length - 1;
		while (true) {
			int parted = partition(values, start, end);
			//System.out.println(parted);
			if (parted < k) {
				start = parted + 1;
			} else if (parted > k) {
				end = parted - 1;
			} else {
				return values[k];
			}
			/*for (int i = 0; i < values.length; i++) {
				System.out.print(values[i] + " ");
			}
			System.out.println(start + ", " + end);*/
		}
	}

	public static void quicksort(int[] values) {
	        quicky(values, 0, values.length - 1);
	}
	private static void quicky(int[] values, int low, int high) {
		if (high - low <= 10) {
			for (int i = low + 1; i < high; i++) {
				int toInsert = values[i];
				int j = i;
				while (j > 0 && values[j - 1] > toInsert) {
					values[j] = values[j - 1];
					j--;
				}
				values[j] = toInsert;
			}
			return;
		}
		int part = partition(values, low, high);
		quicky(values, low, part);
		quicky(values, part + 1, high);
	}


	private static int partition(int[] values, int low, int high) {
		int randPos = (int)(Math.random() * (high - low + 1) + low);
		//System.out.println(randPos);
		int pivot = values[randPos];
		//System.out.println(pivot);
		int start = low + 1;
		int end = high;
		if (low == high) {
			return low;
		}
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
				//System.out.println(end);
			}
		}
		if (values[end] >= pivot) {
			values[low] = values[end - 1];
			values[end - 1] = pivot;
			//System.out.println(end - 1);
			return end - 1;
		} else /*if (values[end] < pivot) */{
			values[low] = values[end];
			values[end] = pivot;
			//System.out.println(end);
			return end;
		} /*else {
			//System.out.println((int)(Math.round(Math.random())));
			return end - (int)(Math.round(Math.random()));
		}*/
	}
}
