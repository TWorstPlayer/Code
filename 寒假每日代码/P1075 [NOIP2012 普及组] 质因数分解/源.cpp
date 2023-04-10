//第一段是正解
//第二段是一开始的错误例子

#include<stdio.h>
#include<cmath>
int isPrime(int n) {
    //n<=3时，质数有2和3
    if (n <= 3) {
        return n > 1;
    }
    //当n>3时，质数无法被比它小的数整除
    for (int i = 2; i < n; i++) {
        if (n % i == 0) {
            return 0;
        }
    }
    return 1;
}

int main()
{
    int n = 0;
    scanf_s("%d", &n);

    if (n<=2)
    {
        printf("%d", n );
    }
    else if (n % 2 == 0)
    {
        printf("%d", n / 2);

    }
    else
    {
        int a = 0;
        a = sqrt(n);

        while (1)
        {
            a--;
            if (isPrime(a) == 1)
            {
                int b = n / a;
                if (b * a == n)
                {
                    break;
                }
                else 
                {
                    continue;
                }
            }
            
        }
        printf("%d", n / a);
    }
}

//开始的错误例子

#include<stdio.h>
#include<cmath>
int isPrime(int n) {
    //n<=3时，质数有2和3
    if (n <= 3) {
        return n > 1;
    }
    //当n>3时，质数无法被比它小的数整除
    for (int i = 2; i < n; i++) {
        if (n % i == 0) {
            return 0;
        }
    }
    return 1;
}

int main()
{
    int n = 0;
    scanf_s("%d", &n);

    if (n <= 2)
    {
        printf("%d", n);
    }
    else if (n % 2 == 0)
    {
        printf("%d", n / 2);

    }
    else
    {
        int a = 0;
        a = sqrt(n);

        while (isPrime(a) !=1 )
        {
            a--;

        }
        printf("%d", n / a);//在这一步出现了问题，因为n/a不一定是一个整数，而质数肯定是一个整数
                            //所以需要再次判断，n/a得到的数乘b是不是为一个整数
    }                       //因为n/a是int类型，如果n/a有小数，就会舍掉小数，则n/a 之后再*a就与n不相等。
}
//
    