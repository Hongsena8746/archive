import streamlit as st
from openai import OpenAI
from dotenv import load_dotenv
import os

load_dotenv()

api_key = os.getenv("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")
st.title("Chatbot")


if "messages"not in st.session_state:
  st.session_state["messages"]=[{"role": "system", "content":"How can I help you?"}]

for msg in st.sessin_state.messages:
  st.chat_message(msg["rol"]).write(msg["content"])

if prompt:= st.chat_input():
  if not openai_api_key:
    st.info("Please add your OpenAI API key to continue.")
    st.stop()


client = OpenAI(api_key=api_key)
st.session_state.messages.append({"role":"user","content":prompt})
st.chat_message("user").write(prompt)
response = client.chat.completions.create(model="gpt-4o-mini",messages=st.session_state.messages)
msg = response.choices[0].message.content
st.session_state.messages.append({"role":"user","content":msg})
st.chat_message("assistant").write(msg)    
  

  