Python 3.9.6 (tags/v3.9.6:db3ff76, Jun 28 2021, 15:26:21) [MSC v.1929 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
>>> for k in range(100, 1000, 1):
    a = k*k % 10
    b = k*k %100//10
    c = k*k //100%10
    if a == b and b == c and a == c and c!= 0 and b!= 0 and a!= 0:
        print(k)
    