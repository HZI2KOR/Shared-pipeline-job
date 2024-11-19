def call() {
    echo "Publishing test reports..."
    junit '**/test-*.xml'  // Assuming pytest generates reports in JUnit XML format
}
