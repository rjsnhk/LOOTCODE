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
        int ar[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ar[i][j]=-1;
            }
        }
int lc=0,rc=n-1; //leftCol,RightColumn
int tr=0,br=m-1; //topRow, ButtomRow
        while(head!=null){
            for(int col=lc;col<=rc;col++){
                if(head==null)break;
                ar[tr][col]=head.val;
                head=head.next;
            }
            tr++;
            for(int row=tr;row<=br;row++){
                if(head==null)break;
                ar[row][rc]=head.val;
                head=head.next;
            }
            rc--;

            for(int col=rc;col>=lc;col--){
                if(head==null)break;
                ar[br][col]=head.val;
                head=head.next;
            }
            br--;
            for(int row=br;row>=tr;row--){
                if(head==null)break;
                ar[row][lc]=head.val;
                head=head.next;
            }
            lc++;

        }
        return ar;
    }
}