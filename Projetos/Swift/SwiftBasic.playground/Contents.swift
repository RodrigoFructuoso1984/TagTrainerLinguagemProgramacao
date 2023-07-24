import UIKit
/*
var greeting = "Hello, playground"
*/

// var -> variable -> because the value can be changed
// let -> constant -> the value can not be changed, after the assigment

var str = "Hello, playground"
print(str)
str = "Hello!"
print(str)

var fisrtName = "john"
var email = "john@gmail.com"
var password = "1234"

email = "john@work.com"
password = "lsdoii234"
var lifePoint = 100
lifePoint = 80
var lifeCount = 3
lifeCount = 2
lifeCount = 1
var playerImage = "Image of Spaceship"

let databaseAdress = "database123"

/*****************
     data type
 ************************/

// What is a data type? -> specifies the type of information in a variable / constant
var number: Int = 100
let numbers2: Int = 200
// Save numbers like 20, 1000, 1, 2342... ->
// Save decimal number like 20.3 -> Double or Float
// Save text like "Hi I'm Chris" -> String


/*
 Type inference
 */

// Do I have to specify the data type in Swift? -> NO
// Why? Because Swift automatically recognizes the data type from the assigment

var gameHighScore = 1000 // Because of the number it will be the data type assignment
var username = "Testuser"
let databaseAdress2 = "database12345" // This is a String because of the " "

/*
 comments
 */

// -> line comment

/*
 more then onel live comment
 */

/*
 tipps
 */

// variable names can only appear once -> You CAN'T USE A VARIABLE / CONSTANT NAME TWICE
var user = 1
var userTwo = 10
var userThree = 20

// use camelCase Notation
var restartAlertBoxInSecondWindow = "return"
var categoryTag = 0
let backGroundColor = "Red"

/*
 func
 */

// What is a function?
// A function always has a task / job

func nameOfTheFunction(){
    //function block
    print("Check the password and email")
    print("Login")
    print("Load the new posts")
    print("Show the new posts")
}

nameOfTheFunction()

func postATextPost(){
    print("Some Text")
}

postATextPost()

func createEnemyPlayer() {
    print("Create Enemy")
}

createEnemyPlayer()
createEnemyPlayer()
createEnemyPlayer()
createEnemyPlayer()
createEnemyPlayer()

func checkLogin(email: String, password: String) { // String -> the data type for text
    print("Check the login")
    if (email == "john@gmail.com" && password == "1234") {
        print("Login")
    } else {
        print("Email or password are wrong")
    }
}

checkLogin(email: "john@gmail.com", password: "12345")

// Why use a function?
// DRY - Don't repeat yourself
var enemy1 = "enemyPlayer1"
var enemy1LifePoint = 3
var enemy2 = "enemyPlayer1"
var enemy2LifePoint = 3
var enemy3 = "enemyPlayer1"
var enemy3LifePoint = 3
var enemy4 = "enemyPlayer1"
var enemy4LifePoint = 3
var enemy5 = "enemyPlayer1"
var enemy5LifePoint = 3
var enemy6 = "enemyPlayer1"
var enemy6LifePoint = 3

func createBlueEnemyPlayer() {
    var lifePoint = 100
    print("Create blue Enemy player with \(lifePoint)")
}

createBlueEnemyPlayer()

for index in 1...10 {
    // loop block
    createBlueEnemyPlayer()
}

for index in 1...100 {
    createBlueEnemyPlayer()
}

