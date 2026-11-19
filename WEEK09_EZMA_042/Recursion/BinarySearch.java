class BinarySearch {
    public static int binarySearchRecursive(int[] arr, int target, int low, int high) {

    if (low > high) {
        return -1;
    }

    int mid = (low + high) / 2;

    if (arr[mid] == target) {
        return mid;
    }

    if (target < arr[mid]) {
        return binarySearchRecursive(arr, target, low, mid - 1);
    }

    return binarySearchRecursive(arr, target, mid + 1, high);
    }
    public static void main(String[] args) {
        BinarySearch r = new BinarySearch();
        int[] arr = {2,5,8,12,16,21,27,30,35};
        System.out.println("Number 30 is at index:" + r.binarySearchRecursive(arr, 30, 0, 8));
    }
}