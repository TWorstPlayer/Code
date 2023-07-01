#include<iostream>;
using namespace std;

//struct Student {
//	int grade;
//	string name;
//
//};

class student{
public:
	string name;
	int grade;
};
int main() {

	//struct Student Lihua;
	//Lihua.grade = 11;
	//Lihua.name = "Lihua";
	//cout << Lihua.grade << "成绩" <<Lihua.name << "名字" << endl;
	//struct Student* a=&Lihua;
	//(*a).grade = 3;
	//(*a).name = "asda";
	//cout << (*a).grade;
	//system("pause");
	//int a = 4;
	//const int* a1 = &a;
	//cout << *a1;
	//int b = 5;
	//a1 = &b;
	//cout << *a1;
	//int c = 6;
	//int* const c1 = &c;
	//cout << *c1;
	//*c1 = 7;
	//cout << *c1;
	//int d = 8;
	//int e = 9;
	//const int* const d1 = &d;
	//*d1 = 9;		//不行，会报错
	//d1 = &e;		//不行，会报错
	//const int& a = 19;
	//cout << a;
	//int b = 5;
	//int& a = b;
	//cout << a << b;
	//const int& a = 3;
	//cout << a;

	student Lihua;
	Lihua.name = "Lihua";
	Lihua.grade = 88;
	cout << Lihua.grade;
	cout << "\n";
	cout << Lihua.name;


}