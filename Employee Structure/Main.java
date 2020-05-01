#include<iostream>
using namespace std;
struct employee
{
  char name[50];
  int id;
  int age;
  char desi[50];
  int salary;
};
int main()
{ 
  struct employee e1;
  
  cout<<"Enter name:"<<endl;
  cin.getline(e1.name,50);
  cout<<"Enter ID: "<<endl;
  cin>>e1.id;
  cout<<"Enter age:"<<endl;
  cin>>e1.age;
  cout<<"Enter designation: "<<endl;
  cin>>e1.desi;
  cout<<"Enter Salary: "<<endl;
  cin>>e1.salary;
  cout<<"Employee Details"<<endl;
  cout<<"Name of the Employee : "<<e1.name<<endl;
  cout<<"ID of the Employee : "<<e1.id<<endl;
  cout<<"Age of the Employee : "<<e1.age<<endl;
  cout<<"Designation of the Employee : "<<e1.desi<<endl;
  cout<<"Salary of the Employee : "<<e1.salary<<endl;
}