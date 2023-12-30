#include <iostream>
#include <vector>
#include <algorithm>

int main() {

	std::ios::sync_with_stdio(false);
	std::cin.tie(NULL);
	int N, K;
	std::vector<int> n;

	std::cin >> N >> K;
	n.push_back(0);

	int tmp;
	for (int i = 1; i <= N; i++) {
		std::cin >> tmp;
		n.push_back(tmp + n[i - 1]);
	}

	int i_max = -9999999;
	for (int i = K; i <= N; i++) {
		i_max = std::max(i_max, n[i] - n[i - K]);
	}
	
	std::cout << i_max;
	return 0;

}