//#include<iostream>
//#include<string>
//using String = std::string;
//class Person
//{
//private:
//	String m_Name;
//public:
//	Person() :m_Name("Unknown") {}
//	Person(const String& name) :m_Name(name) {}
//	const String& GetName() const { return m_Name; }
//};
//
//int main()
//{
//    // ���� Person ���͵�ָ��
//    Person* p1, * p2;
//    {
//        // ��ջ�ϴ�������
//        // ����дΪ Person personOnStack = Person("person1");
//        Person personOnStack("person1");
//        // �ڶ��ϴ������� �ؼ��� new
//        Person* personOnHeap = new Person("person2");
//        /* p1ָ��ָ�� personOnStack ���ڵ��ڴ��ַ
//         * �ڴ�����֮�� personOnStack ��������
//         * �ڴ�����֮�󽫻�ȡ���� m_name = person1 �Ķ���
//         */
//        p1 = &personOnStack;
//
//        /* personOnHeap��ֵ��p2
//         * �ڴ�����֮�� personOnHeap���ᱻ����
//         * �ڴ�����֮�󽫻�ȡ�� m_name = person2 �Ķ���
//         */
//        p2 = personOnHeap;
//    }
//
//    // ��ӡ���Ϊ��
//    std::cout << p1->GetName() << std::endl;
//    // ��ӡ���� person2
//    std::cout << p2->GetName() << std::endl;
//
//    // �ڶ��Ϸ���Ķ���Ҫ�ֶ��ͷ��ڴ�
//    // �� new �� deleteһ��ʹ��
//    delete p2;
//    // �˴�����Ҫdelete p1��ԭ��
//    return 0;
//}
//
