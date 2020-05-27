#include<iostream>
using namespace std;
int main()
{
  int u,bill;
  cin>>u;
  if(u<=200)
    bill=u*0.5;
  else if(u>200&&u<=400)
    bill=u*0.65+100;
  else if(u>400&&u<=600)
    bill=u*0.8+200;
  else if(u<600)
    bill=u*1.25+425;
  else
    cout<<"enter a valid units";
  cout<<"Rs."<<bill;
  return 0;
}