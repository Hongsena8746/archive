
import numpy as np

# 가중치 초기값 설정
w0 = 1.0 
w1 = 1.0

# 학습률과 반복 횟수 설정
learning_rate = 0.1
num_iterations = 100

# 경사하강법
for t in range(num_iterations):
    # 손실 함수의 가중치에 대한 그래디언트를 계산한다.
    w0_gradient = 4 * w1 + 6 * w0 - 6
    w1_gradient = 4 * w1 + 6 * w0 - 6

    # 가중치 업데이트
    w0 = w0 - learning_rate * w0_gradient
    w1 = w1 - learning_rate * w1_gradient

    # 현재 반복의 가중치 출력한다.
    print(f"반복 {t+1}: w0 = {w0:.6f}, w1 = {w1:.6f}")

# 최종 결과를 출력한다.
print(f"최종결과: w0 = {w0:.6f}, w1 = {w1:.6f}")

