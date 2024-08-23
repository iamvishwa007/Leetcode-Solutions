/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int ans[][]=new int[m][n];
        int top=0,bottom=m-1,left=0,right=n-1;
        ListNode temp=head;
       for(int i = 0; i < m; i++) 
        {
            ans[i] = new int[n];
            Arrays.fill(ans[i], -1);
        }
        while(temp!=null){
            for(int i=left;i<=right;i++){
                ans[top][i]=((temp !=null )?(temp.val):(-1));
                temp=((temp!=null )?(temp.next):(null));
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ans[i][right]=((temp !=null )?(temp.val):(-1));
                temp=((temp!=null )?(temp.next):(null));
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                ans[bottom][i]=((temp!=null )?(temp.val):(-1));
                temp=((temp!=null )?(temp.next):(null));
            }
            }
            bottom--;
            if(left<=right){
            for(int i=bottom;i>=top;i--){
                ans[i][left]=((temp!=null )?(temp.val):(-1));
                temp=((temp!=null )?(temp.next):(null));
            }
            }
            left++;
        }
        return ans;
    }
}