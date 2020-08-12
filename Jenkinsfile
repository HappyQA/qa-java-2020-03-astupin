#!groovy

properties([[$class: 'RebuildSettings', autoRebuild: false, rebuildDisabled: false],
            parameters([
                    text(defaultValue: '', description: 'Введите Логин', name: 'LOGIN'),
                    text(defaultValue: '', description: 'Введите Пароль', name: 'PASSWORD')
            ])
])

pipeline {
    agent {
        docker {
            image 'csanchez/selenium-maven'
        }
    }

    stages {

        stage('Run test') {
            steps {
                script {
                    echo "Запускаем тесты"
                    sh "git clone https://github.com/HappyQA/qa-java-2020-03-astupin/"
                    sh "mvn clean test"
                }
            }
        }

        stage('Run allure reports') {
            steps {
                script {
                    echo "Запускаем отчеты"
                    sh "allure:serve"
                }
            }
            post {
                always {
                    junit '**/target/allure-results/TEST-*.xml'
                    achriveArtifacts 'target/*.jar'
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
        always {
            script {
                sendRC(currentBuild.currentResult, "Rigspace", "rigspace")
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

def sendRC(String buildResult, String projectName, String channel) {
    def tokensByChannel = [
            rigspace: 'CM2GTRU0H',
            qa: 'CLXFS4RRR'
    ]
    if  ( buildResult == "SUCCESS" ) {
        slackSend color: "good", channel: tokensByChannel.get(channel), message: "Тесты пройдены"
    }
    else if ( buildResult == "FAILURE" ) {
        slackSend color: "danger", channel: tokensByChannel.get(channel), message: "Тесты НЕ пройдены"
    }
}