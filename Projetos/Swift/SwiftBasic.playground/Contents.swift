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

// Save numbers like 20, 1000, 1, 2342... ->
// Save decimal number like 20.3 -> Double or Float
// Save text like "Hi I'm Chris" -> String


/*
 Type inference
 */

// Do I have to specify the data type in Swift? -> NO
// Why? Because Swift automatically recognizes the data type from the assigment

var gameHighScore = 1000
var username = "Testuser"
let databaseAdress2 = "database12345"
