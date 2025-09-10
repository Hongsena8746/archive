from openai import OpenAI
from dotenv import load_dotenv
import os

load_dotenv()
api_key = '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'
client = OpenAI(api_key=api_key)


response = client.chat.completions.create(
  model="gpt-4o-mini",
  temperature=0.1,
  messages=[
    {"role": "system", "content": "You are a helpful assistant."},
    {"role": "user", "content":"2022년 월드컴 우승팀은 어디야?"},
  ]
)

print(response)

print('----')
print(response.choices[0].message.content)
