m,n=input().split(' ')
m=int(m)
n=int(n)
s=0
for g in range(m,n+1):
    a=g
    l=list(str(a))
    # print(l)
    h=list(map(int,l))
    # print(h)
    c=0
    for k in range(len(h)-1):
        if abs(h[k]-h[k+1])==1:
            c+=1
            # print(c)
        else:
            break
    if c==len(h)-1:
        # print(h)
        res =list(map(str,h))
        # print(res)
        res1 = ''.join(res)
        p = int(res1)
        
        s=s+p
print(s)
        
