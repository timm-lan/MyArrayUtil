package Utils;

import java.util.Arrays;

public class MyArrayUtil {
    public static int[][] parse2DIntArray(String str) {
        //-1 because length - 1 is the last index
        int m, n = 0, l = str.length()-1;
        String[] subArrays = str.substring(2, l-1).split("\\]\\s*,\\s*\\[");
        m = subArrays.length;
        int subl = subArrays[0].length()-1;
        String[] aSubArray = subArrays[0].split("\\s*,\\s*");
        n = aSubArray.length;
        int[][] ret = new int[m][n];
        for (int i = 0; i < subArrays.length; i++) {
            String[] subArray = subArrays[i].split(",\\s*");
            for (int j = 0; j < n; j++) {
                ret[i][j] = Integer.parseInt(subArray[j]);
            }
        }
        return ret;
    }
    public static String[] parse1DStringArray(String str) {
        String[] array = str.substring(1, str.length()-1).split(",");
        return array;
    }

    public static void main(String[] args) {
        // Example
        int[][] ret = parse2DIntArray("[[1,0],[1,2],[0,1]]");
        for (int idx = 0; idx < ret.length; idx++) {
            System.out.println(Arrays.toString(ret[idx]));
        }

        System.out.println(Arrays.toString(parse1DStringArray("[\"01:01\",\"02:01\",\"03:00\",\"03:01\"]")));
    }
}

