public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int a[] = new int[]{1,2,3,4,5};

        int length = a.length;
        int start = 0;
        int find_number = 3;

        int pos = BinarySearch(a, start, length-1, find_number);
        System.out.println(pos);
    }


    private static int BinarySearch(int a[], int start, int length, int find_number)
    {

        if(length == start)
        {
            if(a[length] == find_number)
                return length;
        }
        if(length > start) {
            int mid = start + (length - 1 ) / 2;

            if (a[mid] > find_number) {
                return BinarySearch(a, start, mid - 1, find_number);
            }
            else if (a[mid] < find_number) {
                return BinarySearch(a, mid + 1, length, find_number);
            }
            else
                return mid;
        }
        else
            return -1;

    }


}
