//#include<iostream>;
//using namespace std;
//
////struct Student {
////	int grade;
////	string name;
////
////};
//
////class student{
////public:
////	string name;
////	int grade;
////};
//
////class test {
////public:
////	int a;
////	/*test(int a) {
////		this->a = a;
////	}*/
////	void text() {
////		cout << a;
////	}
////	test get() {
////		return *this;
////
////	}
////};
//int main() {
//
//	//struct Student Lihua;
//	//Lihua.grade = 11;
//	//Lihua.name = "Lihua";
//	//cout << Lihua.grade << "成绩" <<Lihua.name << "名字" << endl;
//	//struct Student* a=&Lihua;
//	//(*a).grade = 3;
//	//(*a).name = "asda";
//	//cout << (*a).grade;
//	//system("pause");
//	//int a = 4;
//	//const int* a1 = &a;
//	//cout << *a1;
//	//int b = 5;
//	//a1 = &b;
//	//cout << *a1;
//	//int c = 6;
//	//int* const c1 = &c;
//	//cout << *c1;
//	//*c1 = 7;
//	//cout << *c1;
//	//int d = 8;
//	//int e = 9;
//	//const int* const d1 = &d;
//	//*d1 = 9;		//不行，会报错
//	//d1 = &e;		//不行，会报错
//	//const int& a = 19;
//	//cout << a;
//	//int b = 5;
//	//int& a = b;
//	//cout << a << b;
//	//const int& a = 3;
//	//cout << a;
//
//	/*student Lihua;
//	Lihua.name = "Lihua";
//	Lihua.grade = 88;
//	cout << Lihua.grade;
//	cout << "\n";
//	cout << Lihua.name;*/
//	/*int arr[][3] = { 10,20,30,40,50,60 };
//	cout << arr[0][0] << arr[1][0] << arr[1][2] << arr[2][0];*/
//	/*test a(10);
//	a.text();
//
//	test b = a.get();
//	b.text();*/
//
//	/*int a = 3;
//	int& a1 = a;
//	cout << a<<"  "<<a1;
//	a1 = 4;
//	cout << a<<"  "<<a1;*/
//	/*test a();
//	a = new test;*/
//	/*test* a;
//	a = new test(3);*/
//	/*test a1 = new test;*/
//
//
//
//
//}


#include<iostream>;
using namespace std;


class father {
	int a;
	string name;
public:void display() {
	cout << "这是父亲";
}
};

class son :public father {
public:int c=3;
	  int getc() {
		  return this->c;
		}
};


int main() {
	/*son sona;
	sona.display();*/
	son* p1, * p2;

	{
		son sona;
		son *sonb = new son();
		p1 = &sona;
		p2 = sonb;
		cout << p1->getc()<<endl;

		
	}

	
	cout << p1->getc() << endl;
	son sona;
	son sonb;
	son sdjad;
	cout << p1->getc() << endl;
	





}


