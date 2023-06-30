# class py_solution:
#     def int_to_Roman(self, num):
#         val = [
#             1000, 900, 500, 400,
#             100, 90, 50, 40,
#             10, 9, 5, 4,
#             1
#             ]
#         syb = [
#             "M", "CM", "D", "CD",
#             "C", "XC", "L", "XL",
#             "X", "IX", "V", "IV",
#             "I"
#             ]
#         roman_num = ''
#         i = 0
#         while  num > 0:
#             for _ in range(num // val[i]):
#                 roman_num += syb[i]
#                 num -= val[i]
#             i += 1
#         return roman_num


# print(py_solution().int_to_Roman(1))
# print(py_solution().int_to_Roman(4000))


a=0
while a==0:
   def solve(num):
      res = ""
      table = [
         (1000, "M"),
         (900, "CM"),
         (500, "D"),
         (400, "CD"),
         (100, "C"),
         (90, "XC"),
         (50, "L"),
         (40, "XL"),
         (10, "X"),
         (9, "IX"),
         (5, "V"),
         (4, "IV"),
         (1, "I"),
         ]
      for cap, roman in table:
         d, m = divmod(num, cap)
         res += roman * d
         num = m

      return res

   num = int(input("Enter your number :"))
   print("your roman nuber : ",solve(num))
   print("")
   s=input("Again ?(Type 'y' for yes and 'n' for no): ")
   print("")
   if(s=='y'):
      pass
   else:
      a+=1
      print("Thanks")
   




