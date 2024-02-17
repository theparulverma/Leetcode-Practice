import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> result = new ArrayList<>();//result list mein send karna hai toh kyuki function list return karega
        add(num, result, target, "", 0, 0, 0);//yeh khaaali string mein expression add karne ke liye
        return result;
    }

    public void add(String num, List<String> result, int target, String expression, int index, long currentSum, long lastNum) {
        if (index == num.length()) {//if starting of the index last tak phoach jayegaa means puri length complete aur uss current sum =6 ho jayega toh add kardo list mein
            if (currentSum == target) {
                result.add(expression);
            }
            return;
        }

        for (int i = index; i < num.length(); i++) {
            if (i > index && num.charAt(index) == '0') {//nums ek string hai toh check karne ke liye charat use kiya ki agar 0 hai toh skip karo aaise check karke
                // Skip numbers with leading zeros
                break;
            }

            long currentNum = Long.parseLong(num.substring(index, i + 1));

            if (index == 0) {
                add(num, result, target, expression + currentNum, i + 1, currentNum, currentNum);
            } else {
                add(num, result, target, expression + "+" + currentNum, i + 1, currentSum + currentNum, currentNum);
                add(num, result, target, expression + "-" + currentNum, i + 1, currentSum - currentNum, -currentNum);
                add(num, result, target, expression + "*" + currentNum, i + 1, currentSum - lastNum + lastNum * currentNum, lastNum * currentNum);
            }
        }
    }
}
