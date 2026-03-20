from flask import Flask

app = Flask(__name__)

@app.route('/')
def home():
    return "Hospital Management System Running in Docker 🚀"

@app.route('/about')
def about():
    return "This is DevOps Practical 8 Project"

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000)
