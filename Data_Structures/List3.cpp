#include<iostream>
using namespace std;

//Function to find missing num
int MissingNum(int *arr, int n){
	int sum = 0;
	for(int i=0; i<n-1; i++){
		sum = sum + arr[i]; //Sum of elements of an array
	}
	int acSum = n*(n+1) / 2; //Sum of n natural numbers
	return acSum - sum; 
}

int main(){
	int n; 
	cin>>n;
	int sum=0;
	int *arr = new int[n-1];
	for(int i=0; i<n-1; i++){
		cin>>arr[i];
	}
	cout<<"Missing num: "<<MissingNum(arr, n)<<endl;
}
