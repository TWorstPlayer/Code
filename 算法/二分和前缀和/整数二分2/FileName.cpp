#define _CRT_SECURE_NO_WARNINGS 1
#include<iostream>
#include<bits/stdc++.h> 
using namespace std;

const int max1 = 1e6 + 10;
int arr[max1];
int main() {

	int n = 0;
	int q = 0;
	scanf("%d %d", &n, &q);
	for (int i = 0; i < n; i++)scanf("%d", &arr[i]);
	int ask = 0;
	while (q--) {
		scanf("%d", &ask);
		int l = 0;
		int r = n - 1;
		int mid = 0;
		while (l < r) {
			mid = l + r >> 1;
			//����˵㣬>=����ask�ľ�����˵�
			if (arr[mid] >= ask)r = mid;
			else l = mid + 1;
		}

		if (arr[r] == ask)printf("%d", l);


		l = 0;
		r = n - 1;
		while (l < r) {
			mid = l + r + 1 >> 1;
			//���Ҷ˵㣬<=����ask�ľ����Ҷ˵�
			if (arr[mid] <= ask) l = mid;
			else r = mid - 1;
		}
		if (arr[l] == ask)printf(" %d\n", r);

		else printf("-1 -1\n");

	}

	return 0;



}