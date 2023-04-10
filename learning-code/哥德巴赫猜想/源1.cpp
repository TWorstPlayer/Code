#include <stdio.h>
#include <stdlib.h>
int main()
{
    int a, b, c, d, count1, count2;
    for (a = 4; a <= 100; a = a + 2)
    {
        for (b = 2; b <= a / 2; b++)
        {//判断b时不时质数
           
            count1 = 0;
            for (c = 2; c <= b - 1; c++)
            {
                if (b % c == 0)
                {
                    count1++;
                }
            }
            if (count1 == 0)//b是质数
            {
                d = a - b;//a=b+d
                count2 = 0;//d是不是质数
                for (c = 2; c <= d - 1; c++)
                {
                    if (d % c == 0)
                    {
                        count2++;
                    }
                }
               
                if (count2 == 0)//d是质数
                {
                    printf("=%d+%d", b, d);//输出
                }
                
            }
            
        }
    }
    system("pause");
    return 0;
}