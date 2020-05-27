#include<iostream>
int main()
{
  	int a,no,flag=0;
  	std::cin>>a;
	int arr[a];
  	for(int i=0; i<a; i++)
    	std::cin>>arr[i];
  	std::cin>>no;
  	for(int b=0; b<a; b++)
    {
      	if(arr[b]==no)
          flag=1;
    }
  	if(flag==1)
      std::cout<<"She passed her exam";
    else
       std::cout<<"She failed";
  	return 0;	
}