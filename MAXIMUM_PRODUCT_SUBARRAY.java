public class MAXIMUM_PRODUCT_SUBARRAY {
    public static int maxProduct(int[] no) {
        int n = no.length;

        if (n == 0) {
            return 0;
        }

        int max = no[0];
        int max1 = no[0];
        int min=no[0];
        for (int i = 1; i < n; i++) {
            int temp = max;
            max = Math.max(no[i], Math.max(no[i] * max, no[i] * min));
            min = Math.min(no[i], Math.min(no[i] * temp, no[i] * min));
            max1 = Math.max(max1, max);
        }

        return max1;
    }

    public static void main(String[] args) {
        int[] arr = {6, -3, -10, 0, 2};
        int maxProduct = maxProduct(arr);
        System.out.println("The product of the maximum product subarray is: " + maxProduct);
    }    
}