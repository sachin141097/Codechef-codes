for _ in range(int(input().strip())):
    N = int(input().strip())
    arr = [int(x) for x in input().strip().split(' ') if (int(x))>1]
    ans = sum(arr)-len(arr)+1
    if ans<1: print(1)
    else: print(ans)
