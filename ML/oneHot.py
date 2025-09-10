


import pandas as pd
from sklearn.linear_model import LinearRegression
from sklearn.model_selection import train_test_split
from sklearn.metrics import mean_squared_error

# 데이터 불러오기
df = pd.read_csv('C:/Users/user/Desktop/프로젝트데이터/만족도데이터전처리/노인만족도조사2022_원핫인코딩.csv', encoding='cp949')
# df = pd.read_csv('C:/Users/user/Desktop/프로젝트 데이터/만족도데이터전처리/노인만족도조사2022_정규화.csv', encoding='cp949')

# 타깃 값 (예: 삶의 만족도 점수)를 y로 가정 (사용자에 맞게 선택 필요)
# 예: df['satisfaction_score'] 가 타깃이면 아래처럼 수정
# X는 나머지 모든 컬럼
y = df['A1_1(전체삶 만족도, 타깃 예정)_만족함']  # 예시: 만족함 확률 예측
X = df.drop(columns=['A1_1(전체삶 만족도, 타깃 예정)_만족함'])

# 데이터 분할
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# 모델 훈련
model = LinearRegression()
model.fit(X_train, y_train)

# 예측 및 평가
y_pred = model.predict(X_test)
mse = mean_squared_error(y_test, y_pred)
print(f"평균 제곱 오차(MSE): {mse:.4f}")

