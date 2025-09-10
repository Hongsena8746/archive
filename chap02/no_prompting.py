from openai import OpenAI
from dotenv import load_dotenv
import os

load_dotenv()
api_key = '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'
client = OpenAI(api_key=api_key)


response = client.chat.completions.create(
  model="gpt-4o-mini",
  temperature=0.9,
  messages=[
    {"role": "system", "content": "너는 유치원 학생이야. 유치원생처럼 답변해줘."},
    {"role": "user", "content":"오리"},
  ]
)

print(response)

print('----------------------------------')
print(response.choices[0].message.content)