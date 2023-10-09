import java.util.*;
public class maxElements {
    static int tree[];

    public static void init(int n) {
        tree = new int[4 * n];
    }

    public static void buildST(int i, int si, int sj, int arr[]) {
        if (si == sj) {
            tree[i] = arr[si];
            return;
        }
        int mid = (si + sj) / 2;
        buildST(2 * i + 1, si, mid, arr);
        buildST(2 * i + 2, mid + 1, sj, arr);
        tree[i] = Math.max(tree[2 * i + 1], tree[2 * i + 2]);
    }

    public static int getMaxUtil(int i, int si, int sj, int qi, int qj) {
        if (si > qj || sj < qi) {
            return Integer.MIN_VALUE;
        } else if (si >= qi && sj <= qj) {
            return tree[i];
        } else {
            int mid = (si + sj) / 2;
            int left = getMaxUtil(2 * i + 1, si, mid, qi, qj);
            int right = getMaxUtil(2 * i + 2, mid + 1, sj, qi, qj);
            return Math.max(left, right);
        }
    }

    public static int getMax(int arr[], int qi, int qj) {
        int n = arr.length;
        return getMaxUtil(0, 0, n - 1, qi, qj);
    }

    public static void updateUtil(int i, int si, int sj, int idx, int newVal) {
        if (idx < si || idx > sj) {
            return;
        }
        if (si == sj) {
            tree[i] = newVal;
            return;
        }
        int mid = (si + sj) / 2;
        updateUtil(2 * i + 1, si, mid, idx, newVal);
        updateUtil(2 * i + 2, mid + 1, sj, idx, newVal);
        tree[i] = Math.max(tree[2 * i + 1], tree[2 * i + 2]);
    }

    public static void update(int arr[], int idx, int newVal) {
        int n = arr.length;
        if (idx < 0 || idx >= n) {
            System.out.println("Invalid index for update.");
            return;
        }
        updateUtil(0, 0, n - 1, idx, newVal);
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        init(n);
        buildST(0, 0, n - 1, arr);
        System.out.println(getMax(arr, 2, 5));
    }
}
