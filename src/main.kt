fun main(){
    var webEmp=WebDeveloper("Eradh",23,1000.0)
    webEmp.webSite()
    var iosEmp=IOSDeveloper("Hleemah",23,2000.0)
    iosEmp.iosApp()
    var androidEmp=AndroidDeveloper("Hajar",23,3000.0)
    androidEmp.androidApp()
}
open class Employee( var name :String,var age:Int ,var salary: Double){
   open var majors:String="tt"
    //var msg:String="Hi I'm $name \n Iam $age years old \n I am a $majors I have $salary $ salary on the month *_* "

}
class WebDeveloper(name: String,age: Int,salary: Double):Employee(name,age,salary) {
    override var majors ="webdeveloper"
    fun webSite(){
            println("Hi I'm $name \n Iam $age years old \n I am a $majors I have $salary $ salary on the month *_* ")
        } }
class IOSDeveloper(name: String,age: Int,salary: Double):Employee(name,age,salary) {
    fun iosApp(){
    majors ="IOSdeveloper"
        println("Hi I'm $name \n Iam $age years old \n I am a $majors I have $salary $ salary on the month *_* ")}
}
class AndroidDeveloper(name: String,age: Int,salary: Double):Employee(name,age,salary) {
    fun androidApp(){
    majors ="android developer"
        println("Hi I'm $name \n Iam $age years old \n I am a $majors I have $salary $ salary on the month *_* ")
    } }