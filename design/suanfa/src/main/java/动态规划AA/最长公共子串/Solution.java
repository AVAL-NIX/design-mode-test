package 动态规划AA.最长公共子串;


/**
 * https://mp.weixin.qq.com/s/ZhPEchewfc03xWv9VP3msg
 */
public class Solution {
    /**
     * longest common substring
     * @param str1 string字符串 the string
     * @param str2 string字符串 the string
     * @return string字符串
     */
    public String LCS (String str1, String str2) {
        meno = new int[str1.length()][str2.length()];
        return ""+dp(str1, 0, str2, 0);
    }

    int[][] meno;

    public int dp(String s1, int i, String s2, int j) {
        //base case
        if (s1.length() == i || s2.length() == j) {
            return 0;
        }
        //状态转义
        if (meno[i][j] != 0) {
            return meno[i][j];
        }
        if (s1.charAt(i) == s2.charAt(j)) {
            meno[i][j] = 1 + dp(s1, i + 1, s2, j + 1);
        } else {
            meno[i][j] = Math.max(dp(s1, i + 1, s2, j), dp(s1, i, s2, j + 1));
        }
        return meno[i][j];
    }
}
