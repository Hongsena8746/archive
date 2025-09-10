import os
from langchain_openai import ChatOpenAI
from langchain_core.messages import HumanMessage,AIMessage, SystemMessage

api_key = os.getenv("OPENAI_API_KEY")

#랭체인에서 사용할 모델을 정의함
llm= ChatOpenAI(
  model="gpt-4o-mini", 
  openai_api_key=api_key)


#{"role":"system","content": "너는 사용자를 도와주는 상담사야."} 초기시스템메세지
messages = [
  SystemMessage("너는 사용자를 도와주는 상담사야.")
]

while True:
  user_input = input("사용자:")

  if user_input == "exit":
    break

  messages.append(
    HumanMessage(content=user_input)
  )  #사용자메세지를 대화기록에 추가

  # ai_response = llm.invoke(messages)  대화기록을 기반으로 AI응답 가져오기
  # messages.append(ai_reponse) AI 응답대화 기록에 추가하기

  # print("AI:" + ai_response.content)

      # AI 응답 생성 (대화 기록 기반)
  ai_response = llm.invoke(messages)
  print("AI:", ai_response.content)

  # 대화 기록에 AI 응답 누적
  messages.append(ai_response)