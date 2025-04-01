require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Привет! 👋 Я — виртуальный помощник Ак Барс Банка. 💳✨  
        a: Готов помочь с любым вопросом — просто напишите, что вас интересует! 😊  

    state: Hello
        intent!: /привет
        a: Привет привет

    state: Bye
        intent!: /пока
        a: Пока пока
        
    state: Call
        intent!: /Перезвонить
        a: Перезвони сюда:        

    state: KnowledgeBase
        intentGroup!: /KnowledgeBase
        a: Нашёл ответ в базе знаний!
        script: $faq.pushReplies();

    state: NoMatch
        event!: noMatch
        a: Подключаю оператора...
