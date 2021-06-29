#include <iostream> 
#include <math.h> 
using namespace std; 
  
class gfg 
{ 
      
public: 
void printPowerSet(int *set, int set_size) 
{ 

    unsigned int pow_set_size = pow(2, set_size); 
    int counter, j; 
  
	bool ans = false;
    for(counter = 1; counter < pow_set_size; counter++) 
    { int sum = 0;
    
    for(j = 0; j < set_size; j++) 
    { 

        if(counter & (1 << j)) {
		
            cout << set[j]<<" "; 
            sum = sum+set[j];}
    } 
 	if(sum == 0){
 		ans = true;
	 }
    cout<<endl;
    }
	cout<<"ans: "<<ans<<endl; 

} 
}; 
  

int main() 
{ 
    gfg g; 
    int set[] = {6, -3, -10, 0, 2}; 
    g.printPowerSet(set, 5); 
    return 0; 
} 
