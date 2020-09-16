
# SchoolSNS

## Android 코딩 규칙

사용 언어 - Kotlin

#### 띄어쓰기 및 코드 정리

- 키워드, 연산자와 다른 코드 사이에 공백이 있어야 한다
- 한 줄에 25자가 넘지 않도록 한다. (한 눈에 보기 쉽게 한다.)
- 접근이 길어질 때는 .앞읖 기준으로 줄을 바꾼다

```kotlin
var a=0 //BAD
var a = 0 //GOOD

~~builder.checker(~~~~~~~~~~~).finish(~~~~~~) //BAD

~~builder
  .checker(~~~~~~~~~~~)
  .finish(~~~~~~) //GOOD
```
#### 명명

- 변수, 함수는 카멜케이스를 사용
- 클래스와 인터페이스의, 추상클래스의 앞글자는 대문자를 사용
- 상수는 전부 대문자로 적고 파스칼케이스를 사용


```kotlin
var helloWorld
fun checkMail()
const var KEY_WORDS
```

#### 변수 타입

- 되도록이면 변수의 타입을 밝힌다.

```kotlin
var checkMail : String
```

#### if문, for문 등

- 한 줄에 끝나는 문은 중괄호 없이 옆에 적는다.
- if문 같은 경우 한 줄로 끝나도 else나 else if가 한 줄이 아니면 중괄호를 쓴다.
- 조건 안의 변수와 연산자마다 뛰어쓰기가 되어있어야 한다.

```kotlin
if(a != b) c = a //GOOD
if(a!=b) c = a //BAD

if(a != b) c = a
else{
  c = b
  b = d
}                 //BAD
if(a != b) {
  c = a
}
else{
  c = b
  b = d
}                 //GOOD
```

#### xml

- xml의 id를 정할때는 (액티비티 이름)_(사용하는 곳 및 뜻이 담긴 이름)_(레이아웃 이름) 으로 정한다.
- text는 sp 단위를 쓴다.
- 큰 이유가 있는 게 아니면 constraintlayout을 사용한다.
- 레이아웃의 크기는 percent를 사용한다.

```xml
android:id="@+id/main_login_btn"
android:id="@+id/login_email_edit"
```

#### 기타

- 액티비티 안에서 순서대로 전역변수, oncreate, 기능적인 함수, 그렇게 중요하지 않은 함수(backpress같은 함수) 순으로 나열
- 주석을 최대한 활용
- 안드로이드 스튜디오는 최신버전을 사용한다. (2020.08.19 기준 4.0.1)
- 코드에 대한 지적은 겸허히 받아들이도록 한다.

### MADE BY NKS0614 (INPOT)
