@Library('shared-pipeline-library') _

pipeline {
    agent none
    stages {
        stage('Checkout') {
            agent { label 'AutoScaling_EC2' }
            steps {
                checkout scm
            }
        }
        stage('Provision EC2') {
            agent { label 'AutoScaling_EC2' }
            steps {
                script {
                    provisionEC2()
                }
            }
        }
        stage('Install Dependencies') {
            agent { label 'AutoScaling_EC2' }
            steps {
                script {
                    installDependencies()
                }
            }
        }
        stage('Run Tests') {
            agent { label 'AutoScaling_EC2' }
            steps {
                script {
                    runTests()
                }
            }
        }
        stage('Publish Reports') {
            agent { label 'AutoScaling_EC2' }
            steps {
                script {
                    publishReports()
                }
            }
        }
        stage('Email Notification') {
            agent { label 'AutoScaling_EC2' }
            steps {
                script {
                    sendNotification()
                }
            }
        }
    }
}
