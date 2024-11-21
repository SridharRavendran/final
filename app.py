from flask import Flask
app=Flask(_name__)
@app.route(‘/’)
def main():
 Return ‘hello from flask app’
If __name__=="__main__":
  app.run(host=‘0.0.0.0’)
