import numpy as np

x = np.array([1, 2, 3])
y = np.array([2, 4, 6])

theta = 0
alpha = 0.01
epochs = 1000

for _ in range(epochs):
    gradient = np.mean((theta * x - y) * x)  # 미분값
    theta = theta - alpha * gradient

print("학습된 마라미터:", theta)