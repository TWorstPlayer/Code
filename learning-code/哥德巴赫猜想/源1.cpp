#include <stdio.h>
#include <stdlib.h>
int main()
{
    int a, b, c, d, count1, count2;
    for (a = 4; a <= 100; a = a + 2)
    {
        for (b = 2; b <= a / 2; b++)
        {//�ж�bʱ��ʱ����
           
            count1 = 0;
            for (c = 2; c <= b - 1; c++)
            {
                if (b % c == 0)
                {
                    count1++;
                }
            }
            if (count1 == 0)//b������
            {
                d = a - b;//a=b+d
                count2 = 0;//d�ǲ�������
                for (c = 2; c <= d - 1; c++)
                {
                    if (d % c == 0)
                    {
                        count2++;
                    }
                }
               
                if (count2 == 0)//d������
                {
                    printf("=%d+%d", b, d);//���
                }
                
            }
            
        }
    }
    system("pause");
    return 0;
}