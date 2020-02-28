# 自定义一个函数
def my_abs(x):
    if not isinstance(x, (int, float)):
        # 抛出一个错误
        raise TypeError('bad operand type')
    if x > 0:
        return x
    else:
        return -x


# print(my_abs(-3))
# print(my_abs('sda'))


def nothing():
    pass
# 当还没想好这个函数干什么的时候可以写个pass让代码不报错
