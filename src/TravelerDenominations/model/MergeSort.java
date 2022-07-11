package TravelerDenominations.model;

public class MergeSort {

	public void merge(int[] array, int low, int mid, int high) {
		int leftArray[] = new int[mid - low + 1];
		int rightArray[] = new int[high - mid];
		for (int i = 0; i < leftArray.length; i++)
			leftArray[i] = array[low + i];
		for (int i = 0; i < rightArray.length; i++)
			rightArray[i] = array[mid + i + 1];
		int leftIndex = 0;
		int rightIndex = 0;
		for (int i = low; i < high + 1; i++) {
			if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
				if (leftArray[leftIndex] >= rightArray[rightIndex]) {
					array[i] = leftArray[leftIndex];
					leftIndex++;
				} else {
					array[i] = rightArray[rightIndex];
					rightIndex++;
				}
			} else if (leftIndex < leftArray.length) {
				array[i] = leftArray[leftIndex];
				leftIndex++;
			} else if (rightIndex < rightArray.length) {
				array[i] = rightArray[rightIndex];
				rightIndex++;
			}
		}
	}

	public void sort(int[] denominations, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			sort(denominations, left, mid);
			sort(denominations, mid + 1, right);
			merge(denominations, left, mid, right);
		}
	}
}