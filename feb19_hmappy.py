def gcd(a, b) : 
      
    if (a == 0) : 
        return b 
          
    return gcd(b % a, a) 
  
# Function to return LCM of two numbers 
def lcm(a,b): 
    return (a*b) / gcd(a,b) 
t=int(input())
for i in range(0,t):
    n,a,b,k=map(int,input().split())
    
    
    
    count1=(n//a)-(n//lcm(a,b))
    count2=(n//b)-(n//lcm(a,b))
    total=count1+count2
    #print(total)
    if(total>=k):
        print("Win")
    else:
        print("Lose")
