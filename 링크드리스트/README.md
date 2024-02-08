## 큐 (2164) 
https://www.acmicpc.net/status?user_id=lingling29&problem_id=2164&from_mine=1 
### 문제를 풀면서 실수 했던 것

1. card 함수부분에서 입력값 N이 1로 들어왓을 때 예외를 처리해주지 못하여서 segment fault 에러가 났다. 
2. queue구현 부분에서 size 체크를 빈 큐에 새롭게 노드가 들어왔을 경우 예외처리를 해주었는데 이때 size 체크를 잘못하여서 백준에 제출할때마다 '틀렸습니다'가 떴다.