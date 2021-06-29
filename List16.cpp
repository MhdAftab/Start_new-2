#include<iostream>
#include<unordered_map>
using namespace std;

void LCsub(int *arr, int n){
	unordered_map<int, bool> umap;
	int ans = 0;
	
	for(int i=0; i<n; i++){
		umap[arr[i]] = true; // filling a map from a given array
	}
	unordered_map<int, bool>:: iterator itr; 
    cout << "\nAll Elements : \n"; 
    for (int i=0; i<n; i++){
		if(umap.find(arr[i]-1) == umap.end()){
			//If arr[i] - 1 not in map ...then arr[i] can be the starting of the sequence
			int j = arr[i];
			int count = 0;
			while(umap.find(j) != umap.end()){
				//Finding the proceeding elements if present in a map
				j++;
				count++;// counting the number of elements that can be part of longest sequence
			}
			ans = max(ans, count);
		}
	}
	cout<<ans;
}
int main() 
//1 9 3 10 4 20 2
//36 41 56 35 44 33 34 92 43 32 42
{ 	
	int n; cin>>n;
	int *arr = new int[n];
	for(int i=0; i<n; i++){
		cin>>arr[i];
	} 
    LCsub(arr, n);
    return 0; 
} 
  
