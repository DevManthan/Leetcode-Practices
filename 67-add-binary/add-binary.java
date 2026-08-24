class Solution {
    public String addBinary(String a, String b) {
        int len1 = a.length() - 1;
        int len2 = b.length() - 1;
        int carry = 0, base = 2;
        StringBuilder res = new StringBuilder();
        while(len1 >= 0 || len2 >= 0 || carry != 0){
            int t1 = 0, t2 = 0, sum = 0;

            if(len1 >=0 ){
                t1 = a.charAt(len1--) - '0';
            }
            if(len2 >=0 ){
                t2 = b.charAt(len2--) - '0';
            }

            sum = t1 + t2 + carry;

            if(sum >= base){
                carry = 1;
                sum = sum - base;
            }
            else{
                carry = 0;
            }
            res.append(sum);
        }
    
    return (res.reverse()).toString();

    }
}