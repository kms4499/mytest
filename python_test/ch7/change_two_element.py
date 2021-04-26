#n은 배열의 길이 k=바꿔치기 할 수 있는 횟수
n,k=map(int, input().split())
a=list(map(int, input().split())) # a 배열 원소 입력받기
b=list(map(int, input().split()))

a.sort()#a는 오름차순 정렬
b.sort(reverse=True)#b는 내림차순 정렬 리버스

for i in range(k):
    if a[i] < b[i]:
        a[i], b[i] = b[i], a[i]
    else:
        break

print(sum(a))