#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <algorithm>
using namespace std;


const int N = 1e5 + 10;
int arr[N];
int n;

void quick_sort(int arr[],int l,int r) {

    if (l >= r)return;
    int j = l - 1;
    int i = r + 1;
    int mid = arr[l];
    while (j<i) 
    {
        do j++; while (arr[j] < mid);
        do i--; while (arr[i] > mid);
        if(j<i)swap(arr[j], arr[i]);
    }
    quick_sort(arr, l, i);
    quick_sort(arr, i+1, r);
    return;

}
int main() {
    
    scanf_s("%d", &n);
    
    for (int i = 0; i <n; i++)scanf_s("%d", &arr[i]);
    quick_sort(arr, 0, n-1);
    for (int i = 0; i<n; i++)printf("%d ", arr[i]);
    return 0;

}