#include <stdio.h>
int main()
{
    int a[11], i, j, t;
    printf("Input 10 numbers:\n");
    for (i = 1; i < 11; i++)
        scanf_s("%d", &a[i]);
    printf("\n");
    for (j = 1; j <= 9; j++)
        for (i = 1; i <= 10 - j; i++)
            if (a[i] > a[i + 1])
            {
                t = a[i]; a[i] = a[i + 1]; a[i + 1] = t;
            }
    printf("The sorted numbers:\n");
    for (i = 1; i < 11; i++)
        printf("%d ", a[i]);
}
