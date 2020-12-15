#include <bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
using namespace std;
using namespace __gnu_pbds;

#define ll long long
#define ar array

typedef tree<int, null_type, less<int>, rb_tree_tag,
tree_order_statistics_node_update> indexed_set;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);
	
	int n;
	cin >> n;
	int a[2*n];
	int arr[2*n];
	for(int i=0; i<2*n; ++i) {
		cin >> a[i];
		arr[a[i]]=0;
	}
	int cnt=0, mx=0;
	for(int i=0; i<2*n; ++i) {
		if(arr[a[i]]==0) {
			cnt++;
			arr[a[i]]++;
		} else {
			cnt--;
			if(arr[a[i]]>0)
				arr[a[i]]--;
			else
				arr[a[i]]=0;
		}
		mx=max(mx, cnt);
	}
	cout << mx << "\n";
}
