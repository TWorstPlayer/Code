#define _CRT_SECURE_NO_WARNINGS 1
#include<iostream>
#include<bits/stdc++.h> 
using namespace std;

const int max1 = 1e6 + 10;
typedef  long long ll;
int arr[max1];
int tmp[max1];
ll res;

void merge_sort(int arr1[], int l, int r) {
	if (l >= r)return;
	int mid = l + r >> 1;
	int i = l; int j = mid + 1;
	int k = 0;
	merge_sort(arr1, l, mid);
	merge_sort(arr1, mid+1, r);
	
	while (i <= mid && j <= r) {
		if (arr1[i] <= arr1[j]) {	//这道题目在这个地方的<=是关键，必须要有=号，因为这个题目是在求逆序对，
									//如果不加=号，那么下面else里面就会把两个位置前后不同，但是值相等的数当作是一对逆序对
									//导致出错，这里找了半天的错误
			tmp[k++] = arr1[i++];
		}
		else { 
			tmp[k++] = arr1[j++]; 
				res+= mid - i + 1; }
	}
		while (i <= mid)tmp[k++] = arr1[i++];
		while (j <= r)tmp[k++] = arr1[j++];
		for (int a = l, b = 0; a <= r; a++,b++)arr1[a] = tmp[b];
	

}

int main() {
	int n = 0;
	scanf("%d", &n);
	for (int i = 0; i < n; i++)scanf("%d", &arr[i]);

	merge_sort(arr, 0, n - 1);

	cout <<res<< endl;

}



