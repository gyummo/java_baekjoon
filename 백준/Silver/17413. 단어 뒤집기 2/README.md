# [Silver III] 단어 뒤집기 2 - 17413 

[문제 링크](https://www.acmicpc.net/problem/17413) 

### 성능 요약

메모리: 16852 KB, 시간: 208 ms

### 분류

자료 구조, 구현, 스택, 문자열

### 제출 일자

2024년 7월 3일 14:49:56

### 문제 설명

<p style="user-select: auto !important;">문자열 S가 주어졌을 때, 이 문자열에서 단어만 뒤집으려고 한다.</p>

<p style="user-select: auto !important;">먼저, 문자열 S는 아래와과 같은 규칙을 지킨다.</p>

<ol style="user-select: auto !important;">
	<li style="user-select: auto !important;">알파벳 소문자('<code style="user-select: auto !important;">a</code>'-'<code style="user-select: auto !important;">z</code>'), 숫자('<code style="user-select: auto !important;">0</code>'-'<code style="user-select: auto !important;">9</code>'), 공백('<code style="user-select: auto !important;"> </code>'), 특수 문자('<code style="user-select: auto !important;"><</code>', '<code style="user-select: auto !important;">></code>')로만 이루어져 있다.</li>
	<li style="user-select: auto !important;">문자열의 시작과 끝은 공백이 아니다.</li>
	<li style="user-select: auto !important;">'<code style="user-select: auto !important;"><</code>'와 '<code style="user-select: auto !important;">></code>'가 문자열에 있는 경우 번갈아가면서 등장하며, '<code style="user-select: auto !important;"><</code>'이 먼저 등장한다. 또, 두 문자의 개수는 같다.</li>
</ol>

<p style="user-select: auto !important;">태그는 '<code style="user-select: auto !important;"><</code>'로 시작해서 '<code style="user-select: auto !important;">></code>'로 끝나는 길이가 3 이상인 부분 문자열이고, '<code style="user-select: auto !important;"><</code>'와 '<code style="user-select: auto !important;">></code>' 사이에는 알파벳 소문자와 공백만 있다. 단어는 알파벳 소문자와 숫자로 이루어진 부분 문자열이고, 연속하는 두 단어는 공백 하나로 구분한다. 태그는 단어가 아니며, 태그와 단어 사이에는 공백이 없다.</p>

### 입력 

 <p style="user-select: auto !important;">첫째 줄에 문자열 S가 주어진다. S의 길이는 100,000 이하이다.</p>

### 출력 

 <p style="user-select: auto !important;">첫째 줄에 문자열 S의 단어를 뒤집어서 출력한다.</p>

