def is_prime(num):
    for i in range(2, num):
        if (num % i == 0):
            return False
        return True

def get_score():
    score = []
    aver = 0
    count = 0

    for i in range(5):
        st_sc = int(input('성적을 입력하시오. : '))
        score.append(st_sc)
        aver = aver + st_sc
    
    aver = aver / 5
    print("성적 평균은 {}입니다.".format(aver))

    for i in score:
        if i > 80:
            count = count + 1
    
    print('80점 이상을 받은 학생은 {}명 입니다.'.format(count))
'''
setA = ["철수", "영희", "민수"]
setB = ["철수", "영희", "민수", "민철"]

set_two = setA & setB

print("{}".format(set_two))

dic = {}

dic = {"one":"하나"}

sen = input("단어를 입력하시오. : ")

if sen in dic:
    print(dic["one"])
'''
'''
dic = {"TX":"Thanks", "B4":"Before", "BBL":"Be Back Later", "BCNU":"Be Seeing You", "HAND":"Have A Nice Day"}

sen = input('축약어를 번역할 문장을 입력하시오 : ')

trans = []

words = sen.split()

for word in words:
    if word in dic:
        word = dic[word]
    trans += word + " "

print(''.join(trans))
'''

sen = input('문자열을 입력하시오 : ')

words = sen.split()

acro = []

for word in words:
    acro += word[0]

print(''.join(acro))