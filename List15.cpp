#include <bits/stdc++.h> 
using namespace std; 
  
/* Assumes that the given array always has a subarray  
with product more than 1 */
int maxSubarrayProduct(int arr[], int n) 
{ 

    int max_ending_here = 1; //can be 1 or +ve
  
    int min_ending_here = 1; //can be 1 or -ve
  
    // Initialize overall max product 
    int max_so_far = 1; 
    
 	//If flag will become 1 then updates in the max product has occured 
	//else an array dont have any +ve a subarray of max +ve product 
    int flag = 0;
    for (int i = 0; i < n; i++) { 
        /* If this element is positive, update max_ending_here.  
        Update min_ending_here only if min_ending_here is  
        negative */
        if (arr[i] > 0) { 
            max_ending_here = max_ending_here * arr[i]; 
            min_ending_here = min(min_ending_here * arr[i], 1); 
            flag = 1; 
        } 
  
        /* If this element is 0, then the maximum product  
        cannot end here, make both max_ending_here and  
        min_ending_here 0  
        Assumption: Output is alway greater than or equal  
                    to 1. */
        else if (arr[i] == 0) { 
            max_ending_here = 1; 
            min_ending_here = 1; 
        } 
  
         
       /* If element is negative. This is tricky   
        max_ending_here can either be 1 or positive.   
        min_ending_here can either be 1 or negative.   
        next max_ending_here will always be prev.   
        min_ending_here * arr[i] ,next min_ending_here   
        will be 1 if prev max_ending_here is 1, otherwise   
        next min_ending_here will be prev max_ending_here *   
        arr[i] */
  
        else { 
            int temp = max_ending_here; 
            max_ending_here = max(min_ending_here * arr[i], 1); 
            min_ending_here = temp * arr[i]; 
        } 
  
        // update max_so_far, if needed 
        if (max_so_far < max_ending_here) 
            max_so_far = max_ending_here; 
    } 
    if (flag == 0 && max_so_far == 1) 
        return 0; 
    return max_so_far; 
} 
  
// Driver code 
int main() 
//1 -2 -3 0 7 -8 -2 
{ 	int n; cin>>n;
	int *arr = new int[n];
	for(int i=0; i<n; i++){
		cin>>arr[i];
	} 
    cout << "Maximum Sub array product is "
         << maxSubarrayProduct(arr, n); 
    return 0; 
} 
  

