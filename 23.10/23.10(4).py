Python 3.9.6 (tags/v3.9.6:db3ff76, Jun 28 2021, 15:26:21) [MSC v.1929 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
>>> for k in range(100, 1000, 1):
    a = k%10 
    b = k%100//10 
    c = k//100 
    if a%2 !=0  and b%2 !=0 and c%2 !=0:
        s = k//10 - b + a
        if k%s == 0:
            print(k)