#include<iostream>
using namespace std;
int main()
{
  bool a = true , b = false, c = true, d = true;
  bool output = (((a&&b) || c) && (!d));
cout<<"OUTPUT = "<<output<<endl;
system("pause");
} 