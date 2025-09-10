from openai import OpenAI
from dotenv import load_dotenv
import os

load_dotenv()
api_key = os.getenv("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")
client = OpenAI(api_key=api_key)

def get_ai_response(messages):
  response = client.chat.completions.create(
    model="gpt-4o-mini",
    temperature=0.9,
    messages=messages,
  )

  return response.choices[0].message.content

messages=[
    {"role": "system", "content": "너는 사용자를 도와주는 상담사야."},
]

while True:
  user_input=input("사용자:")

  if user_input == "exit":
    break

messages.append=({"role": "system", "content": user_input})
ai_response = get_ai_response(messages)
messages.append({"role": "system", "content": ai_response})

print("AI:" + ai_response)
