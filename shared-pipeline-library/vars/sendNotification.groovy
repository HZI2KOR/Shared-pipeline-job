def call() {
    echo "Sending email notification..."
    mail to: 'kiran.shankarmandal@in.bosch.com',
         subject: "Build ${currentBuild.currentResult}",
         body: "The build status is ${currentBuild.currentResult}"
}
