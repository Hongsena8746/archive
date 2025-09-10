from openai import OpenAI
from dotenv import load_dotenv
import os

load_dotenv()
api_key = os.getenv("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")
client = OpenAI(api_key=api_key)

while True:
  user_input=input("사용자:")

  if user_input == "exit":
    break

response = client.chat.completions.create(
  model="gpt-4o-mini",
  temperature=0.9,
  messages=[
    {"role": "system", "content": "너는 사용자를 도와주는 상담사야."},
    {"role": "user", "content":user_input},
  ],
)

print("AI:" + response.choices[0].message.content)

