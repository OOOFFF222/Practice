'''import turtle as t

while True: 
    inp = input("왼쪽 또는 오른쪽 입력 : ")
    if inp == "left":
        t.left(60)
        t.forward(50)
    elif input == "right":
        t.right(60)
        t.forward(50)

'''
'''
st = input("문자열을 입력하시오 : ")
if(len(st) % 2 == 0):
    print("가운데 글자 : {}".format(st[len(st)/2]))
else:
    print("가운데 글자 : {} {}".format(st[len(st)//2], st[len(st)//2 + 1]))
'''
'''
n1 = float(input("평점을 입력하시오. : "))
n2 = int(input("이수한 학점 수를 입력하시오. : "))

if(n1>=2.0 and n2>=140):
    print("졸업이 가능합니다.")
else:
    print("졸업이 힘듭니다.")
'''
'''
user_name = ['김철수', '홍길동', '김영희']
na = input("유저 이름을 입력하시오. : ")

if(na in user_name):
    pa = int(input("비밀번호를 입력하시오. : "))
    if(pa == 12345678):
        print("로그인")
    else:
        print("비밀번호가 맞지 않습니다.")
else:
    print("알 수 없는 사용자입니다.")
'''
'''
x1 = int(input("첫번째 점의 x 좌표 : "))
y1 = int(input("첫번째 점의 y 좌표 : "))
x2 = int(input("두번째 점의 x 좌표 : "))
y2 = int(input("두번째 점의 x 좌표 : "))

m = (y2 - y1)/(x2 - x1)

q = y1 - m*x1

print("직선의 방정식 : y = {}x + {}{}".format(m, q*m)
'''
'''
import turtle as t

for i in range(0, 6):
    t.forward(50)
    t.right(60)

t.done()
'''
'''
import turtle as t
for j in range(0, 3):
    t.left(20)
    for i in range(0, 4):
        t.forward(50)
        t.left(90)
        
    

t.done()
'''
'''
num = int(input("배수 확인 범위 입력 : "))
mul = int(input("원하는 배수 값 : "))
count = 0

for i in range(num):
    if(mul * i <= num):
        count = count + 1

print("0부터 {} 사이의 모든 {}의 배수의 갯수는 {}이다.".format(num, mul, count))
'''
'''
le = int(input("한 변의 최대 길이 입력 : "))
le_li = list()

for i in range(1, le+1):
    for j in range(1, le+1):
        for k in range(1, le+1):
            if(i**i + j**j == k**k):
                le_li.append([i, j, k])


set(le_li)

list(le_li)

print(le_li)
'''

st = input("문자열을 입력하시오. : ")
wo = ""

for str in st:
    if(str.isupper):
        wo = str.upper()
    elif(str.islower):
        wo = str.lower()

print(wo)