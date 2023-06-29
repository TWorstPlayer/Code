#include<iostream>;
using namespace std;

struct Student {
	int grade;
	string name;

};

int main() {

	struct Student Lihua;
	Lihua.grade = 11;
	Lihua.name = "Lihua";
	//cout << Lihua.grade << "³É¼¨" <<Lihua.name << "Ãû×Ö" << endl;

	struct Student* a=&Lihua;

	//(*a).grade = 3;
	//(*a).name = "asda";
	cout << (*a).grade;

	//system("pause");






}