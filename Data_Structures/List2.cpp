#include<iostream>
using namespace std;

void rotateCylinder(int *arr, int n){
	int x = arr[n-1];
	for(int i=n-1; i>=0; i--){
		arr[i] = arr[i-1];
	}
	arr[0] = x;
}

int main(){
	int n; 
	cin>>n;
	int *arr = new int[n];
	for(int i=0; i<n; i++){
		cin>>arr[i];
	}
	int k ;
	cout<<"Number of rotations: ";
	cin>>k;
	while(k){
		rotateCylinder(arr, n);	
		k--;
	}
//	rotateCylinder(arr, n);
	for(int i=0; i<n; i++){
		cout<<arr[i]<<" ";
	}
}
