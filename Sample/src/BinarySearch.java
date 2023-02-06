public class BinarySearch
{
    //Blah
    //Blah Blah
    public static int indexOf(int[] a, int key)
    {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] inList = new int[] {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65};
        int i = indexOf(inList, 62);
        if (i > -1)
        {
            System.out.println("index = " + i + " Value = " + inList[i]);

        }
        else
        {
            System.out.println("Value not found");
        }

    }
}
