# 虚拟考试系统的分层架构实现

### 运行

```bash
./gradlew run
```

浏览器中打开 http://localhost:8080 即可



### 说明

目前仅有 paper,blankQuiz 部分



### 现有操作

| 功能          | Method | URI               |
| ------------- | ------ | ----------------- |
| 获取所有paper | GET    | /papers           |
| 组卷          | POST   | /papers           |
| 重新组卷      | PUT    | /papers/:paper_id |



| 功能          | Method | URI               |
| ------------- | ------ | ----------------- |
|  删除题库 | DELETE    | /blank-quiz           |
| 新增题库          | POST   | /blank-quiz           |
| 更新题库      | PUT    | /blank-quiz |