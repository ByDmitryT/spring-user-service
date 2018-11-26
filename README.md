# Spring user service

## Описание
REST Сервис по хранению и управлению учетными записями
пользователей (добавление, удаление и поиск по email), отвечающий следующим
требованиям:
    - данные пользователя хранятся в виде: Фамилия, Имя, Дата рождения, email и
пароль
    - пароль пользователя хранится в безопасной форме
    - используется InMemory реализация базы данных (т.е. данные хранятся в памяти)
    - приложение реализовано на Java 8 с использованием Spring Boot

## Инструкция по запуску:
1. Склонировать репозиторий: git clone https://github.com/ByDmitryT/spring-user-service.git
2. Перейти в папку с проектом: cd spring-user-service
3. mvn spring-boot:run

## Примеры запросов

1. Добавление пользователя:

curl --header "Content-Type: application/json" \\\
 --request POST \\\
 --data '{"lastName":"pupkin", "firstName":"bob", "birthday": "1990-10-18", "email": "bob@yandex.ru", "password":"12345"}' \\\
 http://localhost:8080/user
 
2. Удаление пользователя:

curl --request DELETE \\\
 http://localhost:8080/user/1
 
3. Поиск пользователя по email:

curl http://localhost:8080/user/bob@yandex.ru
