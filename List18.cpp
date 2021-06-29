#include<iostream>
#include<unordered_map>
using namespace std;

//Complexity = O(n)
void nOfele(int *arr, int n, int k){
	unordered_map<int, int> ourmap;
	for(int i=0; i<n; i++){
		ourmap[arr[i]] += 1; 
	}
	int ratio = n/k;
	unordered_map<int, int>::iterator it = ourmap.begin();
	//iterator = to iterate over the map
	while(it != ourmap.end()){
		if(it->second > ratio){
			//check if the frequency exceeds the ratio
			cout<<"key: "<<it->first<<" value: "<<it->second<<endl;
		}

		it++;
	}
	
}
int main(){
	int n, k;
	cin>>n>>k;
	int *arr = new int[n];
	for(int i=0; i<n; i++){
		cin>>arr[i];
	}
	nOfele(arr, n, k);
}
