#include<iostream>
using namespace std;
int main()
{
  int fp,sp,ap,fd,sd,ad,fs,ss,as,fc,sc,ac;
  cin>>fp>>fd>>fs>>sp>>sd>>ss>>ap>>ad>>as;
  fc=fp-(fp*fd/100)+fs;
  sc=sp-(sp*sd/100)+ss;
  ac=ap-(ap*ad/100)+as;
  cout<<"In Flipkart Rs."<<fc;
  cout<<"\nIn Snapdeal Rs."<<sc;
  cout<<"\nIn Amazon Rs."<<ac;
  if((fc<=sc)&&(fc<=ac))
    cout<<"\nHe will prefer Flipkart";
  else if(sc<ac)
    cout<<"\nHe will prefer Snapdeal";
  else
    cout<<"\nHe will prefer Amazon";
  return 0;
}