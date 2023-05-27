/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EasyLeetProblems;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 *
 * @author Gorilla Rig
 */
public class TwoSums {

    public int[] twoSum2(int[] nums, int target) {

        int[] sum = new int[2];

        for (int i = 0; i < nums.length; ++i) {

            for (int k = 1; k < nums.length; ++k) {
                if (nums[i] + nums[k] == target && i != k) {

                    sum[0] = i;
                    sum[1] = k;

                }
            }

        }

        return sum;
    }

  public int[] twoSum(int[] nums, int target) {

        int[] sum = new int[2];

        HashMap<Integer, Integer> sumMap = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {

            sumMap.put(i, nums[i]);

        }
        
        for(int k = 0; k < sumMap.size(); ++k){
            int number = target - sumMap.get(k);
            
            if(sumMap.containsValue(number)){
                sum[0] = k;
                for(int x = k; x < sumMap.size(); ++x){
                    if(sumMap.get(x) == number){
                        sum[1] = x;
                        return sum;
                    }
                }
               
            }
            
        }

        return sum;
    }

    public static void main(String[] args) {
        TwoSums tS = new TwoSums();

        int[] nums = {3,2,4};
        int target = 6;

        tS.twoSum(nums, target);
        System.out.println();

    }

}
