Python 3.9.6 (tags/v3.9.6:db3ff76, Jun 28 2021, 15:26:21) [MSC v.1929 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
>>> a = int(input())
b = int(input())
if a>199:
    if a>299:
        if b>199:
            print('1')
        else:
            print('2')
    else: 
        if b<199:
            print('3')
        else:
            print('1')
else: 
    if b>299:
        print('2')
    else:
        print('3')
