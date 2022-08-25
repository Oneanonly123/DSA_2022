package Array;

// To find the majority element and it always exist

public class MajorityElement {
    public static void main(String[] args) {

    }


    //  static int majorityElement(int[] nums) {
    // Arrays.sort(nums);
    //     int n = nums.length;
    //     return nums[n / 2];
    // }
     //  {3,1,2,3,3,0}
    static int majorityElement(int[] arr) {
          int vote =0;
          int cand =0;

          for(int num: arr){
            if(vote ==0){
                cand = num;
            }
            if(cand==num){
               vote++;
            }
            else{
                vote--;
            }
          }

        return cand; 
  }
}
