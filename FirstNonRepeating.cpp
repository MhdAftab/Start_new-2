#include<iostream>
#include<unordered_map>

using namespace std;

/* Find first non-repeating ele in an array using inbuilt unordered_map*/
int main(){
	unordered_map<int, int> ourmap;
	int n1; 
	cin>>n1;
    int *arr = new int[n1];
    for(int i=0; i<n1; i++){
    	cin>>arr[i];
    	ourmap[arr[i]]++;
	}
	for(int i=0; i<n1; i++){ //Iterating over the map to find the desired element
		
		//If element frequency is = 1 
		if(ourmap[arr[i]] == 1){
			cout<<arr[i]<<endl;
			break;
		}
	}

}
