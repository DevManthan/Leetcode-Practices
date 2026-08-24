
class Solution {
    public String addBinary(String a, String b) {
     int i=a.length()-1;
     int j=b.length()-1;
     int c=0;
     char[] ans=new char[Math.max(a.length(),b.length())+1];
     int k=ans.length-1;
     while(i>=0||j>=0||c!=0){
        int s=c;
        if(i>=0){
            s+=a.charAt(i)-'0';
            i--;
        }
        if(j>=0){
            s+=b.charAt(j)-'0';
            j--;
        }
        ans[k]=(char)((s%2)+'0');
        c=s/2;
        k--;
     }
     if(k==-1)
     return String.valueOf(ans);
     return String.valueOf(ans,k+1,ans.length-k-1);
    }
}