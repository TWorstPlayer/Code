#include<stdio.h>
int main()
{
	int arr[10];
	//���¸����鸳ֵ
	for (int cy1 = 0; cy1 < 10; cy1++)
	{
		arr[cy1] = cy1;
	}
	//�����Ƿ�ɹ���ֵ
	for (int cy1 = 0; cy1 < 10; cy1++)
	{
		printf("%d", arr[cy1]);
	}
	
		printf("\n");
	//����Ϊð������
	
	for(int cy2=10;cy2>1;cy2--)//���ѭ��
	{
		for (int cy1 = 0, change = 0; cy1 + 1 < cy2; cy1++)//�ڲ�ѭ��
		{
			if (arr[cy1] < arr[cy1 + 1])
			{
				change = arr[cy1];
				arr[cy1] = arr[cy1 + 1];
				arr[cy1 + 1] = change;
			}
		}
			
	}
	for (int cy1 = 0; cy1 < 10; cy1++)
	{
		printf("%d", arr[cy1]);
	}

}