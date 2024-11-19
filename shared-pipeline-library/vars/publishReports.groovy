def call() {
    echo 'Publishing test reports...'
    publishHTML(target: [
        allowMissing: false,
        alwaysLinkToLastBuild: true,
        keepAll: true,
        reportDir: 'tests',
        reportFiles: 'report.xml',
        reportName: 'Test Report'
    ])
}
