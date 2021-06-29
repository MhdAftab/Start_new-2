#include<iostream>
using namespace std;

int maxEle(int *arr, int n){
	int m = INT_MIN;
	for(int i=0; i<n; i++){
		m = max(arr[i], m);
	}
	return m;
}

int max2(int *arr,  int n){
	if(n == 1){
		return arr[0];
	}
	return max(arr[n-1], max2(arr, n-1));
	
}

int main(){
	int m; 
	cin>>m;
    int *arr = new int[m];
    for(int i=0; i<m; i++){
    	cin>>arr[i];
	}
    cout<<endl<<"Max Ele: "<<max2(arr, m);
}
