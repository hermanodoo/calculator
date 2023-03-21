# Object Oriented Calculator

## Objects Needed

###1. Menu
	- let's user choose either
		(1) View History
		(2) Calculation
		(3) Exit Program

###2. Operation
	- 연산자들만 들은 ArrayList와 숫자만 들은 ArrayList를 갖고 계산을 실시한다
	numbers : [0 1 2 3 4 5 6 ...]
	operator [0 1 2 3 4 5 6 ...]
	=> 먼저 "*" 와 "/"인 연산자를 찾아서 그 인덱스 기준 numbers에서  i - 1과 i + 1에 해당되는 값들을 연산해준다
	=> 연산된 값을 누적시켜줄 누산기가 필요하다
	for문을 각각 ( + , - / 따로 * , / 따로 ) 구성해 실시한다
	- switch로 보기 좋게 만든다 ( 연산할 것들을)

###3. Database
	- uses ArrayList<String>로 각 식을 문자열 상태로 저장한다
	- addAnswerToEquation으로 연산의 결과를 식 문자열에 더해준다
	- getHistory() 함수를 통해 이렇게 저장된 문자열들을 각 줄에 입력하여 한꺼번에 출력한다

###4. EquationConverter
	- 입력된 문자열을 공백 기준으로 ArrayList로 변환해준다
	- 이렇게 구한 공식 전체를 숫자만 따로, 연산자만 따로 출력해 각각의 ArrayList를 만들어 준다


###5. EquationFormatChecker(ArrayList<Integer> numbers, ArrayList<String> operators) 
	- checks equation's format
		- numbers 또는 operators가 비어있지 않은지
		- 두 ArrayList들의 길이의 합이 3 이상 그리고 2의 배수가 맞는지
		- operators ArrayList에서의 값들이 +, -, *, / 에 포함되는지
