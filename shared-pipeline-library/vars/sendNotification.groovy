def call() {
    echo 'Sending email notification...'
    emailext (
        subject: "Jenkins Pipeline Build #${env.BUILD_NUMBER}",
        body: """<p>Pipeline completed successfully.</p>
                 <p>Build details:</p>
                 <ul>
                    <li>Build URL: ${env.BUILD_URL}</li>
                 </ul>""",
        to: 'kiran.shankarmandal@in.bosch.com',
        attachLog: true
    )
}

