#!/bin/bash

#Переменая в которой хранится путь к директории тестов
testdirectory=/home/happyqa/work/repo/qa-java-2020-03-astupin
#Переменая для порта Selenoid & Selenoid-UI
portSelenoid=4444
portSelenoidUI=8080

echo "Где я нахожусь: $HOME"
echo "Кто я: $USER"
echo "Установка Selenoid + Selenoid-UI"
curl -s https://aerokube.com/cm/bash | bash 
echo "Установка завершена"
echo "Запуск Selenoid"
./cm selenoid start --port $portSelenoid
ps ux | grep selenoid
netstat -nltp | grep $portSelenoid
echo "Seledond использует дефолтный порт:$portSelenoid"
echo "Запуск Selenoid-UI"
./cm selenoid-ui start --port $portSelenoidUI
ps ux | grep selenoid-ui
netstat -nltp | grep $portSelenoidUI
echo "Selenoid UI использует дефолтный порт:$portSelenoidUI"
echo "Проверка двух контейнеров"
docker ps
echo "Переключение в директорию тестов"
cd $testdirectory
echo "Выполнение тестов в Хроме на порту $portSelenoid"
mvn test -Dremote=http://localhost:$portSelenoid/wd/hub/
echo "Тесты выполнены"

