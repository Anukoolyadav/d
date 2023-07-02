# a,b,c=int(input("a is : ")),int(input("b is : ")),int(input("c is : "))

a,b,c=input().split(" ")
print("average is : "+str((int(a)+int(b)+int(c))//3))
print(f"average is : {(int(a)+int(b)+int(c))/3}")