print('--------------------------')
# from function import my_abs
# import math

# # import时会把function.py中的print也执行一次
# print(my_abs(-23))

# # 定义默认参数时，默认参数必须指向不变对象


# def move(x, y, step, angle=0):
#     nx = x+step*math.cos(angle)
#     ny = y-step*math.sin(angle)
#     return nx, ny
#     # 这里返回的其实是一个tupe，他可以被一个变量接收，也可以被多个变量接收，此时就一一对应着赋值


# def add_end(L=None):
#     # 想要让默认参数指向可变对象，用None替代，在函数中再判断有没有手动传值，没有则赋成想要的可变对象
#     if L is None:
#         L = []
#     L.append('end')
#     return L


# print(move(100, 100, 60, math.pi/6))


# def calc(*numbers):
#     # 定义变量的时候加个星号就可以传入随意个数的数了
#     sum = 0
#     for i in numbers:
#         sum = sum+i**2
#     return sum


# # 调用时如果以有一个可变参数，直接作为变量传入函数
# num = [1, 2, 3]
# print(calc(*num))


def person(name, age, **kw):
    print('name:', name, 'age:', age, 'other:', kw)


person('Michael', 30)
print('--------------------------')
