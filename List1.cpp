#include<iostream>
using namespace std;

void printUnion(int *arr1, int *arr2, int m, int n){
	int i=0, j=0;
	while(i < m && j < n){
		if(arr1[i] < arr2[j]){
			cout<<arr1[i++]<<" ";
		}
		else if(arr1[i] > arr2[j]){
			cout<<arr2[j++]<<" ";
		}
		else{
			cout<<arr1[i++]<<" ";
			j++;
		}
	}
	while(i < m){
		cout<<arr1[i++]<<" ";
	}
	while(j < n){
		cout<<arr2[j++]<<" ";
	}
}

void printIntersection(int *arr1, int *arr2, int m, int n){
	int i=0, j=0;
	while(i < m && j < n){
		if(arr1[i] < arr2[j]){
			i++;
		}
		else if(arr1[i] > arr2[j]){
			j++;
		}
		else if(arr1[i] == arr2[j]){
			cout<<arr1[i++]<<" ";
			j++;
		}
	}
}

int main(){
	int m; 
	cin>>m;
	int *arr1 = new int[m];
	for(int i=0; i<m; i++){
		cin>>arr1[i];
	}
	int n; 
	cin>>n;
	int *arr2 = new int[n];
	for(int i=0; i<n; i++){
		cin>>arr2[i];
	}
	cout<<"Union: ";
	printUnion(arr1, arr2, m, n);
	cout<<endl<<"Intersection: ";
	printIntersection(arr1, arr2, m, n);
}
