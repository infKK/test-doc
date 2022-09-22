a = int(input())
if a < 100:
    if a//10 < a%10:
        print(a//10)
    else:
        print(a%10)
if a > 100:
    if a//100 < a%100//10:
        if a//100 > a%100%10:
            print(a%100%10)
        else:
            print(a//100)
    else:
        if a%100//10 < a//100:
            if a%100//10 > a%100%10:
                print(a%100%10)
            else:
                print(a%100//10)
