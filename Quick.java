public class Quick {
	public static int quickselect(int[] values, int k) {
		int start = 0;
		int end = values.length - 1;
		while (true) {
			if (start == end) {
				return values[start];
			}
			int[] parted = partition(values, start, end);
			//System.out.println(parted[0]);
			//System.out.println(parted[1]);
			if (parted[0] <= k  && k <= parted[1]) {
				return values[k];
			} else if (k < parted[0]) {
				end = parted[0] - 1;
			} else {
				start = parted[1];
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
			for (int i = low + 1; i < high + 1; i++) {
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
		int[] part = partition(values, low, high);
		quicky(values, low, part[0] - 1);
		quicky(values, part[1], high);
	}


	private static int[] partition(int[] values, int low, int high) {
		int randPos = (int)(Math.random() * (high - low + 1) + low);
		//System.out.println(randPos);
		int pivot = values[randPos];
		//System.out.println(pivot);
		int start = low + 1;
		int end = high;
		int less = start;
		values[randPos] = values[low];
		values[low] = pivot;
		while (start != end) {
			int current = values[start];
			if (current < pivot) {
				values[start] = values[less];
				values[less] = current;
				less++;
				start++;
			} else if (current == pivot) {
				start++;
			} else {
				values[start] = values[end];
				values[end] = current;
				end--;
				//System.out.println(end);
			}
		}
		if (values[start] > pivot) {
			values[low] = values[less - 1];
			values[less - 1] = pivot;
		} else {
			values[low] = values[start];
			values[start] = pivot;
		}
		/*for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
		}
		System.out.println();*/
		int[] returns = new int[] {
			less,
			end
		};
		return returns;
	}
}
