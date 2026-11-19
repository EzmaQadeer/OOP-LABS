class BinarySearch2 {
public static int binarySearch(int[] arr, int target) {

    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {

        int mid = (low + high) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }

    return -1;
}

    public static void main(String[] args) {
        BinarySearch2 r = new BinarySearch2();
        int[] arr = {2,5,8,12,16,21,27,30,35};
        System.out.println("Number 30 is at index:" + r.binarySearch(arr, 30));
    }
}