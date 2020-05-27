#include<iostream>
int main()
{
  	int a,max;
  	std::cin>>a;
	int arr[a];
  	for(int i=0; i<a; i++)
    	std::cin>>arr[i];
  	max=arr[0];
  	for(int b=0;b<a;b++)
    {
    	if(max<arr[b])
          max=arr[b];
    }
  	std::cout<<max;
  	return 0;	
}