#include<iostream>
#include <bits/stdc++.h>
using namespace std;

void Duplicates(int *arr, int n){
	unordered_map<int, int> m; // Map to store frequencies
	for(int i=0; i<n; i++){
		m[arr[i]]++;
	}
	unordered_map<int, int>:: iterator it; // Iterator to iterate over map
	for(it = m.begin(); it != m.end(); it++){
		if(it->second > 1){ //If freq > 1.. then print element
			cout<<it->first<<"-> Freq "<<it->second<<endl;
		}
	}
}

int main()
{
	int m; 
	cin>>m;
    int *arr = new int[m];
    for(int i=0; i<m; i++){
    	cin>>arr[i];
	}
    Duplicates(arr, m);
}
