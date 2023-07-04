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
//    // 创建 Person 类型的指针
//    Person* p1, * p2;
//    {
//        // 在栈上创建对象
//        // 可以写为 Person personOnStack = Person("person1");
//        Person personOnStack("person1");
//        // 在堆上创建对象 关键词 new
//        Person* personOnHeap = new Person("person2");
//        /* p1指针指向 personOnStack 所在的内存地址
//         * 在大括号之后 personOnStack 将被回收
//         * 在大括号之后将获取不到 m_name = person1 的对象
//         */
//        p1 = &personOnStack;
//
//        /* personOnHeap赋值给p2
//         * 在大括号之后 personOnHeap不会被回收
//         * 在大括号之后将获取到 m_name = person2 的对象
//         */
//        p2 = personOnHeap;
//    }
//
//    // 打印结果为空
//    std::cout << p1->GetName() << std::endl;
//    // 打印名字 person2
//    std::cout << p2->GetName() << std::endl;
//
//    // 在堆上分配的对象要手动释放内存
//    // 即 new 和 delete一起使用
//    delete p2;
//    // 此处不需要delete p1的原因？
//    return 0;
//}
//
