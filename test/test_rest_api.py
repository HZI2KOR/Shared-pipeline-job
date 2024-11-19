import requests

def test_api_status():
    url = "https://restful-api.dev/"
    response = requests.get(url)
    assert response.status_code == 200, f"API call failed with status code {response.status_code}"

def test_api_content():
    url = "https://restful-api.dev/"
    response = requests.get(url)
    assert "Welcome" in response.text, "API response did not contain expected content"
