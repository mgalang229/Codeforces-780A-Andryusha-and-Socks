#include <bits/stdc++.h>

using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(0);
	int n;
	cin >> n;
	int a[2 * n];
	int counter_array[2 * n];
	for (int i = 0; i < 2 * n; i++) {
		cin >> a[i];
		counter_array[a[i]] = 0;
	}
	int cnt = 0;
	int mx = 0;
	for (int i = 0; i < 2 * n; i++) {
		if (counter_array[a[i]] == 0) {
			cnt++;
			counter_array[a[i]]++;
		} else {
			cnt--;
			if (counter_array[a[i]] > 0) {
				counter_array[a[i]]--;
			} else {
				counter_array[a[i]] = 0;
			}
		}
		mx = max(mx, cnt);
	}
	cout << mx << '\n';
	return 0;
}
