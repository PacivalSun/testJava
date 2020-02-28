#!/usr/bib/env python3
# -*- coding:utf-8 -*-

# print('Hello,word!')
# print('sunyichi', 'is', 'leaning', 'python')
# print('100+200=', 100+200)

# name = input('input your name:')
# print('youe name is:', name)

# a = input('input the length of edges:')
# print('area is:', int(a)*int(a))

# print('I\'m \"OK\"')
# print(r'\ ')
# print('''sdafds
# werq.tytt
# yurrt''')
# ord('n')

# print('%2d-%02d' % (3, 1))
# print('%s' % 'wqre')

# list = ['tea', 'juice', 'milk', 'soda']
# print(len(list))
# print(list[1])  # 序号是从零开始的
# print(list[-1])  # -1就是倒数第一个
# list.append('oneMore')
# list.insert(2, '加在第三个')
# print(list)
# list.pop()
# print(list)
# list.pop(1)  # 删第二个
# print(list)

# # 元组
# # 元组初始化后不能修改
# classmates = ('Michael', 'Bob', 'Tracy')
# # 定义空元组，()就可以了
# # 定义单元组元组，要加一个逗号，否则元组会被定义成数,而在显示单元素元组时，也会多显示一个逗号
# t = (1,)
# s = (1)
# print(t, ",", s)
# # 想要tuple可变，可以在里面放一个list，list可变，而tuple始终指向该list即可
# t = ('a', 'b', ['A', 'B'])
# t[2][0] = 'x'
# t[2][1] = 'y'
# print(t)

# # 条件判断
# # 条件后面要加冒号
# age = int(input('Please input your age:'))
# if age > 18:
#     print('your age is', age, '.you are an adult')
# elif age > 14:
#     print('your age is', age, '.you are a teenager')
# else:
#     print('your age is', age, '.you are a boy')

# # for
# names = ['a', 'b', 'c']
# for name in names:
#     print(name)

# list(range(5))
# print(list(range(5)))
# sum = 0
# for i in list(range(101)):
#     sum = sum+i
# print(sum)

# # while
# sum = 0
# n = 99
# while(n > 0):
#     if(n == 55):
#         print('跳过了', n)
#         n = n-2
#         continue
#     sum = sum+n
#     n = n-2
#     if(n < 30):
#         print('n=', n, '时，停止循环')
#         break
# print(sum)

# # dict
# # java中的map概念，是键值对的存储（key-value）
# d = {'Michael': 95, 'Bob': 87, 'Tracy': 100}
# print(d['Michael'])
# # 直接赋值时如果dict中有该key，则直接覆盖，没有则添加
# d['Michael'] = 59
# print(d['Michael'])
# # 判断某个key在不在dict中
# print('Tomas' in d)
# # 当没有该key时输出none或一个自定义的值
# print(d.get('Tomas', 'no_name'))
# # 删除某个键值对
# d.pop('Bob')
# print(d)
# # dict是用空间换时间，占用内存大，但是速度快
# # dict的key必须不可变

# # set
# # {}表示，相比dict，没有value，重复项会被自动过滤，可以看作是无序无重复集合的概念
# # 和dict一样，无法放入可变对象
# # 初始化-用一个list直接赋值，但set内部是无序的
# s = set([1, 2, 3])
# print(s)

# # 不可变对象
# a = 'abc'
# print(a.replace('a', 'A'))
# print(a)
# # str是不可变对象，对其使用replace也只是在输出的时候输出了另一个暂时存在的字符串，而a指向的'abc'是没有改变的
