

import pandas as pd
from sklearn.linear_model import LinearRegression
from sklearn.model_selection import train_test_split
from sklearn.metrics import mean_squared_error, r2_score

# CSV 경로
df = pd.read_csv('C:/Users/user/Desktop/프로젝트 데이터/만족도데이터전처리/노인만족도조사2022_satisfaction_score_확장버전.csv', encoding='cp949')

# 타깃과 입력 설정
y = df['satisfaction_score']  # 수정된 부분
X = df.drop(columns=['satisfaction_score', 'A1_1(전체삶 만족도, 타깃 예정)'])  # 함께 제거 추천

# 결측치 제거
X = X.dropna()
y = y.loc[X.index]

# 데이터 분할
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# 모델 학습 및 예측
model = LinearRegression()
model.fit(X_train, y_train)
y_pred = model.predict(X_test)

# 평가
print("MSE:", mean_squared_error(y_test, y_pred))
print("R²:", r2_score(y_test, y_pred))

