a = int(input())
b = int(input())
c = int(input())
if a>=b and a>=c:
    print("наибольшее:", a)
else:
    if b>=a and b>=c:
        print("наибольшее:", b)
    else:
        if c>=a  and c>=b:
            print("наибольшее:", c)
            if a<=b and a<=c:
                print("наименьшее:", a)
            else:
                     if b<=a and b<=c:
                        print("наименьшее:", b)
                    else:
                             if c<=a  and c<=b:
                                print("наименьшее:", c)
            
            
    
