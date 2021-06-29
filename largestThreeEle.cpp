#include<iostream>
#include<climits>
using namespace std;

int main(){
	int n1; 
	cin>>n1;
    int *arr = new int[n1];
    for(int i=0; i<n1; i++){
    	cin>>arr[i];
	}
	
	int first,second,third;
	first = second = third = INT_MIN;
	for(int i=0; i<n1; i++){ //loop to find the largest 3 three elements
	
		//if element is greater than first .
		if(arr[i] > first){ 
			third = second;
			second = first;
			first = arr[i];
		}
		//if element is greater than second but less than first
		else if(arr[i] > second){
			third = second;
			second = arr[i];
		}
		//if ele is greater than third but less than first and second
		else if(arr[i] > third){
			third = arr[i];
		}
	}
	cout<<"First: "<<first<<endl;
	cout<<"second: "<<second<<endl;
	cout<<"third: "<<third<<endl;
}
