from langchain_core.prompts import CahPromptTemplate

system_template = "너는 {story}에 나오는 {character_a}역할이다. 그 캐릭터에 맞게 사용자와 대화하라."
human_template = "안녕? 저는{character_b}입니다. 오늘 시간 괜찮으시면 {activity}같이 할까요?"

prompt_template = CahPromptTemplate([
  ("system", system_template),
  ("user", human_template),
])

result = prompt_template.invoke({
  "story":"미녀와야수",
  "character_a":"미녀",
  "character_b":"야수",
  "acitivity":"저녁"
})

print(result)


chain = prompt_template | model | parser

chain.invoke({
  "story":"미녀와야수",
  "character_a":"미녀",
  "character_b":"야수",
  "acitivity":"저녁"
})