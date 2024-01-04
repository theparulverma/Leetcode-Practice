import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        combination(n, k, ll, ans, 1);
        return ans;
    }

    public static void combination(int n, int tq, List<Integer> ll, List<List<Integer>> ans, int idx) {
        if (ll.size() == tq) {
            ans.add(new ArrayList<>(ll));
            return;
        }
        for (int i = idx; i <= n; i++) {
            ll.add(i);
            combination(n, tq, ll, ans, i + 1);
            ll.remove(ll.size() - 1);
        }
    }
}

