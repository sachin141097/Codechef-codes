# cook your dish here
t=int(input())
for i in range(t):
    n=int(input())
    a=[int (i) for i in input().split()]
    d=[int(i) for i in input().split()]
    check=False
    m=[]
    if(d[0]>a[1]+a[n-1]):
        m.append(d[0])
        
        check=True
        index=0
    if(d[n-1]>a[n-2]+a[0]):
        m.append(d[n-1])
        check=True
        index=n-1
    
    for i in range(1,n-1):
        if(d[i]>a[i-1]+a[i+1] ):
            m.append(d[i])
            check=True
            index=i
    if(check):
        print(max(m))
    else:
        print("-1")
