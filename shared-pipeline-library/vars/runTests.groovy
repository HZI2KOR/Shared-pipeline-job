def call() {
    echo "Running Pytest..."
    sh '''
    source venv/bin/activate
    pytest tests/test_rest_api.py --maxfail=1 --disable-warnings -q
    '''
}
