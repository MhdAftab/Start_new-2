#include<iostream>
using namespace std;

int partition(int *arr, int p, int r){
	int x = arr[r];
	int i = p-1;
	for(int j=p; j<r; j++){
		if(arr[j] <= x){
			i = i + 1;
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	int temp = arr[i+1];
	arr[i+1] = arr[r];
	arr[r] = temp;
	return i+1;
}

void quickSort(int *arr, int p, int r){
	if(p < r){
		int q = partition(arr, p, r); 
		quickSort(arr, p, q-1);
		quickSort(arr, q+1, r);
	}
}

int main(){
	int m; 
	cin>>m;
    int *arr = new int[m];
    for(int i=0; i<m; i++){
    	cin>>arr[i];
	}
	quickSort(arr, 0, m-1);
	for(int i=0; i<m; i++){
		cout<<arr[i]<<" ";
	}
}
