#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
 struct student p1;
 cout<<"\n"<<"Student Details\n";
 cin.get(p1.name, 50);
 cin>>p1.roll;
 cin>>p1.marks;
 std::cout<< "Name: "<< p1.name<< "\n"<< "Roll: "<< p1.roll<< "\n"<< "Marks: "<< p1.marks; 
 return 0; 
}