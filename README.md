Фреймворк для тестирования сайта automationteststore.com
Реализован один полноценный пользовательский сценарий оформления заказа под гостем

Структура проекта

src
 ├── main
 │   └── java
 │       └── com.automationteststore
             ├── models       # Фейкер
 │           ├── base         # Базовый класс (beforeeach и aftereach)
 │           ├── pageobjects  # Page Object`ы
 │           └── utils        # Утилиты
 └── test
     └── java
         └── com.automationteststore
             └── tests        # тут тесты

Зависимости находятся в pom.xml
Дублирую сюда

Selenium 4.20.0

JUnit 5.10.2

JavaFaker 1.0.2

WebDriverManager 5.8.0

Maven Surefire Plugin 3.2.5 

Писалось и запускалось на 24.х Джаве