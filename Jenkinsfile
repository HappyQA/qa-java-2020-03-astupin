pipeline {
    agent any

    tools {
        maven 'Maven3.6.0'
        jdk 'Java8'
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
                    sh "mvn test -Dremote=http://localhost:4444/wd/hub"
                }
            }
        }
    }
    
    post {
        success {
            script {
                emailext to: 'a.stupin@tetra-soft.ru',
                subject: "Test example [Homework 10-11]",
                body: """Чек-чек""",
                mimeType: 'text/html'
            }
        }
    }
}
