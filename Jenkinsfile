#!groovy

properties([[$class: 'RebuildSettings', autoRebuild: false, rebuildDisabled: false],
            parameters([
                    text(defaultValue: '', description: 'Введите Логин', name: 'LOGIN'),
                    text(defaultValue: '', description: 'Введите Пароль', name: 'PASSWORD')
            ])
])

pipeline {
    agent any

    tools {
        maven 'Maven3.6.0'
        jdk 'java8'
    }

    stages {

        stage('Git pull') {
            steps {
                echo "Подпуливаемся из репозитария"
                git 'https://github.com/HappyQA/qa-java-2020-03-astupin'
            }
        }

        stage('Mvn clean') {
            steps {
                echo "Чистим target"
                sh "mvn clean"
            }
        }

        stage('Run test') {
            steps {
                script {
                    echo "Запускаем тесты"
                    //sh "mvn test -Dremote=http://localhost:4444/wd/hub"
                }
            }
        }

        stage('Run allure reports') {
            steps {
                script {
                    echo "Запускаем тесты"
                    //sh "allure:serve"
                }
            }
        }
    }

    post {
        success {
            script {
                def getLastBuild = getResultOfLastBuild()
                def getDuration = getDurationResult()
                emailext to: 'a.stupin@tetra-soft.ru',
                subject: "Test example [Homework 10-11]",
                body: """
                <br>Номер сборки: <b>${BUILD_NUMBER}</b>
                <br>Статус сборки: <b>$getLastBuild</b>  
                <br>Ветка репозитария: <b>${NODE_NAME}</b>
                <br>Количество тестов: <b></b>
                <br>Общее время выполнения job'ы: <b>$getDuration - Unix time</b>""",
                mimeType: 'text/html'
            }
        }
    }
}

def getResultOfLastBuild () {
    return !sh(script: "curl -u ${LOGIN}:${PASSWORD} --silent ${BUILD_URL}/api/json | jq -r '.result'")
}

def getDurationResult() {
    return !sh(script: "curl -u ${LOGIN}:${PASSWORD} --silent ${BUILD_URL}/api/json | jq -r '.duration'")
}