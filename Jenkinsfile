pipeline {
    agent any
    tools {
        maven 'Maven'
        allure 'allure'
    }
    stages {
        stage('clone repository') {
            steps {
                deleteDir()
                git branch: 'master', credentialsId: 'gitlab_new', url: 'https://github.com/Antonppavlov/my-first-project-at.git'
            }
        }
        stage('run tests') {
            steps {
                sh "mvn test -Dselenide.browser=chrome -Dselenide.remote=http://192.168.222.191:4444/wd/hub"
            }
        }
        stage('generate allure report') {
            steps {
                allure includeProperties: false, jdk: '', results: [[path: 'target/allure-results']]
            }
        }
    }


    post{
        success {
            script {
                emailext  body: '${SCRIPT, template="allure-report2.groovy"}', subject: "Втб-Онлайн. Запуск тестов. ${BUILD_URL}", to: "appavlov@innotechnum.com, anton.it.pavlov@gmail.com"
            }
        }
        unstable{
            script{
                emailext  body: '${SCRIPT, template="allure-report2.groovy"}', subject: "Втб-Онлайн. Запуск тестов. ${BUILD_URL}", to: "appavlov@innotechnum.com, anton.it.pavlov@gmail.com"
            }
        }
        failure{
            script{
                emailext  body: '${SCRIPT, template="allure-report2.groovy"}', subject: "Втб-Онлайн. Запуск тестов. ${BUILD_URL}", to: "appavlov@innotechnum.com, anton.it.pavlov@gmail.com"
            }
        }
    }
}
