public class ShipPackages {
    public static void main(String[] args) {
        int[] w = {10,50,100,100,50,100,100,100};
        int days = 5;
        int ans = shipWithinDays(w, days);
        System.out.println(ans);

    }

    static int shipWithinDays(int[] w, int days) {
        int start = maxWeight(w);
        int end = sumW(w);
        int res = 0;
        while (start<end) {
            int mid = start + (end-start)/2;

            if (isPossible(mid, w, days)) {
                end = mid-1;
                res = mid;
            }
            else {
                start = mid+1;
            }

        }
        return res;
    }

    static int maxWeight(int[] arr){
        int max = 0;
        for(int i=0; i<arr.length; i++) {
            max = (max>arr[i]) ? max : arr[i];
        }
        return max;
    }
    static int sumW(int[] arr) {
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;

    }
    static boolean isPossible(int mid, int[] arr, int days) {
        int count = 0;
        int sum = 0;
        int i = 0;
        while (i<arr.length) {
            if (arr[i] > mid) return false;
            sum = 0;
            while(sum <= mid && i<arr.length) {
                if (sum + arr[i] <= mid) {
                    sum += arr[i];
                    i++;
                }
                else {
                    break;
                }

            }
            count++;
            if (count > days) {
                return false;
            }
        }
        return true;

    }
}

