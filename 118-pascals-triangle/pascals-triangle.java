class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans=new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer>ans1=new ArrayList<>();
            for(int j=0;j<=i;j++){
                ans1.add(findpascal(i,j));
            }
            ans.add(ans1);
        }
        return ans;
    }
    public static int findpascal(int r,int c){
        int res=1;
        for(int i=0;i<c;i++){
            res=res*(r-i);
            res=res/(i+1);
        }
        return res;
    }
}