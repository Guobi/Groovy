import groovy.json.JsonBuilder

def userId = 12
def age = 20 //For example
def email = "abc@xyz.com"

def json = new JsonBuilder()
def root = json userId: userId, age: age, email: email

print json.toString() //{"userId":12,"age":20,"email":"abc@xyz.com"}
