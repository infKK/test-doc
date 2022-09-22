a = int(input())
c = 0
b = a%10
a = (a - a%10)/10
k = 1
while k > 0:
    k = a%10
    if k == b:
        c += 1
    a = (a - a%10)/10
    b = k
if c > 0:
    print('Да')
else:
    print('Нет')
