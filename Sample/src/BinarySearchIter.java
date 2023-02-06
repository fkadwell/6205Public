public class BinarySearchIter {
        public static int iterOf(int[] a, int key)
        {
            int lo = 0;
            int hi = a.length - 1;
            int cnt =0;
            while (lo <= hi) {
                System.out.println("lo = " + lo + " hi = " + hi);
                int mid = lo + (hi - lo) / 2;
                if (key < a[mid]) hi = mid - 1;
                else if (key > a[mid]) lo = mid + 1;
                cnt++;
            }
            return cnt;
        }
        public static void main(String[] args)
        {
            int[] inList = new int[] {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65};
            int i = iterOf(inList, 64);
            System.out.println("Total Iterations " + i);
        }
    }

