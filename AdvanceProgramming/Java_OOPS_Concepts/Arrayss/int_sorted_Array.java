package Arrayss;

public class int_sorted_Array {
	
	
	public static void main(String[] args) {
		
		
		int[] nums= {2,9,6,3,5,2,1,7,8,4,1,3,4,5,6,7,8,9};
		
		
		int total=nums.length;
		
		
		for(int i=0;i<total;i++)
			
		{
			
			for(int j=i+1;j<total;j++)
			{
				if(nums[i]<nums[j])
				{
					
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
					
				}
		//remove duplilcates		
				if(nums[i]==nums[j]) {
					
					
					
					nums[j]=nums[total-1];
					total--;
					j--;
				//	System.out.println(nums[i]);
				}
				
			}
			
			System.out.print(nums[i]+" ");
		}
				
		
		
		
	}

}
