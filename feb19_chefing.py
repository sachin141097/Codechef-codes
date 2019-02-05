t=int(input())
for i in range(0,t):
    k=int(input())
    names=[]
    for m in range(0,k):
        
        names.append(input())
    #print(names)
    result=set(names[0])
    for s in names[1:]:
        result&=set(s)
    print(len(result))
        
        
    
