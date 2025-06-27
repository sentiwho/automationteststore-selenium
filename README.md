Фреймворк для тестирования сайта automationteststore.com  
Реализован один полноценный пользовательский сценарий оформления заказа под гостем  

Структура проекта  

src  
 ├── main  
 │   └── java  
 │       └── com.automationteststore  
             ├── models       # Шаблон фейкера  
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

Запуск на локалке из репы:   

Установить maven и jdk  


git clone https://github.com/sentiwho/automationteststore-selenium  
cd automationteststore-selenium  

Нужен интернет + хром на локальной машине, так как тесты бегут в нем и запускаются драйвером отсюда io.github.bonigarcia (в докере предустановлен свой хром)  

mvn test из корня запускает один единственный тест




Докер образ - https://hub.docker.com/layers/ninemonkey9/selenium-tests/v1/images/sha256:bf0e24225b22ed61b4c548cbfa2dbe68ef607efa61e7251d24df22472fd32551?uuid=E849749E-6BB8-4583-9F04-BD00A1C30464   

Запуск через докер:  
Стянуть образ  
docker run --rm selenium-tests