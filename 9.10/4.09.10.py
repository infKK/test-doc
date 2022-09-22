a = int(input())
b = int(input())
c = int(input())
if a == b:
    if a>c:
        print('3 меньше')
    else:
        print('3 больше')
elif a==c:
    if a>b:
        print('2 меньше')
    else:
        print('2 больше') 
else:
    if b==c:
        if c>a:
            print('1 меньше')
        else:
            print('1 больше') 
        
