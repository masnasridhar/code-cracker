package Array;
class SubarraySum 
{ 
	int subArraySum(int arr[], int n, int sum) 
	{ 
		int curr_sum = arr[0], start = 0, i; 
		// Pick a starting point 
		for (i = 1; i <= n; i++) 
		{ 
			// If curr_sum exceeds the sum, then remove the starting elements 
			while (curr_sum > sum && start < i-1) 
			{ 
				curr_sum = curr_sum - arr[start]; 
				start++; 
			} 
			// If curr_sum becomes equal to sum, then return true 
			if (curr_sum == sum) 
			{ 
				int p = i-1; 
				System.out.println("Sum found between indexes " + start 
						+ " and " + p); 
				return 1; 
			} 
			// Add this element to curr_sum 
			if (i < n) 
			curr_sum = curr_sum + arr[i]; 
		} 
		System.out.println("No subarray found"); 
		return 0; 
	} 
	int subArraySum1(int arr[], int n, int sum)  
    { 
        int curr_sum, i, j; 
  
        // Pick a starting point 
        for (i = 0; i < n; i++)  
        { 
            curr_sum = arr[i]; 
  
            // try all subarrays starting with 'i' 
            for (j = i + 1; j <= n; j++)  
            { 
                if (curr_sum == sum)  
                { 
                    int p = j - 1; 
                    System.out.println("Sum found between indexes " + i 
                            + " and " + p); 
                    return 1; 
                } 
                if (curr_sum > sum || j == n) 
                    break; 
                curr_sum = curr_sum + arr[j]; 
            } 
        } 
  
        System.out.println("No subarray found"); 
        return 0; 
    } 
	public static void main(String[] args) 
	{ 
		SubarraySum arraysum = new SubarraySum(); 
		int arr[] = {15, 2, 4, 8, 9, 5, 10, 23}; 
		int n = arr.length; 
		int sum = 23; 
		arraysum.subArraySum(arr, n, sum); 
	} 
} 