#include<stdio.h>
//����
// ��һ��������/��inputΪ������ʱ���޷���ȷ��ʾ
//int Numberof1(int input)
//{
//	int ret = 0;
//	do
//	{
//		if (input % 2 ==1)
//		{
//			ret++;
//		}
//
//		input = input / 2;
//	} while (input != 0);
//	return ret;
//}
//
//int main()
//{
//	int input = 0;
//	printf("������һ������\n");
//	scanf_s("%d", &input);
//	printf("%d", Numberof1(input));
//}

//�ڶ���

int Numberof1(int input)
{
	int ret = 0;
	do
	{
		if (input % 2 ==1)
		{
			ret++;
		}

		input = input / 2;
	} while (input != 0);
	return ret;
}

int main()
{
	int input = 0;
	printf("������һ������\n");
	scanf_s("%d", &input);
	printf("%d", Numberof1(input));
}