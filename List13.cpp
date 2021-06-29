#include<iostream>
using namespace std;

int start=0, e=0, s=0;

void kandaneAlgo(int *arr, int n){
	int max_so_far = 0;
	int max_end = 0;
	for(int i=0; i<n; i++){
		max_end = max_end + arr[i];
		if(max_so_far < max_end){
			max_so_far = max_end;
			start = s;
			e = i;
		}
		if(max_end < 0){
			max_end = 0;
			s = i + 1;
		}
	}
}
int main(){
	//4 -3 -2 2 3 1 -2 -3 4 2 -6 -3 -1 -3 -1 2
	//-2 -3 4 -1 -2 1 5 -3
	int n; cin>>n;
	int *arr = new int[n];
	for(int i=0; i<n; i++){
		cin>>arr[i];
	}
	kandaneAlgo(arr, n);
	int sum = 0;
	cout<<start<<" "<<e<<endl;
	for(int j=start; j<=e; j++){
		sum = sum + arr[j];
		cout<<arr[j]<<" ";
	}
	cout<<endl<<"Sum: "<<sum<<endl;
}
