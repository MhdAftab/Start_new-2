#include<iostream>
using namespace std;

//TimeComplexity = O(log n)
int findMin(int *arr, int n){
	//if array is empty
	if(n == 0){
		return -1;
	}
	//if array is not rotated
	if(arr[0] <= arr[n-1]){
		return arr[0];
	}
	int start = 0, end = n-1;
	while(start <= end){
		int mid = (start + end) / 2;
		// if mid ele is min ele
		if(arr[mid] > arr[mid+1]){
			return arr[mid+1];
		}
		//
		else if(arr[start] <= arr[mid]){ 
			//it means array before mid is sorted so we will find min ele in 2nd half
			start = mid + 1;
		}
		else{
			//else min ele lies in the 1st half
			end = mid-1;
		}
	}
}
int main(){
	//5 6 1 2 3 4
	int n; cin>>n;
	int *arr = new int[n];
	for(int i=0; i<n; i++){
		cin>>arr[i];
	} 
	int minEle = findMin(arr, n);
	cout<<"Min element: "<<minEle<<endl;
}

